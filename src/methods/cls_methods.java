package methods;

import CustomDateTime.GetDateTime;
import java.security.MessageDigest;
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
import java.sql.Types;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
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
    private static String secretKey = "F6EWFHQW9JPFWQ0V8QWB";

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
            Error("Error 001: Ha ocurrido un problema al establecer \nla conexión con la base de datos. \nSi el problema persiste contacte con el administrador.");
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
        } catch (Exception ex) {
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
        } catch (Exception ex) {
            Error("Error 003: Ha ocurrido un problema en la desencriptación de \nlos datos. \nSi el problema persiste contacte con el administrador.");
        }
        return res;
    }

    //-------------------------------------------------------------------------- Functions
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
        } catch (Exception ex) {
            Error(ex + "Error 004: Ha ocurrido un problema al validar el usuario. \nSi el problema persiste contacte con el administrador.");
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
        } catch (Exception ex) {
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
        } catch (Exception ex) {
            Error("Error 006: Ha ocurrido un problema al verificar el rol del \nusuario. \nSi el problema persiste contacte con el administrador.");
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
            Error("Error 007: Ha ocurrido un problema al verificar la cantidad \nde camiones. \nSi el problema persiste contacte al administrador.");
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
            Error("Error 008: Ha ocurrido un problema al verificar la cantidad \nde vehículos. \nSi el problema persiste contacte al administrador.");
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
            Error("Error 009: Ha ocurrido un problema al verificar la cantidad \nde motocicletas. \nSi el problema persiste contacte al administrador.");
        }
        return n;
    }

    public int FN_CountUsers() {
        int n = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_CountUsers() }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.execute();
            n = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 010: Ha ocurrido un problema al verificar la cantidad \nde usuarios. \nSi el problema persiste contacte al administrador.");
        }
        return n;
    }

    public int FN_CountPartners() {
        int n = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_CountPartners() }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.execute();
            n = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 011: Ha ocurrido un problema al verificar la cantidad \nde socios. \nSi el problema persiste contacte al administrador.");
        }
        return n;
    }

    public int FN_CountBlackList() {
        int n = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_CountBlackList() }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.execute();
            n = cs.getInt(1);
            cs.close();
        } catch (Exception ex) {
            Error("Error 012: Ha ocurrido un problema al verificar la cantidad \nde usuarios bloqueados. \nSi el problema persiste contacte al administrador.");
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
            Error("Error 013: Ha ocurrido un problema al verificar la cantidad \nde vehículos. \nSi el problema persiste contacte al administrador.");
        }
        return n;
    }

    //-------------------------------------------------------------------------- Stored Procedures
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
        } catch (Exception ex) {

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
        } catch (Exception ex) {

        }
        return data;
    }

    public int GetLimitOfDays(int Month, int Years) {
        int Limit = 0;
        GregorianCalendar ca = new GregorianCalendar();

        switch (Month) {
            case 2:
                if (ca.isLeapYear(Years)) {
                    Limit = 29;
                } else {
                    Limit = 28;
                }
                break;
            case 4:
                Limit = 30;
                break;
            case 6:
                Limit = 30;
                break;
            case 9:
                Limit = 30;
                break;
            case 11:
                Limit = 30;
                break;
            default:
                Limit = 31;
                break;
        }
        return Limit;
    }

    public void SP() {
        ArrayList<String> data = new ArrayList<>(2);

        String EntryTime = "19:59:00";
        String DepartureTime = "20:10:00";

        String EntryDate = "01/02/2017";
        String DepartureDate = "01/01/2019";

        int Hours = Integer.parseInt(EntryTime.substring(0, 2));
        int Minutes = Integer.parseInt(EntryTime.substring(3, 5));
        int Seconds = Integer.parseInt(EntryTime.substring(6, 8));

        int Days = Integer.parseInt(EntryDate.substring(0, 2));
        int Months = Integer.parseInt(EntryDate.substring(3, 5));
        int Years = Integer.parseInt(EntryDate.substring(6, 10));
        String Date = "";

        String total = "";
        int res1 = 0;
        int Limit = 0;

        do {
            Days++;

            /* ----------------- GET LIMIT OF DAYS PER MONTH ---------------- */
            Limit = GetLimitOfDays(Months, Years);

            /* ------------------------ CALCULATOR -------------------------- */
            if (Days == Limit + 1) {
                Months++;
                Days = 1;
            }

            if (Months == 13) {
                Years++;
                Months = 1;
            }

            /* --------------- SET DATE FORMAT 01/01/2000 ------------------- */
            if (Days < 10) {
                Date = "0" + Days + "/";
            } else {
                Date = Days + "/";
            }

            if (Months < 10) {
                Date = Date + "0" + Months + "/";
            } else {
                Date = Date + Months + "/";
            }

            Date = Date + Years;

            res1++;
            System.out.println(Date + " - " + DepartureDate + " - " + (res1 * 86400));
        } while (!Date.equals(DepartureDate));
        res1 = res1 * 86400;
        do {
            Seconds++;

            if (Seconds == 60) {
                Minutes++;
                Seconds = 00;
            }

            if (Minutes == 60) {
                Hours++;
                Minutes = 0;
            }

            if (Hours < 10) {
                total = "0" + Hours + ":";
            } else {
                total = Hours + ":";
            }

            if (Minutes < 10) {
                total = total + "0" + Minutes + ":";
            } else {
                total = total + Minutes + ":";
            }

            if (Seconds < 10) {
                total = total + "0" + Seconds;
            } else {
                total = total + Seconds;
            }

            res1++;
            System.out.println("Total: " + total + " Segundos: " + res1);
        } while (!total.equals(DepartureTime));

        System.out.println("Res: " + ConvertSecondsToHours(res1));
    }

    public String ConvertSecondsToHours(int V_Seconds) {
        int Hours = V_Seconds / 3600;
        int Minutes = (V_Seconds - (3600 * Hours)) / 60;
        int Seconds = V_Seconds - ((Hours * 3600) + (Minutes * 60));

        return GetTimeFormat(Hours, Minutes, Seconds);
    }

    public String GetTimeFormat(int Hours, int Minutes, int Seconds) {
        String total = "";
        if (Hours < 10) {
            total = "0" + Hours + ":";
        } else {
            total = Hours + ":";
        }

        if (Minutes < 10) {
            total = total + "0" + Minutes + ":";
        } else {
            total = total + Minutes + ":";
        }

        if (Seconds < 10) {
            total = total + "0" + Seconds;
        } else {
            total = total + Seconds;
        }
        return total;
    }

    public ArrayList SP_GetTicketInfo(String ID_VEHICLE) {
        ArrayList<String> data = new ArrayList<>(8);

        try {
            CallableStatement cs = Connect().prepareCall("{ call STPR.SP_GetTicketInfo(?,?,?,?,?,?,?,?,?) }");
            cs.setString(1, Encrypt(ID_VEHICLE));
            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.registerOutParameter(4, Types.VARCHAR);
            cs.registerOutParameter(5, Types.VARCHAR);
            cs.registerOutParameter(6, Types.VARCHAR);
            cs.registerOutParameter(7, Types.VARCHAR);
            cs.registerOutParameter(8, Types.VARCHAR);
            cs.registerOutParameter(9, Types.VARCHAR);
            cs.execute();

            for (int i = 2; i < 10; i++) {
                data.add(cs.getString(i));
            }

            cs.close();
        } catch (Exception ex) {

        }
        return data;
    }

    public int MakePositive(int data) {
        if (data <= 0) {
            data = data * -1;
        }
        return data;
    }

    public int CalcPayment(String Time) {
        System.out.println(Time);
        int h = Integer.parseInt(Time.substring(0, 1));
        int m = Integer.parseInt(Time.substring(5, 7));
        int s = Integer.parseInt(Time.substring(12, 14));

        int total = 0;
        if (h == 0) {
            if (m >= 5) {                                              //MARGEN DE 5 MINUTOS
                total = 900;                                               //LA PRIMERA HORA SE COBRA COMPLETA
            } else {
                total = 0;
            }
        } else if (h >= 1) {
            total = 900 * h;
            if (m >= 5 && m <= 30) {
                total = total + 350;
            } else if (m >= 5 && m >= 30) {
                total = total + 900;
            }
        }
        return total;
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
            cs.setString(4, Encrypt(DATE));
            cs.setString(5, Encrypt(TIME));
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

    public byte FN_VehicleExist(String ID_VEHICLE) {
        byte exist = 0;
        try {
            CallableStatement cs = Connect().prepareCall("{ ? = call FUNC.FN_VEHICLEEXIST(?) }");
            cs.registerOutParameter(1, Types.NUMERIC);
            cs.setString(2, ID_VEHICLE);
            cs.execute();
            switch (cs.getInt(1)) {
                case 1:
                    exist = 1;
                    break;
            }

            cs.close();
        } catch (Exception ex) {
            Error("Error 002: Ha ocurrido un problema al validar el usuario. \nSi el problema persiste contacte con el administrador.");
        }
        return exist;
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

    public long difDiasEntre2fechas(int Y1, int M1, int D1, int Y2, int M2, int D2) {
        java.util.GregorianCalendar date = new java.util.GregorianCalendar(Y1, M1, D1);
        java.util.GregorianCalendar date2 = new java.util.GregorianCalendar(Y2, M2, D2);
        long difms = date2.getTimeInMillis() - date.getTimeInMillis();
        long difd = difms / (1000 * 60 * 60 * 24);
        return difd;
    }

    public String Capitalize(String data) {
        return data.substring(0, 1).toUpperCase() + data.substring(1).toLowerCase();
    }

}
