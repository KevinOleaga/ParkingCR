package methods;

import GetDateTime.DateTime;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import project.frmError;
import project.frmSuccess;
import project.frmWarning;

/**
 * @author Kevin Oleaga Garcia
 * @email oleaga@outlook.com
 * @version 1.0
 */
public class cls_methods {

    public static boolean msgControl = false;
    public static boolean ShowListControl = false;

    //-------------------------------------------------------------------------- DBA Settings
    String Host = "localhost";
    String User = "DBA_PARKING";
    String Password = "DBA_PARKING";

    String Url = "jdbc:oracle:thin:@" + Host + ":1521:XE";
    String Controller = "oracle.jdbc.OracleDriver";

    //-------------------------------------------------------------------------- Connection
    public Connection Connect() {
        Connection cn = null;
        try {
            Class.forName(Controller);
            cn = DriverManager.getConnection(Url, User, Password);
        } catch (Exception ex) {
            Error("Error 001: Ha ocurrido un problema al establecer \nla conexión con la base de datos. \nSi el problema persiste contacte al administrador.");
        }
        return cn;
    }

    //-------------------------------------------------------------------------- Tools
    public void Success(String data) {
        if (msgControl == false) {
            new frmSuccess(data).setVisible(true);
            msgControl = true;
        }
    }

    public void Warning(String data) {
        if (msgControl == false) {
            new frmWarning(data).setVisible(true);
            msgControl = true;
        }
    }

    public void Error(String data) {
        if (msgControl == false) {
            new frmError(data).setVisible(true);
            msgControl = true;
        }
    }

    public String Capitalize(String data) {
        return data.substring(0, 1).toUpperCase() + data.substring(1).toLowerCase();
    }

    //-------------------------------------------------------------------------- Functions
    public byte FN_Login01(String user) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_LOGIN01(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, user);
            cs.execute();
            switch (cs.getInt(1)) {
                case 1:
                    exist = 1;
                    break;
                default:
                    Warning("Usuario invalido. \nPor favor verifiquelo e intentelo nuevamente.");
                    exist = 0;
                    break;
            }

            cs.close();
        } catch (Exception ex) {
            Error("Error 002: Ha ocurrido un problema al validar el usuario. \nSi el problema persiste contacte con el administrador.");
        }
        return exist;
    }

    public byte FN_Login02(String user, String password) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_LOGIN02(?,?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, user);
            cs.setString(3, password);
            cs.execute();
            switch (cs.getInt(1)) {
                case 1:
                    exist = 1;
                    break;
                default:
                    Warning("Contraseña invalida. \nPor favor verifiquela e intentelo nuevamente.");
                    exist = 0;
                    break;
            }

            cs.close();
        } catch (Exception ex) {
            Error("Error 003: Ha ocurrido un problema al validar la contraseña. \nSi el problema persiste contacte con el administrador.");
        }
        return exist;
    }

    public int FN_GetRole(String user, String password) {
        int ID_Role = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_GETROLE(?,?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, user);
            cs.setString(3, password);
            cs.execute();

            ID_Role = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 004: Ha ocurrido un error al verificar el rol del usuario. \nSi el problema persiste contacte con el administrador.");
        }
        return ID_Role;
    }

    public int FN_CountTrucks() {
        int n = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_CountTrucks() }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.execute();
            n = cs.getInt(1);

            cs.close();
        } catch (Exception ex) {
            Error("Error 005: Ha ocurrido un error al verificar la \ncantidad de camiones. \nSi el problema persiste contacte al administrador.");
        }
        return n;
    }

    public int FN_CountCars() {
        int n = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_CountCars() }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.execute();
            n = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 006: Ha ocurrido un error al verificar la \ncantidad de vehiculos. \nSi el problema persiste contacte al administrador.");
        }
        return n;
    }

    public int FN_CountMotorcycles() {
        int n = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_CountMotorcycles() }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.execute();
            n = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 007: Ha ocurrido un error al verificar la \ncantidad de motocicletas. \nSi el problema persiste contacte al administrador.");
        }
        return n;
    }

    public int FN_GetDailyPrice(String TYPEVEHICLE) {
        int price = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_GET_DAILYPRICE(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, TYPEVEHICLE);
            cs.execute();
            price = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 007: Ha ocurrido un error al verificar la \ncantidad de motocicletas. \nSi el problema persiste contacte al administrador.");
        }
        return price;
    }

    public int FN_GetNightlyPrice(String TYPEVEHICLE) {
        int price = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_GET_NIGHTLYPRICE(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, TYPEVEHICLE);
            cs.execute();
            price = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 007: Ha ocurrido un error al verificar la \ncantidad de motocicletas. \nSi el problema persiste contacte al administrador.");
        }
        return price;
    }

    //-------------------------------------------------------------------------- Stored Procedures
    public String SP_NewVehicle(String ID_VEHICLE, String TYPETICKET, String TYPEVEHICLE, String USERNAME) {

        String status = null;
        String DATE = new DateTime().GetFullDate();
        String TIME = new DateTime().Get24hFullTime();

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_NEWVEHICLE(?,?,?,?,?,?,?) }");
            cs.registerOutParameter(7, Types.VARCHAR);
            cs.setString(1, ID_VEHICLE);
            cs.setString(2, TYPEVEHICLE);
            cs.setString(3, TYPETICKET);
            cs.setString(4, DATE);
            cs.setString(5, TIME);
            cs.setString(6, USERNAME);
            cs.execute();
            status = cs.getString(7);
            cs.close();

            switch (status) {
                case "PARTNER":
                    printEntrance(ID_VEHICLE, "SOCIO", TYPEVEHICLE, DATE, new DateTime().ConvertTo12h(TIME));
                    break;
                case "OK":
                    switch (TYPETICKET) {
                        case "RENTA DIARIA":
                            printDailyRent(ID_VEHICLE, TYPETICKET, TYPEVEHICLE, DATE, new DateTime().ConvertTo12h(TIME));
                            break;
                        case "CLIENTE CASUAL":
                            printEntrance(ID_VEHICLE, TYPETICKET, TYPEVEHICLE, DATE, new DateTime().ConvertTo12h(TIME));
                            break;
                    }
                    break;
            }
        } catch (Exception ex) {
            Error(ex + ex.getMessage() + "Error 012: Ha ocurrido un error al ingresar un \nnuevo vehículo en el sistema. \nSi el problema persiste contacte al administrador.");
        }
        return status;
    }

    //-------------------------------------------------------------------------- Tickets    
    public void printEntrance(String ID_VEHICLE, String TYPETICKET, String TYPEVEHICLE, String DATE, String TIME) {
        ArrayList<String> data = new ArrayList<>(3);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GET_CONFIGTICKET(?,?,?) }");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();

            for (int i = 1; i < 4; i++) {
                data.add(cs.getString(i));
            }

            cs.close();

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/reports/rp_CasualRent.jasper");

            Map parameters = new HashMap();
            parameters.put("NAME", data.get(1));
            parameters.put("ID_PARKING", "Céd. Jurídica: " + data.get(0));
            parameters.put("TELEPHONE", "Teléfono: " + data.get(2));

            parameters.put("TYPETICKET", TYPETICKET);
            parameters.put("DATE", DATE);
            parameters.put("TIME", TIME);
            parameters.put("PLATE", ID_VEHICLE);
            parameters.put("TYPE", Capitalize(TYPEVEHICLE));
            parameters.put("PRINT", "Impreso el " + DATE + " a las " + TIME);

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperPrintManager.printReport(print, false);           
        } catch (Exception ex) {
            new frmError(ex.toString()).setVisible(true);
        }
    }

    public void printDailyRent(String ID_VEHICLE, String TYPETICKET, String TYPEVEHICLE, String DATE, String TIME) {        
        int PAYMENT = 0;
        String TYPE = null;
        String END_RENT = null;
        String VALID_UNTIL = null;
        ArrayList<String> data = new ArrayList<>(3);
        int hour = Integer.parseInt(new DateTime().ConvertTo24h(TIME).substring(0,2));
        
        if (hour >= 6 && hour <= 8) {
            VALID_UNTIL = "Válido hasta: " + DATE + " a las " + END_RENT;
            TYPE = "RENTA DIARIA";
            PAYMENT = FN_GetDailyPrice(TYPEVEHICLE);
        }
        else{            
            TYPE = "RENTA NOCTURNA";
            PAYMENT = FN_GetNightlyPrice(TYPEVEHICLE);
            if (Integer.parseInt(DATE.substring(0, 2)) < 10) {
                VALID_UNTIL = "Válido hasta: " + "0" + (Integer.parseInt(DATE.substring(0, 2))+1) + "/" +  DATE.substring(3) +" a las 06:00 am";
            }
            else{
                VALID_UNTIL = "Válido hasta: " + (Integer.parseInt(DATE.substring(0, 2))+1) + DATE.substring(3) +" a las 06:00 am";
            }
        }
            
        
        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GET_CONFIGTICKET(?,?,?) }");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();

            for (int i = 1; i < 4; i++) {
                data.add(cs.getString(i));
            }

            cs.close();
            
            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/reports/rp_DailyRent.jasper");

            Map parameters = new HashMap();
            parameters.put("NAME", data.get(1));
            parameters.put("ID_PARKING", "Céd. Jurídica: " + data.get(0));
            parameters.put("TELEPHONE", "Teléfono: " + data.get(2));

            parameters.put("TYPETICKET", TYPE);
            parameters.put("VALID_UNTIL", VALID_UNTIL);
            parameters.put("DATE", DATE);
            parameters.put("TIME", TIME);
            parameters.put("PLATE", ID_VEHICLE);
            parameters.put("TYPE", Capitalize(TYPEVEHICLE));
            parameters.put("PAYMENT", "₡ " + PAYMENT);
            parameters.put("PRINT", "Impreso el " + DATE + " a las " + TIME);

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperPrintManager.printReport(print, false);
        } catch (Exception ex) {
            new frmError(ex.toString()).setVisible(true);
        }
    }

    
    
    
    
    
    
    
//-------------------------------------------------------------------------- Views
    public void VI_GetVehicles(JTable tableName) {
        try {
            PreparedStatement st = Connect().prepareStatement("SELECT * FROM VI_GETVEHICLES");
            ResultSet rs = st.executeQuery();
            tableName.setModel(DbUtils.resultSetToTableModel(rs));

            int columns = rs.getMetaData().getColumnCount();
            TableAlignment(tableName, columns);

        } catch (Exception ex) {
            frmError frmError = new frmError("Error 008: Ha ocurrido un error al verificar la \ncantidad de vehículos. \nSi el problema persiste contacte al administrador.");
            frmError.setAlwaysOnTop(true);
            frmError.setVisible(true);
        }
    }

    public void VI_GetVehiclesByType(JTable tableName, String Type) {
        if (Type == "Todos") {
            VI_GetVehicles(tableName);
        } else if (Type == "Camiones") {
            try {
                PreparedStatement st = Connect().prepareStatement("SELECT * FROM VI_GETVEHICLES WHERE \"Tipo de vehiculo\" LIKE '%Camión%'");
                ResultSet rs = st.executeQuery();
                tableName.setModel(DbUtils.resultSetToTableModel(rs));

                int columns = rs.getMetaData().getColumnCount();
                TableAlignment(tableName, columns);

            } catch (Exception ex) {
                frmError frmError = new frmError("Error 009: Ha ocurrido un error al verificar la \ncantidad de camiones. \nSi el problema persiste contacte al administrador.");
                frmError.setAlwaysOnTop(true);
                frmError.setVisible(true);
            }
        } else if (Type == "Automóviles") {
            try {
                PreparedStatement st = Connect().prepareStatement("SELECT * FROM VI_GETVEHICLES WHERE \"Tipo de vehiculo\" LIKE '%Automóvil%'");
                ResultSet rs = st.executeQuery();
                tableName.setModel(DbUtils.resultSetToTableModel(rs));

                int columns = rs.getMetaData().getColumnCount();
                TableAlignment(tableName, columns);

            } catch (Exception ex) {
                frmError frmError = new frmError("Error 010: Ha ocurrido un error al verificar la \ncantidad de automóviles. \nSi el problema persiste contacte al administrador.");
                frmError.setAlwaysOnTop(true);
                frmError.setVisible(true);
            }
        } else if (Type == "Motocicletas") {
            try {
                PreparedStatement st = Connect().prepareStatement("SELECT * FROM VI_GETVEHICLES WHERE \"Tipo de vehiculo\" LIKE '%Motocicleta%'");
                ResultSet rs = st.executeQuery();
                tableName.setModel(DbUtils.resultSetToTableModel(rs));

                int columns = rs.getMetaData().getColumnCount();
                TableAlignment(tableName, columns);

            } catch (Exception ex) {
                frmError frmError = new frmError("Error 011: Ha ocurrido un error al verificar la \ncantidad de motocicletas. \nSi el problema persiste contacte al administrador.");
                frmError.setAlwaysOnTop(true);
                frmError.setVisible(true);
            }
        }
    }

    //-------------------------------------------------------------------------- Tools
    public void TableAlignment(JTable tableName, int columns) {
        // HEADER
        TableCellRenderer rendererFromHeader = tableName.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);

        // BODY
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < columns; i++) {
            tableName.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    public void printShowList() {
        try {
            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/reports/ShowList.jasper");

            JasperPrint print = JasperFillManager.fillReport(report, null, Connect());
            JasperPrintManager.printReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //-- TOOLS
    DefaultTableModel dm;

    public void TableFilter(JTable tableName, String data) {
        dm = (DefaultTableModel) tableName.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        tableName.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(data));
    }
    
    public long difDiasEntre2fechas(int Y1, int M1, int D1, int Y2, int M2, int D2) {
        java.util.GregorianCalendar date = new java.util.GregorianCalendar(Y1, M1, D1);
        java.util.GregorianCalendar date2 = new java.util.GregorianCalendar(Y2, M2, D2);
        long difms = date2.getTimeInMillis() - date.getTimeInMillis();
        long difd = difms / (1000 * 60 * 60 * 24);
        return difd;
    }

}
