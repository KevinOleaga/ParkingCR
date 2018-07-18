package methods;

import CustomDateTime.GetDateTime;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
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
import project.frmLocked;
import project.frmSuccess;
import project.frmWarning;

/**
 * @author Kevin Oleaga Garcia
 * @email oleaga@outlook.com
 * @version 1.0
 */
public class cls_methods {

    public static String USERNAME = null;
    public static boolean msgControl = false;
    public static boolean ShowListControl = false;
    private static final String secretKey = "F6EWFHQW9JPFWQ0V8QWB";

    /* --------------------------- DBA SETTINGS ----------------------------- */
    String Host = "localhost";
    String User = "DBA_PARKING";
    String Password = "DBA_PARKING";

    String Url = "jdbc:oracle:thin:@" + Host + ":1521:XE";
    String Controller = "oracle.jdbc.OracleDriver";

    /* ---------------------------- CONNECTION ------------------------------ */
    public Connection Connect() {
        Connection cn = null;
        try {
            Class.forName(Controller);
            cn = DriverManager.getConnection(Url, User, Password);
        } catch (ClassNotFoundException | SQLException ex) {
            Error("Error 001: Ha ocurrido un problema al establecer \nla conexión con la base de datos. \nSi el problema persiste contacte con el administrador.");
        }
        return cn;
    }

    /* ------------------------------ TOOLS --------------------------------- */
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

    public void Locked(String data) {
        if (msgControl == false) {
            new frmLocked(data).setVisible(true);
            msgControl = true;
        }
    }

    public String Encrypt(String data) {
        String res = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            byte[] plainTextBytes = data.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            res = new String(base64Bytes);
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
            Error("Error 002: Ha ocurrido un problema en la encriptación de los \ndatos. \nSi el problema persiste contacte con el administrador.");
        }
        return res;
    }

    public String Decrypt(String data) {
        String res = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);

            byte[] message = Base64.decodeBase64(data.getBytes("utf-8"));
            byte[] plainText = decipher.doFinal(message);
            res = new String(plainText, "UTF-8");
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
            Error("Error 003: Ha ocurrido un problema en la desencriptación de \nlos datos. \nSi el problema persiste contacte con el administrador.");
        }
        return res;
    }

    public String Capitalize(String data) {
        return data.substring(0, 1).toUpperCase() + data.substring(1).toLowerCase();
    }

    /* -------------------------- DBA FUNCTIONS ----------------------------- */
    public byte FN_Login01(String user) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_lOGIN01(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, Encrypt(user));
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
        } catch (SQLException ex) {
            Error("Error 004: Ha ocurrido un problema al validar el usuario. \nSi el problema persiste contacte con el administrador.");
        }
        return exist;
    }

    public byte FN_Login02(String user, String password) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_LOGIN02(?,?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, Encrypt(user));
            cs.setString(3, Encrypt(password));
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
        } catch (SQLException ex) {
            Error("Error 005: Ha ocurrido un problema al validar la contraseña. \nSi el problema persiste contacte con el administrador.");
        }
        return exist;
    }

    public int FN_GetRole(String user, String password) {
        int ID_Role = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_GETROLE(?,?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, Encrypt(user));
            cs.setString(3, Encrypt(password));
            cs.execute();

            ID_Role = cs.getInt(1);
            cs.close();
        } catch (SQLException ex) {
            Error("Error 006: Ha ocurrido un problema al verificar el rol del \nusuario. \nSi el problema persiste contacte con el administrador.");
        }
        return ID_Role;
    }

    public boolean FN_VehicleExist(String ID_VEHICLE) {
        boolean exist = false;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_VehicleExist(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, Encrypt(ID_VEHICLE));
            cs.execute();

            switch (cs.getInt(1)) {
                case 1:
                    exist = true;
                    break;
                default:
                    Warning("La placa " + ID_VEHICLE + " no se encuentra registrada en el sistema. \nPor favor verifiquela e intentelo nuevamente.");
                    exist = false;
                    break;
            }

            cs.close();
        } catch (SQLException ex) {
            Error("Error 007: Ha ocurrido un problema al verificar el número \nde placa. \nSi el problema persiste contacte con el administrador.");
        }
        return exist;
    }

    /* ---------------------- DBA STORED PROCEDURES ------------------------- */
    public ArrayList SP_GetWidgetsInfo() {
        ArrayList<String> data = new ArrayList<>(4);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GetWidgetsInfo(?,?,?,?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.registerOutParameter(2, Types.NUMERIC);
            cs.registerOutParameter(3, Types.NUMERIC);
            cs.registerOutParameter(4, Types.NUMERIC);
            cs.execute();

            for (int i = 1; i < 5; i++) {
                data.add(String.valueOf(cs.getInt(i)));
            }

            cs.close();
        } catch (SQLException ex) {
            Error("Error 007: Ha ocurrido un problema al verificar la información \nde los widgets. \nSi el problema persiste contacte con el administrador.");
        }
        return data;
    }

    public ArrayList SP_GetVehiclesCount() {
        ArrayList<String> data = new ArrayList<>(3);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GetVehiclesCount(?,?,?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.registerOutParameter(2, Types.NUMERIC);
            cs.registerOutParameter(3, Types.NUMERIC);
            cs.execute();

            for (int i = 1; i < 4; i++) {
                data.add(String.valueOf(cs.getInt(i)));
            }

            cs.close();
        } catch (SQLException ex) {
            Error("Error 008: Ha ocurrido un problema al verificar la cantidad \nde vehículos. \nSi el problema persiste contacte con el administrador.");
        }
        return data;
    }

    public ArrayList SP_GetVehicleInfo(String ID_VEHICLE) {
        ArrayList<String> data = new ArrayList<>();

        try {  
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GetVehicleInfo(?,?,?,?,?,?,?,?,?,?,?) }");
            cs.setString(1, Encrypt(ID_VEHICLE));
            cs.registerOutParameter(2, Types.VARCHAR); // ENTRYDATE
            cs.registerOutParameter(3, Types.VARCHAR); // ENTRYTIME
            cs.registerOutParameter(4, Types.VARCHAR); // DEPARTUREDATE
            cs.registerOutParameter(5, Types.VARCHAR); // DEPARTURETIME
            cs.registerOutParameter(6, Types.VARCHAR); // TOTALTIME  
            cs.registerOutParameter(7, Types.VARCHAR); // TypeVehicle  
            cs.registerOutParameter(8, Types.VARCHAR); // TypeTicket
            cs.registerOutParameter(9, Types.VARCHAR); // MARGIN
            cs.registerOutParameter(10, Types.VARCHAR); // MARGIN
            cs.registerOutParameter(11, Types.VARCHAR); // PAYMENT
            cs.execute();
            
            data.add(cs.getString(2));
            data.add(cs.getString(3));
            data.add(cs.getString(4));
            data.add(cs.getString(5));
            data.add(cs.getString(6));
            data.add(Decrypt(cs.getString(7)));
            data.add(Decrypt(cs.getString(8)));
            data.add(cs.getString(9));
            data.add(cs.getString(10));
            data.add(cs.getString(11));
            
            cs.close();
           } catch (SQLException ex) {
               System.out.println(ex);
        }
        return data;
    }




    
    
    
    
    public void SP_History(String USERNAME, String DESCRIPTION, String DATAENTERED) {
        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_HISTORY(?,?,?) }");
            cs.setString(1, USERNAME);
            cs.setString(2, DESCRIPTION);
            cs.setString(3, DATAENTERED);
            cs.execute();
            cs.close();
        } catch (Exception ex) {
            Error(ex + ex.getMessage() + "Error 012: Ha ocurrido un error al ingresar un \nnuevo vehículo en el sistema. \nSi el problema persiste contacte al administrador.");
        }
    }

    public void SetHistory(String DESCRIPTION, String DataEntered) {
        if (USERNAME == null) {
            SP_History("NAXAg7BtqIDVtqFR5TFj1pwdX68nWShQN324pHVR86w=", DESCRIPTION, DataEntered);
        } else {
            SP_History(USERNAME, DESCRIPTION, DataEntered);
        }
    }

    public String SP_NewVehicle(String ID_VEHICLE, String TYPETICKET, String TYPEVEHICLE) {
        String status = null;
        String DATE = new GetDateTime().GetDate();
        String TIME = new GetDateTime().Get24hFullTime();

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_NEWVEHICLE(?,?,?,?,?,?,?) }");
            cs.registerOutParameter(7, Types.VARCHAR);
            cs.setString(1, Encrypt(ID_VEHICLE));
            cs.setString(2, Encrypt(TYPEVEHICLE));
            cs.setString(3, Encrypt(TYPETICKET));
            cs.setString(4, DATE);
            cs.setString(5, TIME);
            cs.setString(6, USERNAME);
            cs.execute();
            status = cs.getString(7);
            cs.close();

            switch (status) {
                case "PARTNER":
                    printEntrance(ID_VEHICLE, "SOCIO", TYPEVEHICLE, DATE, new GetDateTime().ConvertTo12h(TIME));
                    break;
                case "OK":
                    switch (TYPETICKET) {
                        case "RENTA DIARIA":
                            printDailyRent(ID_VEHICLE, TYPETICKET, TYPEVEHICLE, DATE, new GetDateTime().ConvertTo12h(TIME));
                            break;
                        case "CLIENTE CASUAL":
                            printEntrance(ID_VEHICLE, TYPETICKET, TYPEVEHICLE, DATE, new GetDateTime().ConvertTo12h(TIME));
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

    public void printEntrance(String ID_VEHICLE, String TYPETICKET, String TYPEVEHICLE, String ENTRYDATE, String ENTRYTIME) {
        ArrayList<String> data = new ArrayList<>(3);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GetConfigTicket(?,?,?) }");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();

            for (int i = 1; i < 4; i++) {
                data.add(Decrypt(cs.getString(i)));
            }

            cs.close();

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/reports/rp_CasualRent.jasper");

            Map parameters = new HashMap();
            parameters.put("NAME", data.get(1));
            parameters.put("ID_PARKING", "Céd. Jurídica: " + data.get(0));
            parameters.put("TELEPHONE", "Teléfono: " + data.get(2));

            parameters.put("TYPETICKET", TYPETICKET);
            parameters.put("ENTRYDATE", ENTRYDATE);
            parameters.put("ENTRYTIME", ENTRYTIME);
            parameters.put("ID_VEHICLE", ID_VEHICLE);
            parameters.put("TYPEVEHICLE", Capitalize(TYPEVEHICLE));
            parameters.put("PRINT", "Impreso el " + ENTRYDATE + " a las " + new GetDateTime().Get12hTime());

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperPrintManager.printReport(print, false);
        } catch (Exception ex) {
            Error(ex + "Error 010: Ha ocurrido un problema en la impresión del \ntiquete. \nSi el problema persiste contacte al administrador.");
        }
    }


    public void rp_CasualPayment(String IdVehicle, String TypeVehicle, String Entry, String Departure, String StayTime, String Payment) {
        ArrayList<String> data = new ArrayList<>(3);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GetConfigTicket(?,?,?) }");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();

            for (int i = 1; i < 4; i++) {
                data.add(Decrypt(cs.getString(i)));
            }

            cs.close();

            JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/reports/rp_payment.jasper");

            Map parameters = new HashMap();
            parameters.put("NAME", data.get(1));
            parameters.put("ID_PARKING", "Céd. Jurídica: " + data.get(0));
            parameters.put("TELEPHONE", "Teléfono: " + data.get(2));
            
            parameters.put("ID_VEHICLE", IdVehicle);
            parameters.put("TYPEVEHICLE", TypeVehicle);
            parameters.put("ENTRY", Entry);
            parameters.put("DEPARTURE", Departure);
            parameters.put("STAYTIME", StayTime);
            parameters.put("PAYMENT", Payment);

            parameters.put("PRINT", "Impreso el " + new GetDateTime().GetDate() + " a las " + new GetDateTime().Get12hTime());

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
            JasperPrintManager.printReport(print, false);
        } catch (Exception ex) {
            Error(ex + "Error 010: Ha ocurrido un problema en la impresión del \ntiquete. \nSi el problema persiste contacte al administrador.");
        }
    }

    public void printDailyRent(String ID_VEHICLE, String TYPETICKET, String TYPEVEHICLE, String ENTRYDATE, String ENTRYTIME) {
        ArrayList<String> data = new ArrayList<>(3);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GET_CONFIGTICKET(?,?,?) }");
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();

            for (int i = 1; i < 4; i++) {
                data.add(Decrypt(cs.getString(i)));
            }

            cs.close();
        } catch (Exception ex) {
            new frmError(ex.toString()).setVisible(true);
        }

        /*        int hour = Integer.parseInt(TIME.substring(0, 2));
        int Daily = 0;
        int Daily2 = 0;

        int PAYMENT = 0;
        ArrayList<String> data = new ArrayList<>(3);
        String TYPE = null, END_RENT = null, VALID_UNTIL = null;

        if (hour >= 6 && hour <= 8) {
            VALID_UNTIL = "Válido hasta: " + DATE + " a las " + END_RENT;
            TYPE = "RENTA DIARIA";
            PAYMENT = FN_GetDailyPrice(TYPEVEHICLE);
        } else {
            TYPE = "RENTA NOCTURNA";
            PAYMENT = FN_GetNightlyPrice(TYPEVEHICLE);
            if (Integer.parseInt(DATE.substring(0, 2)) < 10) {
                VALID_UNTIL = "Válido hasta: " + "0" + (Integer.parseInt(DATE.substring(0, 2)) + 1) + "/" + DATE.substring(3) + " a las 06:00 am";
            } else {
                VALID_UNTIL = "Válido hasta: " + (Integer.parseInt(DATE.substring(0, 2)) + 1) + DATE.substring(3) + " a las 06:00 am";
            }
        }

        try {

            printDailyRent(ID_VEHICLE, TYPETICKET, TYPEVEHICLE, DATE, new DateTime().ConvertTo12h(TIME));

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
         */
    }

    public ArrayList<String> SP_GetDetails(String ID_VEHICLE) {
        ArrayList<String> data = new ArrayList<>(4);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GETDETAILS(?,?,?,?,?) }");
            cs.setString(1, ID_VEHICLE);
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.registerOutParameter(4, Types.VARCHAR);
            cs.registerOutParameter(5, Types.VARCHAR);
            cs.execute();

            for (int i = 2; i < 6; i++) {
                data.add(cs.getString(i));
            }

            cs.close();
        } catch (Exception ex) {
            new frmError(ex.toString()).setVisible(true);
        }
        return data;
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
