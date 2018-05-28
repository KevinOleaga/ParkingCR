package methods;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public String GetDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return (dateFormat.format(date));
    }

    public String Get12hTime() {
        Date date = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
        return (timeFormat.format(date).toLowerCase());
    }

    public String Get12hFullTime() {
        Date date = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
        return (timeFormat.format(date).toLowerCase());
    }

    public String Get24hTime() {
        Date date = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("H:mm:ss");
        return (timeFormat.format(date).toLowerCase());
    }

    public String ConvertTo12h(String Time) {
        String h = null;
        switch (Time.substring(0, 2)) {
            case "13":
                h = "01" + Time.substring(2) + " pm";
                break;
            case "14":
                h = "02" + Time.substring(2) + " pm";
                break;
            case "15":
                h = "03" + Time.substring(2) + " pm";
                break;
            case "16":
                h = "04" + Time.substring(2) + " pm";
                break;
            case "17":
                h = "05" + Time.substring(2) + " pm";
                break;
            case "18":
                h = "06" + Time.substring(2) + " pm";
                break;
            case "19":
                h = "07" + Time.substring(2) + " pm";
                break;
            case "20":
                h = "08" + Time.substring(2) + " pm";
                break;
            case "21":
                h = "09" + Time.substring(2) + " pm";
                break;
            case "22":
                h = "10" + Time.substring(2) + " pm";
                break;
            case "23":
                h = "11" + Time.substring(2) + " pm";
                break;
            case "24":
                h = "12" + Time.substring(2) + " pm";
                break;
            default:
                break;
        }
        return h;
    }

    public String Capitalize(String data) {
        return data.substring(0, 1).toUpperCase() + data.substring(1).toLowerCase();
    }

    //-------------------------------------------------------------------------- Tickets    
    public void printEntrance(String ID_VEHICLE, int ID_TYPETICKET, int ID_TYPEVEHICLE, String DATE, String TIME) {
        try {
            String TypeTicket = FN_GetTypeTicket(ID_TYPETICKET);
            String TypeVehicle = FN_GetTypeVehicle(ID_TYPEVEHICLE);
            TIME = ConvertTo12h(TIME);

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

    public int FN_CountVehicles() {
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
                        String DATE = GetDate();
                        String TIME = Get24hTime();

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
