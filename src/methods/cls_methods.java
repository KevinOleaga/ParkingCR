package methods;

import GetDateTime.DateTime;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
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

    DateTime dt = new DateTime();
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

    
    
    
    
    
    
    
    
    
    
    
    

    //-------------------------------------------------------------------------- Tickets    
    public void printDailyRent() {
        try {
            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/reports/rp_DailyRent.jasper");

            String ParkingLotName = "Parqueo Chalit LyF S.A.";
            String idParking = "3-101-213243";
            String Telephone = "2221-7413";
            String Plate = "AGV222";
            String Type = "Camión";
            String Payment = "5000";
            
            Map parameters = new HashMap();
            parameters.put("NAME", ParkingLotName);
            parameters.put("ID_PARKING", "Céd. Juridica: " + idParking);
            parameters.put("TELEPHONE", "Teléfono: " + Telephone);
            parameters.put("VALID_UNTIL", "Válido hasta: 01/06/2018 a las 08:00 pm");
            parameters.put("DATE", dt.GetFullDate());
            parameters.put("TIME", dt.Get12hFullTime());
            parameters.put("PLATE", Plate);
            parameters.put("TYPE", Type);
            parameters.put("PAYMENT", "₡" + Payment);            
            parameters.put("PRINT", "Impreso el " + dt.GetFullDate() + " a las " + dt.Get12hTime());

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperPrintManager.printReport(print, false);
        } catch (Exception ex) {
            new frmError(ex.toString()).setVisible(true);
        }
    }






    public void printEntrance(String ID_VEHICLE, int ID_TYPETICKET, int ID_TYPEVEHICLE, String DATE, String TIME) {
        try {
            String TypeTicket = FN_GetTypeTicket(ID_TYPETICKET);
            String TypeVehicle = FN_GetTypeVehicle(ID_TYPEVEHICLE);
            TIME = dt.ConvertTo12h(TIME);

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/reports/rp_Entrance.jasper");

            Map parameters = new HashMap();
            parameters.put("TYPETICKET", TypeTicket);
            parameters.put("DATE", DATE);
            parameters.put("TIME", TIME);
            parameters.put("ID_VEHICLE", ID_VEHICLE);
            parameters.put("TYPEVEHICLE", Capitalize(TypeVehicle));
            parameters.put("PRINT", "Impreso el " + DATE + " a las " + TIME);

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperPrintManager.printReport(print, false);
        } catch (Exception ex) {
            new frmError(ex.toString()).setVisible(true);
        }
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
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_CountVehicles() }");
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

    public byte FN_ValidatePlate(String plate) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_VALIDATEPLATE(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, plate);
            cs.execute();
            switch (cs.getInt(1)) {
                case 1:
                    exist = 1;
                    break;
                default:
                    exist = 0;
                    break;
            }

            cs.close();
        } catch (Exception ex) {
            Error("Error 008: Ha ocurrido un error al verificar la \nexistencia de la placa. \nSi el problema persiste contacte al administrador.");
        }
        return exist;
    }

    public byte FN_IsLocked(String plate) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_ISLOCKED(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, plate);
            cs.execute();
            switch (cs.getInt(1)) {
                case 1:
                    exist = 1;
                    break;
                default:
                    exist = 0;
                    break;
            }

            cs.close();
        } catch (Exception ex) {
            Error("Error 009: Ha ocurrido un error al verificar la placa. \nSi el problema persiste contacte al administrador.");
        }
        return exist;
    }

    public byte FN_IsPartner(String plate) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_ISPARTNER(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, plate);
            cs.execute();
            switch (cs.getInt(1)) {
                case 1:
                    exist = 1;
                    break;
                default:
                    exist = 0;
                    break;
            }

            cs.close();
        } catch (Exception ex) {
            Error("Error 009: Ha ocurrido un error al verificar la placa. \nSi el problema persiste contacte al administrador.");
        }
        return exist;
    }

    public String FN_GetTypeTicket(int ID_TYPETICKET) {
        String type = null;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_GetTypeTicket(?) }");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setInt(2, ID_TYPETICKET);
            cs.execute();
            type = cs.getString(1);

            cs.close();
        } catch (Exception ex) {
            Error("Error 010: Ha ocurrido un error al consultar la base de datos. \nSi el problema persiste contacte al administrador.");
        }
        return type;
    }

    public String FN_GetTypeVehicle(int ID_TYPEVEHICLE) {
        String type = null;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_GetTypeVehicle(?) }");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.setInt(2, ID_TYPEVEHICLE);
            cs.execute();
            type = cs.getString(1);

            cs.close();
        } catch (Exception ex) {
            Error("Error 011: Ha ocurrido un error al consultar la base de datos. \nSi el problema persiste contacte al administrador.");
        }
        return type;
    }

    //-------------------------------------------------------------------------- Stored Procedures
    public byte SP_NewVehicle(String ID_VEHICLE, int ID_TYPETICKET, int ID_TYPEVEHICLE) {
        byte success = 0;
        switch (FN_ValidatePlate(ID_VEHICLE)) {
            case 1:
                Warning("El número de placa " + ID_VEHICLE + " ya se encuentra en \nel sistema. No pueden existir 2 vehículos con el mismo \nnúmero de placa.");
                success = 0;
                break;
            default:
                switch (FN_IsLocked(ID_VEHICLE)) {
                    case 1:
                        Warning("La placa ingresada se encuentra bloqueada. \nEl usuario no puede ingresar al estacionamiento.");
                        success = 0;
                        break;
                    default:
                        String DATE = dt.GetFullDate();
                        String TIME = dt.Get24hTime();

                        switch (FN_IsPartner(ID_VEHICLE)) {
                            case 1:
                                ID_TYPETICKET = 3;
                                break;
                            default:
                                break;
                        }

                        try {
                            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_NEWVEHICLE(?,?,?,?,?) }");
                            cs.setString(1, ID_VEHICLE);
                            cs.setInt(2, ID_TYPEVEHICLE);
                            cs.setInt(3, ID_TYPETICKET);
                            cs.setString(4, DATE);
                            cs.setString(5, TIME);
                            cs.execute();
                            cs.close();

                            printEntrance(ID_VEHICLE, ID_TYPETICKET, ID_TYPEVEHICLE, DATE, TIME);
                            success = 1;
                        } catch (Exception ex) {
                            Error("Error 012: Ha ocurrido un error al ingresar un \nnuevo vehículo en el sistema. \nSi el problema persiste contacte al administrador.");
                        }
                }
        }
        return success;
    }

    public void Billing(String Date, String Time) {
        String CurrentDate = dt.GetDate();
        String CurrentTime = dt.Get24hTime();

        // DATE
        int Day = Integer.parseInt(CurrentDate.substring(0, 2)) - Integer.parseInt(Date.substring(0, 2));
        int Month = Integer.parseInt(CurrentDate.substring(3, 5)) - Integer.parseInt(Date.substring(3, 5));
        int Year = Integer.parseInt(CurrentDate.substring(6)) - Integer.parseInt(Date.substring(6));

        System.out.println(Day);
        System.out.println(Month);
        System.out.println(Year);
        System.out.println(difDiasEntre2fechas(1996, 03, 10, 2018, 05, 29));
    }

    public long difDiasEntre2fechas(int Y1, int M1, int D1, int Y2, int M2, int D2) {
        java.util.GregorianCalendar date = new java.util.GregorianCalendar(Y1, M1, D1);
        java.util.GregorianCalendar date2 = new java.util.GregorianCalendar(Y2, M2, D2);
        long difms = date2.getTimeInMillis() - date.getTimeInMillis();
        long difd = difms / (1000 * 60 * 60 * 24);
        return difd;
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
}
