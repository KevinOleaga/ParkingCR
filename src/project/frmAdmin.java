package project;

import java.awt.Color;
import java.util.ArrayList;
import methods.cls_methods;
import CustomDateTime.GetDateTime;
import static java.awt.Frame.MAXIMIZED_BOTH;
import Atxy2k.CustomTextField.RestrictedTextField;

/**
 * @author Kevin Oleaga Garcia
 * @email oleaga@outlook.com
 * @version 1.0
 */
public class frmAdmin extends javax.swing.JFrame implements Runnable {

    Thread th;
    private static String item = "item_1";
    private static String ID_VEHICLE = null;

    cls_methods mt = new cls_methods();

    public frmAdmin() {
        initComponents();
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_dashboard.setVisible(true);

        /* ----------------------- DASHBOARD WIDGETS ------------------------ */
        GetWidgetsInfo();

        /* --------------------- SYSTEM PLATES LENGTH ----------------------- */
        new RestrictedTextField(tbx_idTruck).setLimit(8);
        new RestrictedTextField(tbx_idCar).setLimit(8);
        new RestrictedTextField(tbx_idMotorcycle).setLimit(8);
        new RestrictedTextField(tbx_idVehicle).setLimit(8);

        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 50, 56));  // ON
        item_2.setBackground(new Color(38, 67, 72));  // OFF
        item_7.setBackground(new Color(38, 67, 72));  // OFF
        item_8.setBackground(new Color(102, 0, 0));   // OFF

        /* ----------------------------- OTHERS ----------------------------- */
        this.setExtendedState(MAXIMIZED_BOTH);
        th = new Thread(this);
        th.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_menu = new javax.swing.JPanel();
        lb_imgTop = new javax.swing.JLabel();
        item_1 = new javax.swing.JPanel();
        lb_logoItem1 = new javax.swing.JLabel();
        lb_item1 = new javax.swing.JLabel();
        item_2 = new javax.swing.JPanel();
        lb_logoItem2 = new javax.swing.JLabel();
        lb_item2 = new javax.swing.JLabel();
        item_3 = new javax.swing.JPanel();
        lb_logoItem3 = new javax.swing.JLabel();
        lb_item3 = new javax.swing.JLabel();
        item_4 = new javax.swing.JPanel();
        lb_logoItem4 = new javax.swing.JLabel();
        lb_item4 = new javax.swing.JLabel();
        item_5 = new javax.swing.JPanel();
        lb_logoItem5 = new javax.swing.JLabel();
        lb_item5 = new javax.swing.JLabel();
        item_6 = new javax.swing.JPanel();
        lb_logoItem6 = new javax.swing.JLabel();
        lb_item6 = new javax.swing.JLabel();
        item_7 = new javax.swing.JPanel();
        lb_logoItem7 = new javax.swing.JLabel();
        lb_item7 = new javax.swing.JLabel();
        sp_menu = new javax.swing.JSeparator();
        item_8 = new javax.swing.JPanel();
        lb_logoItem8 = new javax.swing.JLabel();
        lb_item8 = new javax.swing.JLabel();
        pn_dashboard = new javax.swing.JPanel();
        pn_widgetUsers = new javax.swing.JPanel();
        lb_widgetUsersIcon = new javax.swing.JLabel();
        lb_widgetUsersTitle = new javax.swing.JLabel();
        lb_widgetUsersTotal = new javax.swing.JLabel();
        sp_widgetUsers = new javax.swing.JSeparator();
        lb_widgetUsersFooterIcon = new javax.swing.JLabel();
        lb_widgetUsersFooterTitle = new javax.swing.JLabel();
        pn_widgetPartners = new javax.swing.JPanel();
        lb_widgetPartnersIcon = new javax.swing.JLabel();
        lb_widgetPartnersTitle = new javax.swing.JLabel();
        lb_widgetPartnersTotal = new javax.swing.JLabel();
        sp_widgetPartners = new javax.swing.JSeparator();
        lb_widgetPartnersFooterIcon = new javax.swing.JLabel();
        lb_widgetPartnersFooterTitle = new javax.swing.JLabel();
        pn_widgetBlocked = new javax.swing.JPanel();
        lb_widgetBlockedIcon = new javax.swing.JLabel();
        lb_widgetBlockedTitle = new javax.swing.JLabel();
        lb_widgetBlockedTotal = new javax.swing.JLabel();
        sp_widgetBlocked = new javax.swing.JSeparator();
        lb_widgetBlockedFooterIcon = new javax.swing.JLabel();
        lb_widgetBlockedFooterTitle = new javax.swing.JLabel();
        pn_widgetVehicles = new javax.swing.JPanel();
        lb_widgetVehiclesIcon = new javax.swing.JLabel();
        lb_widgetVehiclesTitle = new javax.swing.JLabel();
        lb_widgetVehiclesTotal = new javax.swing.JLabel();
        sp_widgetVehicles = new javax.swing.JSeparator();
        lb_widgetVehiclesFooterIcon = new javax.swing.JLabel();
        lb_widgetVehiclesFooterTitle = new javax.swing.JLabel();
        pn_stats = new javax.swing.JPanel();
        pn_calculator = new javax.swing.JPanel();
        pn_empty1 = new javax.swing.JPanel();
        pn_empty2 = new javax.swing.JPanel();
        pn_empty3 = new javax.swing.JPanel();
        pn_empty4 = new javax.swing.JPanel();
        pn_system = new javax.swing.JPanel();
        pn_main = new javax.swing.JPanel();
        btn_entrance = new javax.swing.JButton();
        btn_payment = new javax.swing.JButton();
        lb_truckIcon = new javax.swing.JLabel();
        lb_trucks = new javax.swing.JLabel();
        lb_carIcon = new javax.swing.JLabel();
        lb_cars = new javax.swing.JLabel();
        lb_motorcycleIcon = new javax.swing.JLabel();
        lb_motorcycles = new javax.swing.JLabel();
        pn_btnShowVehicles = new javax.swing.JPanel();
        lb_showVehicles = new javax.swing.JLabel();
        pn_type = new javax.swing.JPanel();
        btn_returnType = new javax.swing.JButton();
        lb_title = new javax.swing.JLabel();
        btn_truck = new javax.swing.JButton();
        btn_car = new javax.swing.JButton();
        btn_motorcycle = new javax.swing.JButton();
        pn_truck = new javax.swing.JPanel();
        btn_returnTruck = new javax.swing.JButton();
        lb_iconTruck = new javax.swing.JLabel();
        pn_inputTruck = new javax.swing.JPanel();
        lb_titleTruck = new javax.swing.JLabel();
        sp_inputTitleTruck = new javax.swing.JSeparator();
        lb_truck = new javax.swing.JLabel();
        tbx_idTruck = new javax.swing.JTextField();
        sp_inputTruck = new javax.swing.JSeparator();
        btn_calendarTruck = new javax.swing.JButton();
        btn_clockTruck = new javax.swing.JButton();
        pn_car = new javax.swing.JPanel();
        btn_returnCar = new javax.swing.JButton();
        lb_iconCar = new javax.swing.JLabel();
        pn_inputCar = new javax.swing.JPanel();
        lb_titleCar = new javax.swing.JLabel();
        sp_inputTitleCar = new javax.swing.JSeparator();
        lb_textCar = new javax.swing.JLabel();
        tbx_idCar = new javax.swing.JTextField();
        sp_inputCar = new javax.swing.JSeparator();
        btn_calendarCar = new javax.swing.JButton();
        btn_clockCar = new javax.swing.JButton();
        pn_motorcycle = new javax.swing.JPanel();
        btn_returnMotorcycle = new javax.swing.JButton();
        lb_iconMotorcycle = new javax.swing.JLabel();
        pn_inputMotorcycle = new javax.swing.JPanel();
        lb_titleMotorcycle = new javax.swing.JLabel();
        sp_inputTitleMotorcycle = new javax.swing.JSeparator();
        lb_textMotorcycle = new javax.swing.JLabel();
        tbx_idMotorcycle = new javax.swing.JTextField();
        sp_inputMotorcycle = new javax.swing.JSeparator();
        btn_calendarMotorcycle = new javax.swing.JButton();
        btn_clockMotorcycle = new javax.swing.JButton();
        pn_payment = new javax.swing.JPanel();
        pn_paymentInput = new javax.swing.JPanel();
        btn_returnPaymentInput = new javax.swing.JButton();
        pn_paymentInputData = new javax.swing.JPanel();
        lb_paymentInputTitle = new javax.swing.JLabel();
        sp_paymentInput = new javax.swing.JSeparator();
        lb_idVehicle = new javax.swing.JLabel();
        tbx_idVehicle = new javax.swing.JTextField();
        sp_idVehicle = new javax.swing.JSeparator();
        btn_showPaymentDetails = new javax.swing.JButton();
        pn_paymentData = new javax.swing.JPanel();
        btn_returnPaymentData = new javax.swing.JButton();
        pn_paymentInputData1 = new javax.swing.JPanel();
        lb_paymentInputTitless = new javax.swing.JLabel();
        sp_paymentInputss1 = new javax.swing.JSeparator();
        pn_paymentDetails = new javax.swing.JPanel();
        lb_EntryDate = new javax.swing.JLabel();
        lb_EntryDateData = new javax.swing.JLabel();
        lb_EntryTime = new javax.swing.JLabel();
        lb_EntryTimeData = new javax.swing.JLabel();
        lb_DepartureDate = new javax.swing.JLabel();
        lb_DepartureDateData = new javax.swing.JLabel();
        lb_DepartureTime = new javax.swing.JLabel();
        lb_DepartureTimeData = new javax.swing.JLabel();
        lb_TotalTime = new javax.swing.JLabel();
        lb_TotalTimeData = new javax.swing.JLabel();
        lb_Plate = new javax.swing.JLabel();
        lb_PlateData = new javax.swing.JLabel();
        lb_TypeVehicle = new javax.swing.JLabel();
        lb_TypeVehicleData = new javax.swing.JLabel();
        lb_TypeTicket = new javax.swing.JLabel();
        lb_TypeTicketData = new javax.swing.JLabel();
        lb_Margin = new javax.swing.JLabel();
        lb_MarginData = new javax.swing.JLabel();
        lb_TotalTimeRounded = new javax.swing.JLabel();
        lb_TotalTimeRoundedData = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_payment = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_showDetails3 = new javax.swing.JButton();
        btn_showDetailsaaa = new javax.swing.JButton();
        pn_bottom = new javax.swing.JPanel();
        lb_name = new javax.swing.JLabel();
        lb_hour = new javax.swing.JLabel();
        sp_date = new javax.swing.JSeparator();
        lb_fecha = new javax.swing.JLabel();
        sp_date1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmAdmin"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_menu.setBackground(new java.awt.Color(38, 67, 72));
        pn_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_imgTop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu 240px.jpg"))); // NOI18N
        pn_menu.add(lb_imgTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 240));

        item_1.setBackground(new java.awt.Color(38, 67, 72));
        item_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_1MousePressed(evt);
            }
        });
        item_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dashboard 20px.png"))); // NOI18N
        item_1.add(lb_logoItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item1.setBackground(new java.awt.Color(255, 255, 255));
        lb_item1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item1.setForeground(new java.awt.Color(224, 224, 224));
        lb_item1.setText("Dashboard");
        item_1.add(lb_item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 50));

        item_2.setBackground(new java.awt.Color(38, 67, 72));
        item_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_2MousePressed(evt);
            }
        });
        item_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Parking 20px.png"))); // NOI18N
        item_2.add(lb_logoItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item2.setBackground(new java.awt.Color(255, 255, 255));
        lb_item2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item2.setForeground(new java.awt.Color(224, 224, 224));
        lb_item2.setText("Parking CR");
        item_2.add(lb_item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 50));

        item_3.setBackground(new java.awt.Color(38, 67, 72));
        item_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_3MousePressed(evt);
            }
        });
        item_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users 20px.png"))); // NOI18N
        item_3.add(lb_logoItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item3.setBackground(new java.awt.Color(255, 255, 255));
        lb_item3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item3.setForeground(new java.awt.Color(224, 224, 224));
        lb_item3.setText("Adm. Usuarios");
        item_3.add(lb_item3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 50));

        item_4.setBackground(new java.awt.Color(38, 67, 72));
        item_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_4MousePressed(evt);
            }
        });
        item_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Partners 20px.png"))); // NOI18N
        item_4.add(lb_logoItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item4.setBackground(new java.awt.Color(255, 255, 255));
        lb_item4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item4.setForeground(new java.awt.Color(224, 224, 224));
        lb_item4.setText("Adm. Socios");
        item_4.add(lb_item4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 50));

        item_5.setBackground(new java.awt.Color(38, 67, 72));
        item_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_5MousePressed(evt);
            }
        });
        item_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Locked 20px.png"))); // NOI18N
        item_5.add(lb_logoItem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item5.setBackground(new java.awt.Color(255, 255, 255));
        lb_item5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item5.setForeground(new java.awt.Color(224, 224, 224));
        lb_item5.setText("Adm. Lista negra");
        item_5.add(lb_item5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 240, 50));

        item_6.setBackground(new java.awt.Color(38, 67, 72));
        item_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_6MousePressed(evt);
            }
        });
        item_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reports 20px.png"))); // NOI18N
        item_6.add(lb_logoItem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item6.setBackground(new java.awt.Color(255, 255, 255));
        lb_item6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item6.setForeground(new java.awt.Color(224, 224, 224));
        lb_item6.setText("Reportes");
        item_6.add(lb_item6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 240, 50));

        item_7.setBackground(new java.awt.Color(38, 67, 72));
        item_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_7MousePressed(evt);
            }
        });
        item_7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Configuration 20px.png"))); // NOI18N
        item_7.add(lb_logoItem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item7.setBackground(new java.awt.Color(255, 255, 255));
        lb_item7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item7.setForeground(new java.awt.Color(224, 224, 224));
        lb_item7.setText("Configuración");
        item_7.add(lb_item7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 240, 50));
        pn_menu.add(sp_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 595, 220, 10));

        item_8.setBackground(new java.awt.Color(102, 0, 0));
        item_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_8MousePressed(evt);
            }
        });
        item_8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logoItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout 20px.png"))); // NOI18N
        item_8.add(lb_logoItem8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item8.setBackground(new java.awt.Color(255, 255, 255));
        lb_item8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item8.setForeground(new java.awt.Color(224, 224, 224));
        lb_item8.setText("Cerrar Sesión");
        item_8.add(lb_item8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 605, 240, 50));

        getContentPane().add(pn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 768));

        pn_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_widgetUsers.setBackground(new java.awt.Color(255, 255, 255));
        pn_widgetUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_widgetUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_widgetUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_widgetUsersMouseExited(evt);
            }
        });
        pn_widgetUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_widgetUsersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users 70px.png"))); // NOI18N
        pn_widgetUsers.add(lb_widgetUsersIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_widgetUsersTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_widgetUsersTitle.setForeground(new java.awt.Color(243, 187, 69));
        lb_widgetUsersTitle.setText("Usuarios");
        pn_widgetUsers.add(lb_widgetUsersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        lb_widgetUsersTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_widgetUsersTotal.setForeground(new java.awt.Color(243, 187, 69));
        lb_widgetUsersTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_widgetUsersTotal.setText("0");
        pn_widgetUsers.add(lb_widgetUsersTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_widgetUsers.setForeground(new java.awt.Color(164, 158, 147));
        pn_widgetUsers.add(sp_widgetUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_widgetUsersFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_widgetUsers.add(lb_widgetUsersFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_widgetUsersFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_widgetUsersFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_widgetUsersFooterTitle.setText("Actualizado");
        pn_widgetUsers.add(lb_widgetUsersFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_widgetUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 255, 140));

        pn_widgetPartners.setBackground(new java.awt.Color(255, 255, 255));
        pn_widgetPartners.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_widgetPartners.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_widgetPartnersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_widgetPartnersMouseExited(evt);
            }
        });
        pn_widgetPartners.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_widgetPartnersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Partner 70px.png"))); // NOI18N
        pn_widgetPartners.add(lb_widgetPartnersIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_widgetPartnersTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_widgetPartnersTitle.setForeground(new java.awt.Color(122, 194, 154));
        lb_widgetPartnersTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_widgetPartnersTitle.setText("Socios");
        pn_widgetPartners.add(lb_widgetPartnersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, -1));

        lb_widgetPartnersTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_widgetPartnersTotal.setForeground(new java.awt.Color(122, 194, 154));
        lb_widgetPartnersTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_widgetPartnersTotal.setText("0");
        pn_widgetPartners.add(lb_widgetPartnersTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_widgetPartners.setForeground(new java.awt.Color(164, 158, 147));
        pn_widgetPartners.add(sp_widgetPartners, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_widgetPartnersFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_widgetPartners.add(lb_widgetPartnersFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_widgetPartnersFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_widgetPartnersFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_widgetPartnersFooterTitle.setText("Actualizado");
        pn_widgetPartners.add(lb_widgetPartnersFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_widgetPartners, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 35, 255, 140));

        pn_widgetBlocked.setBackground(new java.awt.Color(255, 255, 255));
        pn_widgetBlocked.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_widgetBlocked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_widgetBlockedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_widgetBlockedMouseExited(evt);
            }
        });
        pn_widgetBlocked.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_widgetBlockedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Locked 70px.png"))); // NOI18N
        pn_widgetBlocked.add(lb_widgetBlockedIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_widgetBlockedTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_widgetBlockedTitle.setForeground(new java.awt.Color(235, 94, 40));
        lb_widgetBlockedTitle.setText("Bloqueados");
        pn_widgetBlocked.add(lb_widgetBlockedTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 10, 135, -1));

        lb_widgetBlockedTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_widgetBlockedTotal.setForeground(new java.awt.Color(235, 94, 40));
        lb_widgetBlockedTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_widgetBlockedTotal.setText("0");
        pn_widgetBlocked.add(lb_widgetBlockedTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_widgetBlocked.setForeground(new java.awt.Color(164, 158, 147));
        pn_widgetBlocked.add(sp_widgetBlocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_widgetBlockedFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_widgetBlocked.add(lb_widgetBlockedFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_widgetBlockedFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_widgetBlockedFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_widgetBlockedFooterTitle.setText("Actualizado");
        pn_widgetBlocked.add(lb_widgetBlockedFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_widgetBlocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 35, 255, 140));

        pn_widgetVehicles.setBackground(new java.awt.Color(255, 255, 255));
        pn_widgetVehicles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_widgetVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_widgetVehiclesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_widgetVehiclesMouseExited(evt);
            }
        });
        pn_widgetVehicles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_widgetVehiclesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vehicles 70px.png"))); // NOI18N
        pn_widgetVehicles.add(lb_widgetVehiclesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_widgetVehiclesTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_widgetVehiclesTitle.setForeground(new java.awt.Color(104, 179, 200));
        lb_widgetVehiclesTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_widgetVehiclesTitle.setText("Vehículos");
        pn_widgetVehicles.add(lb_widgetVehiclesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, -1));

        lb_widgetVehiclesTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_widgetVehiclesTotal.setForeground(new java.awt.Color(104, 179, 200));
        lb_widgetVehiclesTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_widgetVehiclesTotal.setText("0");
        pn_widgetVehicles.add(lb_widgetVehiclesTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_widgetVehicles.setForeground(new java.awt.Color(164, 158, 147));
        pn_widgetVehicles.add(sp_widgetVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_widgetVehiclesFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_widgetVehicles.add(lb_widgetVehiclesFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_widgetVehiclesFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_widgetVehiclesFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_widgetVehiclesFooterTitle.setText("Actualizado");
        pn_widgetVehicles.add(lb_widgetVehiclesFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_widgetVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 35, 255, 140));

        pn_stats.setBackground(new java.awt.Color(255, 255, 255));
        pn_stats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_dashboard.add(pn_stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 800, 300));

        pn_calculator.setBackground(new java.awt.Color(255, 255, 255));
        pn_calculator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_dashboard.add(pn_calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 190, 255, 300));

        pn_empty1.setBackground(new java.awt.Color(255, 255, 255));
        pn_empty1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_dashboard.add(pn_empty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 505, 255, 210));

        pn_empty2.setBackground(new java.awt.Color(255, 255, 255));
        pn_empty2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_dashboard.add(pn_empty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 505, 255, 210));

        pn_empty3.setBackground(new java.awt.Color(255, 255, 255));
        pn_dashboard.add(pn_empty3, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 505, 255, 210));

        pn_empty4.setBackground(new java.awt.Color(255, 255, 255));
        pn_dashboard.add(pn_empty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 505, 255, 210));

        getContentPane().add(pn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1130, 740));

        pn_system.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_main.setPreferredSize(new java.awt.Dimension(1130, 640));
        pn_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_entrance.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_entrance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Entrance 300px.jpg"))); // NOI18N
        btn_entrance.setText("Entrada");
        btn_entrance.setToolTipText("Ingresar un nuevo vehículo.");
        btn_entrance.setBorder(null);
        btn_entrance.setBorderPainted(false);
        btn_entrance.setContentAreaFilled(false);
        btn_entrance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrance.setFocusPainted(false);
        btn_entrance.setFocusable(false);
        btn_entrance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_entrance.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_entrance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entranceActionPerformed(evt);
            }
        });
        pn_main.add(btn_entrance, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btn_payment.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Payment 300px.png"))); // NOI18N
        btn_payment.setText("Salida");
        btn_payment.setToolTipText("Realizar la salida de un vehículo.");
        btn_payment.setBorder(null);
        btn_payment.setBorderPainted(false);
        btn_payment.setContentAreaFilled(false);
        btn_payment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_payment.setFocusPainted(false);
        btn_payment.setFocusable(false);
        btn_payment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_payment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });
        pn_main.add(btn_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        lb_truckIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Truck 50px.png"))); // NOI18N
        pn_main.add(lb_truckIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 50, -1));

        lb_trucks.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_trucks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_trucks.setText("0");
        lb_trucks.setToolTipText("Cantidad de camiones.");
        pn_main.add(lb_trucks, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 50, 50));

        lb_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Car 50px.png"))); // NOI18N
        pn_main.add(lb_carIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, 50, 50));

        lb_cars.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_cars.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cars.setText("0");
        lb_cars.setToolTipText("Cantidad de automóviles.");
        pn_main.add(lb_cars, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 50, 50));

        lb_motorcycleIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Motorcycle 50px.png"))); // NOI18N
        pn_main.add(lb_motorcycleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 50, 50));

        lb_motorcycles.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_motorcycles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_motorcycles.setText("0");
        lb_motorcycles.setToolTipText("Cantidad de motocicletas.");
        pn_main.add(lb_motorcycles, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 50, 50));

        pn_btnShowVehicles.setBackground(new java.awt.Color(38, 67, 72));
        pn_btnShowVehicles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_showVehicles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_showVehicles.setForeground(new java.awt.Color(224, 224, 224));
        lb_showVehicles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_showVehicles.setText("Ver listado de vehículos");
        lb_showVehicles.setToolTipText("Ver listado de vehículos actualmente en el sistema.");
        lb_showVehicles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_showVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_showVehiclesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_showVehiclesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_showVehiclesMousePressed(evt);
            }
        });
        pn_btnShowVehicles.add(lb_showVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        pn_main.add(pn_btnShowVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, 190, 30));

        pn_system.add(pn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pn_type.setPreferredSize(new java.awt.Dimension(1130, 640));
        pn_type.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_returnType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return 60px.png"))); // NOI18N
        btn_returnType.setToolTipText("Volver.");
        btn_returnType.setBorder(null);
        btn_returnType.setBorderPainted(false);
        btn_returnType.setContentAreaFilled(false);
        btn_returnType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returnType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnTypeActionPerformed(evt);
            }
        });
        pn_type.add(btn_returnType, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        lb_title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_title.setForeground(new java.awt.Color(38, 67, 72));
        lb_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_title.setText("Seleccione el tipo de vehículo");
        pn_type.add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1130, -1));

        btn_truck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Truck 300px.png"))); // NOI18N
        btn_truck.setToolTipText("Camión.");
        btn_truck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_truck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_truckActionPerformed(evt);
            }
        });
        pn_type.add(btn_truck, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 300, 300));

        btn_car.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Car 300px.jpg"))); // NOI18N
        btn_car.setToolTipText("Automóvil.");
        btn_car.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carActionPerformed(evt);
            }
        });
        pn_type.add(btn_car, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 300, 300));

        btn_motorcycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Motorcycle 300px.jpg"))); // NOI18N
        btn_motorcycle.setToolTipText("Motocicleta.");
        btn_motorcycle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_motorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_motorcycleActionPerformed(evt);
            }
        });
        pn_type.add(btn_motorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, 300, 300));

        pn_system.add(pn_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pn_truck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_returnTruck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return 60px.png"))); // NOI18N
        btn_returnTruck.setToolTipText("Volver.");
        btn_returnTruck.setBorder(null);
        btn_returnTruck.setBorderPainted(false);
        btn_returnTruck.setContentAreaFilled(false);
        btn_returnTruck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returnTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnTruckActionPerformed(evt);
            }
        });
        pn_truck.add(btn_returnTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        lb_iconTruck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iconTruck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Truck 300px.png"))); // NOI18N
        pn_truck.add(lb_iconTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1130, -1));

        pn_inputTruck.setBackground(new java.awt.Color(38, 50, 56));
        pn_inputTruck.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titleTruck.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_titleTruck.setForeground(new java.awt.Color(255, 255, 255));
        lb_titleTruck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titleTruck.setText("Ingrese la placa del camión");
        pn_inputTruck.add(lb_titleTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));
        pn_inputTruck.add(sp_inputTitleTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 1070, 10));

        lb_truck.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_truck.setForeground(new java.awt.Color(255, 255, 255));
        lb_truck.setText("Placa del vehículo:");
        pn_inputTruck.add(lb_truck, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 40));

        tbx_idTruck.setBackground(new java.awt.Color(38, 50, 56));
        tbx_idTruck.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tbx_idTruck.setForeground(new java.awt.Color(255, 255, 255));
        tbx_idTruck.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbx_idTruck.setToolTipText("Ingrese la placa del camión.");
        tbx_idTruck.setBorder(null);
        tbx_idTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_idTruckActionPerformed(evt);
            }
        });
        tbx_idTruck.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_idTruckKeyTyped(evt);
            }
        });
        pn_inputTruck.add(tbx_idTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 240, 40));
        pn_inputTruck.add(sp_inputTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 240, 10));

        btn_calendarTruck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar 60px.png"))); // NOI18N
        btn_calendarTruck.setToolTipText("Renta Diaria / Nocturna.");
        btn_calendarTruck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_calendarTruck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calendarTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calendarTruckActionPerformed(evt);
            }
        });
        pn_inputTruck.add(btn_calendarTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        btn_clockTruck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clock 60px.png"))); // NOI18N
        btn_clockTruck.setToolTipText("Renta por horas.");
        btn_clockTruck.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_clockTruck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clockTruck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clockTruckActionPerformed(evt);
            }
        });
        pn_inputTruck.add(btn_clockTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        pn_truck.add(pn_inputTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 1070, 170));

        pn_system.add(pn_truck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pn_car.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_returnCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return 60px.png"))); // NOI18N
        btn_returnCar.setBorder(null);
        btn_returnCar.setBorderPainted(false);
        btn_returnCar.setContentAreaFilled(false);
        btn_returnCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnCarActionPerformed(evt);
            }
        });
        pn_car.add(btn_returnCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        lb_iconCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iconCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Car 300px.jpg"))); // NOI18N
        pn_car.add(lb_iconCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1130, -1));

        pn_inputCar.setBackground(new java.awt.Color(38, 50, 56));
        pn_inputCar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titleCar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_titleCar.setForeground(new java.awt.Color(255, 255, 255));
        lb_titleCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titleCar.setText("Ingrese la placa del automóvil");
        pn_inputCar.add(lb_titleCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));
        pn_inputCar.add(sp_inputTitleCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 1070, 10));

        lb_textCar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_textCar.setForeground(new java.awt.Color(255, 255, 255));
        lb_textCar.setText("Placa del vehículo:");
        pn_inputCar.add(lb_textCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 40));

        tbx_idCar.setBackground(new java.awt.Color(38, 50, 56));
        tbx_idCar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tbx_idCar.setForeground(new java.awt.Color(255, 255, 255));
        tbx_idCar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbx_idCar.setToolTipText("Ingrese la placa del automóvil.");
        tbx_idCar.setBorder(null);
        tbx_idCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_idCarActionPerformed(evt);
            }
        });
        tbx_idCar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_idCarKeyTyped(evt);
            }
        });
        pn_inputCar.add(tbx_idCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 240, 40));
        pn_inputCar.add(sp_inputCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 240, 10));

        btn_calendarCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar 60px.png"))); // NOI18N
        btn_calendarCar.setToolTipText("Renta Diaria / Nocturna.");
        btn_calendarCar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_calendarCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calendarCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calendarCarActionPerformed(evt);
            }
        });
        pn_inputCar.add(btn_calendarCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        btn_clockCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clock 60px.png"))); // NOI18N
        btn_clockCar.setToolTipText("Renta por horas.");
        btn_clockCar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_clockCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clockCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clockCarActionPerformed(evt);
            }
        });
        pn_inputCar.add(btn_clockCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        pn_car.add(pn_inputCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 1070, 170));

        pn_system.add(pn_car, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pn_motorcycle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_returnMotorcycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return 60px.png"))); // NOI18N
        btn_returnMotorcycle.setBorder(null);
        btn_returnMotorcycle.setBorderPainted(false);
        btn_returnMotorcycle.setContentAreaFilled(false);
        btn_returnMotorcycle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returnMotorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnMotorcycleActionPerformed(evt);
            }
        });
        pn_motorcycle.add(btn_returnMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        lb_iconMotorcycle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_iconMotorcycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Motorcycle 300px.jpg"))); // NOI18N
        pn_motorcycle.add(lb_iconMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1130, -1));

        pn_inputMotorcycle.setBackground(new java.awt.Color(38, 50, 56));
        pn_inputMotorcycle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_titleMotorcycle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_titleMotorcycle.setForeground(new java.awt.Color(255, 255, 255));
        lb_titleMotorcycle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titleMotorcycle.setText("Ingrese la placa de la motocicleta");
        pn_inputMotorcycle.add(lb_titleMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));
        pn_inputMotorcycle.add(sp_inputTitleMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 1070, 10));

        lb_textMotorcycle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_textMotorcycle.setForeground(new java.awt.Color(255, 255, 255));
        lb_textMotorcycle.setText("Placa del vehículo:");
        pn_inputMotorcycle.add(lb_textMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 40));

        tbx_idMotorcycle.setBackground(new java.awt.Color(38, 50, 56));
        tbx_idMotorcycle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tbx_idMotorcycle.setForeground(new java.awt.Color(255, 255, 255));
        tbx_idMotorcycle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbx_idMotorcycle.setToolTipText("Ingrese la placa de la motocicleta.");
        tbx_idMotorcycle.setBorder(null);
        tbx_idMotorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_idMotorcycleActionPerformed(evt);
            }
        });
        tbx_idMotorcycle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_idMotorcycleKeyTyped(evt);
            }
        });
        pn_inputMotorcycle.add(tbx_idMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 240, 40));
        pn_inputMotorcycle.add(sp_inputMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 240, 10));

        btn_calendarMotorcycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar 60px.png"))); // NOI18N
        btn_calendarMotorcycle.setToolTipText("Renta Diaria / Nocturna.");
        btn_calendarMotorcycle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_calendarMotorcycle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_calendarMotorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calendarMotorcycleActionPerformed(evt);
            }
        });
        pn_inputMotorcycle.add(btn_calendarMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        btn_clockMotorcycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clock 60px.png"))); // NOI18N
        btn_clockMotorcycle.setToolTipText("Renta por horas.");
        btn_clockMotorcycle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_clockMotorcycle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clockMotorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clockMotorcycleActionPerformed(evt);
            }
        });
        pn_inputMotorcycle.add(btn_clockMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        pn_motorcycle.add(pn_inputMotorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 1070, 170));

        pn_system.add(pn_motorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pn_payment.setPreferredSize(new java.awt.Dimension(1130, 640));
        pn_payment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_paymentInput.setPreferredSize(new java.awt.Dimension(1130, 640));
        pn_paymentInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_returnPaymentInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return 60px.png"))); // NOI18N
        btn_returnPaymentInput.setToolTipText("Volver.");
        btn_returnPaymentInput.setBorder(null);
        btn_returnPaymentInput.setBorderPainted(false);
        btn_returnPaymentInput.setContentAreaFilled(false);
        btn_returnPaymentInput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returnPaymentInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnPaymentInputActionPerformed(evt);
            }
        });
        pn_paymentInput.add(btn_returnPaymentInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        pn_paymentInputData.setBackground(new java.awt.Color(38, 50, 56));
        pn_paymentInputData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_paymentInputTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_paymentInputTitle.setForeground(new java.awt.Color(255, 255, 255));
        lb_paymentInputTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_paymentInputTitle.setText("Digite la placa del vehículo");
        pn_paymentInputData.add(lb_paymentInputTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));
        pn_paymentInputData.add(sp_paymentInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 970, 10));

        lb_idVehicle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_idVehicle.setForeground(new java.awt.Color(255, 255, 255));
        lb_idVehicle.setText("Placa del vehículo:");
        pn_paymentInputData.add(lb_idVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 50));

        tbx_idVehicle.setBackground(new java.awt.Color(38, 50, 56));
        tbx_idVehicle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tbx_idVehicle.setForeground(new java.awt.Color(255, 255, 255));
        tbx_idVehicle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbx_idVehicle.setBorder(null);
        tbx_idVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_idVehicleActionPerformed(evt);
            }
        });
        tbx_idVehicle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_idVehicleKeyTyped(evt);
            }
        });
        pn_paymentInputData.add(tbx_idVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 270, 50));
        pn_paymentInputData.add(sp_idVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 270, 10));

        btn_showPaymentDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Continue 60px.png"))); // NOI18N
        btn_showPaymentDetails.setToolTipText("Ver detalles");
        btn_showPaymentDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_showPaymentDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_showPaymentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showPaymentDetailsActionPerformed(evt);
            }
        });
        pn_paymentInputData.add(btn_showPaymentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        pn_paymentInput.add(pn_paymentInputData, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 970, 180));

        pn_payment.add(pn_paymentInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        pn_paymentData.setBackground(new java.awt.Color(244, 243, 239));
        pn_paymentData.setMinimumSize(new java.awt.Dimension(1130, 740));
        pn_paymentData.setPreferredSize(new java.awt.Dimension(1130, 740));
        pn_paymentData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_returnPaymentData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return 60px.png"))); // NOI18N
        btn_returnPaymentData.setToolTipText("Volver.");
        btn_returnPaymentData.setBorder(null);
        btn_returnPaymentData.setBorderPainted(false);
        btn_returnPaymentData.setContentAreaFilled(false);
        btn_returnPaymentData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returnPaymentData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnPaymentDataActionPerformed(evt);
            }
        });
        pn_paymentData.add(btn_returnPaymentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        pn_paymentInputData1.setBackground(new java.awt.Color(38, 50, 56));
        pn_paymentInputData1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_paymentInputTitless.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_paymentInputTitless.setForeground(new java.awt.Color(255, 255, 255));
        lb_paymentInputTitless.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_paymentInputTitless.setText("Información del vehículo");
        pn_paymentInputData1.add(lb_paymentInputTitless, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));
        pn_paymentInputData1.add(sp_paymentInputss1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 970, 10));

        pn_paymentDetails.setBackground(new java.awt.Color(255, 255, 255));
        pn_paymentDetails.setForeground(new java.awt.Color(153, 0, 0));
        pn_paymentDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_EntryDate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryDate.setForeground(new java.awt.Color(0, 102, 0));
        lb_EntryDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_EntryDate.setText("Fecha de entrada:");
        pn_paymentDetails.add(lb_EntryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 210, 30));

        lb_EntryDateData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryDateData.setForeground(new java.awt.Color(0, 102, 0));
        lb_EntryDateData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_EntryDateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 140, 30));

        lb_EntryTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryTime.setForeground(new java.awt.Color(0, 102, 0));
        lb_EntryTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_EntryTime.setText("Hora de entrada:");
        pn_paymentDetails.add(lb_EntryTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, 210, 30));

        lb_EntryTimeData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryTimeData.setForeground(new java.awt.Color(0, 102, 0));
        lb_EntryTimeData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_EntryTimeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 75, 190, 30));

        lb_DepartureDate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureDate.setForeground(new java.awt.Color(153, 0, 0));
        lb_DepartureDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_DepartureDate.setText("Fecha de salida:");
        lb_DepartureDate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pn_paymentDetails.add(lb_DepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 30));

        lb_DepartureDateData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureDateData.setForeground(new java.awt.Color(153, 0, 0));
        lb_DepartureDateData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_DepartureDateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 140, 30));

        lb_DepartureTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureTime.setForeground(new java.awt.Color(153, 0, 0));
        lb_DepartureTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_DepartureTime.setText("Hora de salida:");
        pn_paymentDetails.add(lb_DepartureTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 145, 210, 30));

        lb_DepartureTimeData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureTimeData.setForeground(new java.awt.Color(153, 0, 0));
        lb_DepartureTimeData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_DepartureTimeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 145, 180, 30));

        lb_TotalTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TotalTime.setText("Tiempo de estadia:");
        pn_paymentDetails.add(lb_TotalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 30));

        lb_TotalTimeData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTimeData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_TotalTimeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 330, 30));

        lb_Plate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_Plate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Plate.setText("Placa:");
        pn_paymentDetails.add(lb_Plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 70, 30));

        lb_PlateData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_PlateData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_PlateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 140, 30));

        lb_TypeVehicle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeVehicle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TypeVehicle.setText("Tipo de vehículo:");
        pn_paymentDetails.add(lb_TypeVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 75, 200, 30));

        lb_TypeVehicleData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeVehicleData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_TypeVehicleData, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 75, 150, 30));

        lb_TypeTicket.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeTicket.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TypeTicket.setText("Tipo de cliente:");
        pn_paymentDetails.add(lb_TypeTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 180, 30));

        lb_TypeTicketData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeTicketData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_TypeTicketData, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 170, 30));

        lb_Margin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_Margin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Margin.setText("Margen:");
        pn_paymentDetails.add(lb_Margin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 100, 30));

        lb_MarginData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_MarginData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_MarginData, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 140, 30));

        lb_TotalTimeRounded.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTimeRounded.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TotalTimeRounded.setText("Tiempo a cobrar:");
        pn_paymentDetails.add(lb_TotalTimeRounded, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 145, 200, 30));

        lb_TotalTimeRoundedData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTimeRoundedData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pn_paymentDetails.add(lb_TotalTimeRoundedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 145, 60, 30));

        jPanel3.setBackground(new java.awt.Color(38, 50, 56));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_payment.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_payment.setForeground(new java.awt.Color(255, 255, 255));
        lb_payment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(lb_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 290, 100));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total a pagar:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 340, 100));

        btn_showDetails3.setBackground(new java.awt.Color(38, 50, 56));
        btn_showDetails3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information 50px.png"))); // NOI18N
        btn_showDetails3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_showDetails3.setContentAreaFilled(false);
        btn_showDetails3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(btn_showDetails3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 25, -1, -1));

        btn_showDetailsaaa.setBackground(new java.awt.Color(38, 50, 56));
        btn_showDetailsaaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print 50px.png"))); // NOI18N
        btn_showDetailsaaa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 50, 56), 2, true));
        btn_showDetailsaaa.setContentAreaFilled(false);
        btn_showDetailsaaa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_showDetailsaaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showDetailsaaaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_showDetailsaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 25, -1, -1));

        pn_paymentDetails.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 870, 100));

        pn_paymentInputData1.add(pn_paymentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 930, 370));

        pn_paymentData.add(pn_paymentInputData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 970, 480));

        pn_payment.add(pn_paymentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));
        pn_paymentData.getAccessibleContext().setAccessibleName("");

        pn_system.add(pn_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        getContentPane().add(pn_system, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1130, 740));

        pn_bottom.setBackground(new java.awt.Color(38, 67, 72));
        pn_bottom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setBackground(new java.awt.Color(244, 243, 239));
        lb_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_name.setForeground(new java.awt.Color(224, 224, 224));
        lb_name.setText("Parqueo Chalit LyF S.A.");
        lb_name.setToolTipText("");
        pn_bottom.add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 640, 27));

        lb_hour.setBackground(new java.awt.Color(244, 243, 239));
        lb_hour.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_hour.setForeground(new java.awt.Color(224, 224, 224));
        lb_hour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hour.setText("12:00:00 a.m.");
        lb_hour.setToolTipText("");
        lb_hour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pn_bottom.add(lb_hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 120, 27));

        sp_date.setForeground(new java.awt.Color(224, 224, 224));
        sp_date.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pn_bottom.add(sp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 5, -1, 20));

        lb_fecha.setBackground(new java.awt.Color(244, 243, 239));
        lb_fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_fecha.setForeground(new java.awt.Color(224, 224, 224));
        lb_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fecha.setText("01/01/2000");
        lb_fecha.setToolTipText("");
        lb_fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pn_bottom.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 0, 100, 27));

        sp_date1.setForeground(new java.awt.Color(224, 224, 224));
        sp_date1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pn_bottom.add(sp_date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(995, 5, -1, 20));

        jPanel1.setBackground(new java.awt.Color(38, 67, 72));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Money 25px.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 2, -1, -1));

        pn_bottom.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 0, 40, 30));

        getContentPane().add(pn_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 740, 1130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_1MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        MenuMouseEntered(1);
    }//GEN-LAST:event_item_1MouseEntered

    private void item_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_1MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        SetMenuConfiguration();
    }//GEN-LAST:event_item_1MouseExited

    private void item_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_1MousePressed
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item = "item_1";
        SetMenuConfiguration();

        /* ----------------------- DASHBOARD WIDGETS ------------------------ */
        GetWidgetsInfo();

        /* --------------------- PANELS CONFIGURATION ----------------------- */
        ClearPanels();
        pn_dashboard.setVisible(true);
    }//GEN-LAST:event_item_1MousePressed

    private void item_8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_8MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        MenuMouseEntered(9);
    }//GEN-LAST:event_item_8MouseEntered

    private void item_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_8MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        SetMenuConfiguration();
    }//GEN-LAST:event_item_8MouseExited

    private void item_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_8MousePressed
        /* ------------------------------ EXIT ------------------------------ */
        dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_item_8MousePressed

    private void btn_entranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entranceActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_type.setVisible(true);
    }//GEN-LAST:event_btn_entranceActionPerformed

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_payment.setVisible(true);
        pn_paymentInput.setVisible(true);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idVehicle.requestFocus();
    }//GEN-LAST:event_btn_paymentActionPerformed

    private void lb_showVehiclesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showVehiclesMousePressed
        /* ---------------------- SHOW LIST CONTROL ------------------------- */
        if (cls_methods.ShowListControl == false) {
            new frmShowList().setVisible(true);
            cls_methods.ShowListControl = true;
        }
    }//GEN-LAST:event_lb_showVehiclesMousePressed

    private void btn_truckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_truckActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_truck.setVisible(true);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idTruck.requestFocus();
    }//GEN-LAST:event_btn_truckActionPerformed

    private void btn_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_car.setVisible(true);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idCar.requestFocus();
    }//GEN-LAST:event_btn_carActionPerformed

    private void btn_motorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_motorcycleActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_motorcycle.setVisible(true);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idMotorcycle.requestFocus();
    }//GEN-LAST:event_btn_motorcycleActionPerformed

    private void btn_returnTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnTypeActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_main.setVisible(true);
    }//GEN-LAST:event_btn_returnTypeActionPerformed

    private void btn_returnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnCarActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_type.setVisible(true);

        /* ----------------------------- OTHERS ----------------------------- */
        tbx_idCar.setText(null);
    }//GEN-LAST:event_btn_returnCarActionPerformed

    private void btn_calendarCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarCarActionPerformed
        /* ------------------ ENTRY OF CARS AS DAILY RENT ------------------- */

    }//GEN-LAST:event_btn_calendarCarActionPerformed

    private void btn_clockCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clockCarActionPerformed
        /* ---------------- ENTRY OF CARS AS RENT FOR HOURS ----------------- */
        ID_VEHICLE = tbx_idCar.getText();
        NewVehicle(ID_VEHICLE, "CLIENTE CASUAL", "AUTOMÓVIL");
    }//GEN-LAST:event_btn_clockCarActionPerformed

    private void btn_returnMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnMotorcycleActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_type.setVisible(true);

        /* ----------------------------- OTHERS ----------------------------- */
        tbx_idMotorcycle.setText(null);
    }//GEN-LAST:event_btn_returnMotorcycleActionPerformed

    private void btn_calendarMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarMotorcycleActionPerformed
        /* -------------- ENTRY OF MOTORCYCLES AS DAILY RENT ---------------- */

    }//GEN-LAST:event_btn_calendarMotorcycleActionPerformed

    private void btn_clockMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clockMotorcycleActionPerformed
        /* ------------- ENTRY OF MOTORCYCLES AS RENT FOR HOURS ------------- */
        ID_VEHICLE = tbx_idMotorcycle.getText();
        NewVehicle(ID_VEHICLE, "CLIENTE CASUAL", "MOTOCICLETA");
    }//GEN-LAST:event_btn_clockMotorcycleActionPerformed

    private void lb_showVehiclesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showVehiclesMouseEntered
        pn_btnShowVehicles.setBackground(new Color(69, 90, 100));  // ON
    }//GEN-LAST:event_lb_showVehiclesMouseEntered

    private void lb_showVehiclesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showVehiclesMouseExited
        pn_btnShowVehicles.setBackground(new Color(38, 50, 56));   // OFF
    }//GEN-LAST:event_lb_showVehiclesMouseExited

    private void tbx_idCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_idCarActionPerformed
        /* ---------------- ENTRY OF CARS AS RENT FOR HOURS ----------------- */
        ID_VEHICLE = tbx_idCar.getText();
        NewVehicle(ID_VEHICLE, "CLIENTE CASUAL", "AUTOMÓVIL");
    }//GEN-LAST:event_tbx_idCarActionPerformed

    private void tbx_idMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_idMotorcycleActionPerformed
        /* ------------- ENTRY OF MOTORCYCLES AS RENT FOR HOURS ------------- */
        ID_VEHICLE = tbx_idMotorcycle.getText();
        NewVehicle(ID_VEHICLE, "CLIENTE CASUAL", "MOTOCICLETA");
    }//GEN-LAST:event_tbx_idMotorcycleActionPerformed

    private void tbx_idCarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_idCarKeyTyped
        /* ---------------------- CONVERT TO UPPERCASE ---------------------- */
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_tbx_idCarKeyTyped

    private void tbx_idMotorcycleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_idMotorcycleKeyTyped
        /* ---------------------- CONVERT TO UPPERCASE ---------------------- */
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_tbx_idMotorcycleKeyTyped

    private void item_7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_7MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        MenuMouseEntered(3);
    }//GEN-LAST:event_item_7MouseEntered

    private void item_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_7MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        SetMenuConfiguration();
    }//GEN-LAST:event_item_7MouseExited

    private void item_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_7MousePressed
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item = "item_3";
        SetMenuConfiguration();

        /* --------------------- PANELS CONFIGURATION ----------------------- */
        ClearPanels();
    }//GEN-LAST:event_item_7MousePressed

    private void item_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_2MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        MenuMouseEntered(2);
    }//GEN-LAST:event_item_2MouseEntered

    private void item_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_2MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        SetMenuConfiguration();
    }//GEN-LAST:event_item_2MouseExited

    private void item_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_2MousePressed
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item = "item_2";
        SetMenuConfiguration();

        /* ----------------------- DASHBOARD WIDGETS ------------------------ */
        GetVehiclesCount();

        /* --------------------- PANELS CONFIGURATION ----------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_main.setVisible(true);
    }//GEN-LAST:event_item_2MousePressed

    private void tbx_idTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_idTruckActionPerformed
        /* ------------- ENTRY OF MOTORCYCLES AS RENT FOR HOURS ------------- */
        ID_VEHICLE = tbx_idTruck.getText();
        NewVehicle(ID_VEHICLE, "CLIENTE CASUAL", "CAMIÓN");
    }//GEN-LAST:event_tbx_idTruckActionPerformed

    private void tbx_idTruckKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_idTruckKeyTyped
        /* ---------------------- CONVERT TO UPPERCASE ---------------------- */
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_tbx_idTruckKeyTyped

    private void btn_calendarTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarTruckActionPerformed
        /* ----------------- ENTRY OF TRUCKS AS DAILY RENT ------------------ */

    }//GEN-LAST:event_btn_calendarTruckActionPerformed

    private void btn_clockTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clockTruckActionPerformed
        /* --------------- ENTRY OF TRUCKS AS RENT FOR HOURS ---------------- */
        ID_VEHICLE = tbx_idTruck.getText();
        NewVehicle(ID_VEHICLE, "CLIENTE CASUAL", "CAMIÓN");
    }//GEN-LAST:event_btn_clockTruckActionPerformed

    private void btn_returnTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnTruckActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_type.setVisible(true);

        /* ----------------------------- OTHERS ----------------------------- */
        tbx_idTruck.setText(null);
    }//GEN-LAST:event_btn_returnTruckActionPerformed

    private void btn_returnPaymentInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnPaymentInputActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_main.setVisible(true);

        /* ----------------------------- OTHERS ----------------------------- */
        tbx_idVehicle.setText(null);
    }//GEN-LAST:event_btn_returnPaymentInputActionPerformed

    private void btn_showPaymentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showPaymentDetailsActionPerformed
        /* ---------------------- GET PAYMENT DETAILS ----------------------- */
        ID_VEHICLE = tbx_idVehicle.getText();
        ShowPaymentDetails();
    }//GEN-LAST:event_btn_showPaymentDetailsActionPerformed

    private void tbx_idVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_idVehicleActionPerformed
        /* ---------------------- GET PAYMENT DETAILS ----------------------- */
        ID_VEHICLE = tbx_idVehicle.getText();
        ShowPaymentDetails();
    }//GEN-LAST:event_tbx_idVehicleActionPerformed

    private void tbx_idVehicleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_idVehicleKeyTyped
        /* ---------------------- CONVERT TO UPPERCASE ---------------------- */
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_tbx_idVehicleKeyTyped

    private void btn_returnPaymentDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnPaymentDataActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_payment.setVisible(true);
        pn_paymentInput.setVisible(true);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idVehicle.setText(null);
        tbx_idVehicle.requestFocus();
    }//GEN-LAST:event_btn_returnPaymentDataActionPerformed

    private void btn_showDetailsaaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showDetailsaaaActionPerformed
        String IdVehicle = lb_PlateData.getText();
        String TypeVehicle = lb_TypeVehicleData.getText();
        String Entry = lb_EntryDateData.getText() + " " + lb_EntryTimeData.getText();
        String Departure = lb_DepartureDateData.getText() + " " + lb_DepartureTimeData.getText();
        String StayTime = lb_TotalTimeData.getText();
        String Payment = lb_payment.getText();

        mt.rp_CasualPayment(IdVehicle, TypeVehicle, Entry, Departure, StayTime, Payment);

        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        ClearPanels();
        pn_system.setVisible(true);
        pn_main.setVisible(true);
    }//GEN-LAST:event_btn_showDetailsaaaActionPerformed

    private void pn_widgetUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetUsersMouseEntered
        pn_widgetUsers.setBackground(new Color(250, 250, 250));  // ON
    }//GEN-LAST:event_pn_widgetUsersMouseEntered

    private void pn_widgetUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetUsersMouseExited
        pn_widgetUsers.setBackground(new Color(255, 255, 255));  // OFF
    }//GEN-LAST:event_pn_widgetUsersMouseExited

    private void pn_widgetPartnersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetPartnersMouseExited
        pn_widgetPartners.setBackground(new Color(255, 255, 255));  // OFF
    }//GEN-LAST:event_pn_widgetPartnersMouseExited

    private void pn_widgetPartnersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetPartnersMouseEntered
        pn_widgetPartners.setBackground(new Color(250, 250, 250));  // ON
    }//GEN-LAST:event_pn_widgetPartnersMouseEntered

    private void pn_widgetBlockedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetBlockedMouseEntered
        pn_widgetBlocked.setBackground(new Color(250, 250, 250));  // ON
    }//GEN-LAST:event_pn_widgetBlockedMouseEntered

    private void pn_widgetBlockedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetBlockedMouseExited
        pn_widgetBlocked.setBackground(new Color(255, 255, 255));  // OFF
    }//GEN-LAST:event_pn_widgetBlockedMouseExited

    private void pn_widgetVehiclesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetVehiclesMouseEntered
        pn_widgetVehicles.setBackground(new Color(250, 250, 250));  // ON
    }//GEN-LAST:event_pn_widgetVehiclesMouseEntered

    private void pn_widgetVehiclesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_widgetVehiclesMouseExited
        pn_widgetVehicles.setBackground(new Color(255, 255, 255));  // OFF
    }//GEN-LAST:event_pn_widgetVehiclesMouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        jPanel1.setBackground(new Color(38, 50, 56));  // ON
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
        jPanel1.setBackground(new Color(38,67,72));  // OFF
    }//GEN-LAST:event_jPanel1MouseExited

    private void item_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_item_3MouseEntered

    private void item_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_item_3MouseExited

    private void item_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_3MousePressed

    private void item_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_item_4MouseEntered

    private void item_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_item_4MouseExited

    private void item_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_4MousePressed

    private void item_5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_item_5MouseEntered

    private void item_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_item_5MouseExited

    private void item_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_5MousePressed

    private void item_6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_item_6MouseEntered

    private void item_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_item_6MouseExited

    private void item_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_item_6MousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calendarCar;
    private javax.swing.JButton btn_calendarMotorcycle;
    private javax.swing.JButton btn_calendarTruck;
    private javax.swing.JButton btn_car;
    private javax.swing.JButton btn_clockCar;
    private javax.swing.JButton btn_clockMotorcycle;
    private javax.swing.JButton btn_clockTruck;
    private javax.swing.JButton btn_entrance;
    private javax.swing.JButton btn_motorcycle;
    private javax.swing.JButton btn_payment;
    private javax.swing.JButton btn_returnCar;
    private javax.swing.JButton btn_returnMotorcycle;
    private javax.swing.JButton btn_returnPaymentData;
    private javax.swing.JButton btn_returnPaymentInput;
    private javax.swing.JButton btn_returnTruck;
    private javax.swing.JButton btn_returnType;
    private javax.swing.JButton btn_showDetails3;
    private javax.swing.JButton btn_showDetailsaaa;
    private javax.swing.JButton btn_showPaymentDetails;
    private javax.swing.JButton btn_truck;
    private javax.swing.JPanel item_1;
    private javax.swing.JPanel item_2;
    private javax.swing.JPanel item_3;
    private javax.swing.JPanel item_4;
    private javax.swing.JPanel item_5;
    private javax.swing.JPanel item_6;
    private javax.swing.JPanel item_7;
    private javax.swing.JPanel item_8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_DepartureDate;
    private javax.swing.JLabel lb_DepartureDateData;
    private javax.swing.JLabel lb_DepartureTime;
    private javax.swing.JLabel lb_DepartureTimeData;
    private javax.swing.JLabel lb_EntryDate;
    private javax.swing.JLabel lb_EntryDateData;
    private javax.swing.JLabel lb_EntryTime;
    private javax.swing.JLabel lb_EntryTimeData;
    private javax.swing.JLabel lb_Margin;
    private javax.swing.JLabel lb_MarginData;
    private javax.swing.JLabel lb_Plate;
    private javax.swing.JLabel lb_PlateData;
    private javax.swing.JLabel lb_TotalTime;
    private javax.swing.JLabel lb_TotalTimeData;
    private javax.swing.JLabel lb_TotalTimeRounded;
    private javax.swing.JLabel lb_TotalTimeRoundedData;
    private javax.swing.JLabel lb_TypeTicket;
    private javax.swing.JLabel lb_TypeTicketData;
    private javax.swing.JLabel lb_TypeVehicle;
    private javax.swing.JLabel lb_TypeVehicleData;
    private javax.swing.JLabel lb_carIcon;
    private javax.swing.JLabel lb_cars;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_hour;
    private javax.swing.JLabel lb_iconCar;
    private javax.swing.JLabel lb_iconMotorcycle;
    private javax.swing.JLabel lb_iconTruck;
    private javax.swing.JLabel lb_idVehicle;
    private javax.swing.JLabel lb_imgTop;
    private javax.swing.JLabel lb_item1;
    private javax.swing.JLabel lb_item2;
    private javax.swing.JLabel lb_item3;
    private javax.swing.JLabel lb_item4;
    private javax.swing.JLabel lb_item5;
    private javax.swing.JLabel lb_item6;
    private javax.swing.JLabel lb_item7;
    private javax.swing.JLabel lb_item8;
    private javax.swing.JLabel lb_logoItem1;
    private javax.swing.JLabel lb_logoItem2;
    private javax.swing.JLabel lb_logoItem3;
    private javax.swing.JLabel lb_logoItem4;
    private javax.swing.JLabel lb_logoItem5;
    private javax.swing.JLabel lb_logoItem6;
    private javax.swing.JLabel lb_logoItem7;
    private javax.swing.JLabel lb_logoItem8;
    private javax.swing.JLabel lb_motorcycleIcon;
    private javax.swing.JLabel lb_motorcycles;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_payment;
    private javax.swing.JLabel lb_paymentInputTitle;
    private javax.swing.JLabel lb_paymentInputTitless;
    private javax.swing.JLabel lb_showVehicles;
    private javax.swing.JLabel lb_textCar;
    private javax.swing.JLabel lb_textMotorcycle;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_titleCar;
    private javax.swing.JLabel lb_titleMotorcycle;
    private javax.swing.JLabel lb_titleTruck;
    private javax.swing.JLabel lb_truck;
    private javax.swing.JLabel lb_truckIcon;
    private javax.swing.JLabel lb_trucks;
    private javax.swing.JLabel lb_widgetBlockedFooterIcon;
    private javax.swing.JLabel lb_widgetBlockedFooterTitle;
    private javax.swing.JLabel lb_widgetBlockedIcon;
    private javax.swing.JLabel lb_widgetBlockedTitle;
    private javax.swing.JLabel lb_widgetBlockedTotal;
    private javax.swing.JLabel lb_widgetPartnersFooterIcon;
    private javax.swing.JLabel lb_widgetPartnersFooterTitle;
    private javax.swing.JLabel lb_widgetPartnersIcon;
    private javax.swing.JLabel lb_widgetPartnersTitle;
    private javax.swing.JLabel lb_widgetPartnersTotal;
    private javax.swing.JLabel lb_widgetUsersFooterIcon;
    private javax.swing.JLabel lb_widgetUsersFooterTitle;
    private javax.swing.JLabel lb_widgetUsersIcon;
    private javax.swing.JLabel lb_widgetUsersTitle;
    private javax.swing.JLabel lb_widgetUsersTotal;
    private javax.swing.JLabel lb_widgetVehiclesFooterIcon;
    private javax.swing.JLabel lb_widgetVehiclesFooterTitle;
    private javax.swing.JLabel lb_widgetVehiclesIcon;
    private javax.swing.JLabel lb_widgetVehiclesTitle;
    private javax.swing.JLabel lb_widgetVehiclesTotal;
    private javax.swing.JPanel pn_bottom;
    private javax.swing.JPanel pn_btnShowVehicles;
    private javax.swing.JPanel pn_calculator;
    private javax.swing.JPanel pn_car;
    private javax.swing.JPanel pn_dashboard;
    private javax.swing.JPanel pn_empty1;
    private javax.swing.JPanel pn_empty2;
    private javax.swing.JPanel pn_empty3;
    private javax.swing.JPanel pn_empty4;
    private javax.swing.JPanel pn_inputCar;
    private javax.swing.JPanel pn_inputMotorcycle;
    private javax.swing.JPanel pn_inputTruck;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_motorcycle;
    private javax.swing.JPanel pn_payment;
    private javax.swing.JPanel pn_paymentData;
    private javax.swing.JPanel pn_paymentDetails;
    private javax.swing.JPanel pn_paymentInput;
    private javax.swing.JPanel pn_paymentInputData;
    private javax.swing.JPanel pn_paymentInputData1;
    private javax.swing.JPanel pn_stats;
    private javax.swing.JPanel pn_system;
    private javax.swing.JPanel pn_truck;
    private javax.swing.JPanel pn_type;
    private javax.swing.JPanel pn_widgetBlocked;
    private javax.swing.JPanel pn_widgetPartners;
    private javax.swing.JPanel pn_widgetUsers;
    private javax.swing.JPanel pn_widgetVehicles;
    private javax.swing.JSeparator sp_date;
    private javax.swing.JSeparator sp_date1;
    private javax.swing.JSeparator sp_idVehicle;
    private javax.swing.JSeparator sp_inputCar;
    private javax.swing.JSeparator sp_inputMotorcycle;
    private javax.swing.JSeparator sp_inputTitleCar;
    private javax.swing.JSeparator sp_inputTitleMotorcycle;
    private javax.swing.JSeparator sp_inputTitleTruck;
    private javax.swing.JSeparator sp_inputTruck;
    private javax.swing.JSeparator sp_menu;
    private javax.swing.JSeparator sp_paymentInput;
    private javax.swing.JSeparator sp_paymentInputss1;
    private javax.swing.JSeparator sp_widgetBlocked;
    private javax.swing.JSeparator sp_widgetPartners;
    private javax.swing.JSeparator sp_widgetUsers;
    private javax.swing.JSeparator sp_widgetVehicles;
    private javax.swing.JTextField tbx_idCar;
    private javax.swing.JTextField tbx_idMotorcycle;
    private javax.swing.JTextField tbx_idTruck;
    private javax.swing.JTextField tbx_idVehicle;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == th) {
            lb_hour.setText(new GetDateTime().Get12hFullTime());
            lb_fecha.setText(new GetDateTime().GetDate());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private void ClearPanels() {
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(false);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(false);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);

        /* ----------------- PAYMENT PANEL CONFIGURATION -------------------- */
        pn_paymentInput.setVisible(false);
        pn_paymentData.setVisible(false);
    }

    private void GetWidgetsInfo() {
        ArrayList<String> data = mt.SP_GetWidgetsInfo();

        lb_widgetUsersTotal.setText(data.get(0));
        lb_widgetPartnersTotal.setText(data.get(1));
        lb_widgetBlockedTotal.setText(data.get(2));
        lb_widgetVehiclesTotal.setText(data.get(3));
    }

    private void GetVehiclesCount() {
        ArrayList<String> data = mt.SP_GetVehiclesCount();

        lb_trucks.setText(data.get(0));
        lb_cars.setText(data.get(1));
        lb_motorcycles.setText(data.get(2));
    }

    private void MenuMouseEntered(int Item) {
        switch (Item) {
            case 1:
                item_1.setBackground(new Color(38, 50, 56));  // ON
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_7.setBackground(new Color(38, 67, 72));  // OFF
                item_8.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case 2:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 50, 56));  // ON
                item_7.setBackground(new Color(38, 67, 72));  // OFF
                item_8.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case 3:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_7.setBackground(new Color(38, 50, 56));  // ON
                item_8.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case 9:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_7.setBackground(new Color(38, 67, 72));  // OFF
                item_8.setBackground(new Color(80, 0, 0));    // ON
                break;
        }
    }

    private void SetMenuConfiguration() {
        switch (item) {
            case "item_1":
                item_1.setBackground(new Color(38, 50, 56));  // ON
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_7.setBackground(new Color(38, 67, 72));  // OFF
                item_8.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_2":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 50, 56));  // ON
                item_7.setBackground(new Color(38, 67, 72));  // OFF
                item_8.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_3":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_7.setBackground(new Color(38, 50, 56));  // ON
                item_8.setBackground(new Color(102, 0, 0));   // OFF
                break;
            default:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_7.setBackground(new Color(38, 67, 72));  // OFF
                item_8.setBackground(new Color(102, 0, 0));   // OFF
                break;
        }
    }

    private void ShowPaymentDetails() {
        if (ID_VEHICLE.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            if (mt.FN_VehicleExist(ID_VEHICLE)) {
                /* ------------------ PANELS CONFIGURATION ------------------ */
                ClearPanels();
                pn_system.setVisible(true);
                pn_payment.setVisible(true);
                pn_paymentData.setVisible(true);

                /* ------------------------ SET DATA ------------------------ */
                ArrayList<String> data = mt.SP_GetVehicleInfo(ID_VEHICLE);

                lb_EntryDateData.setText(data.get(0));
                lb_EntryTimeData.setText(new GetDateTime().ConvertTo12h(data.get(1)));
                lb_DepartureDateData.setText(data.get(2));
                lb_DepartureTimeData.setText(new GetDateTime().ConvertTo12h(data.get(3)));

                String[] parts = data.get(4).split(":");
                String Hours = parts[0]; // 123
                String Minutes = parts[1]; // 654321
                String Seconds = parts[2]; // 654321

                lb_TotalTimeData.setText(Hours + " Hr " + Minutes + " Min " + Seconds + " Sec");
                lb_PlateData.setText(ID_VEHICLE);
                lb_TypeVehicleData.setText(mt.Capitalize(data.get(5)));
                lb_TypeTicketData.setText(mt.Capitalize(data.get(6)));
                lb_MarginData.setText(data.get(7));
                lb_TotalTimeRoundedData.setText(data.get(8));
                lb_payment.setText("₡ " + data.get(9));
            } else {
                tbx_idVehicle.setText(null);
            }
        }
    }

    private void RestorePlate(String TypeVehicle) {
        switch (TypeVehicle) {
            case "CAMIÓN":
                tbx_idTruck.setText(null);
                break;
            case "AUTOMÓVIL":
                tbx_idCar.setText(null);
                break;
            case "MOTOCICLETA":
                tbx_idMotorcycle.setText(null);
                break;
        }
    }

    private void NewVehicle(String ID_VEHICLE, String TypeTicket, String TypeVehicle) {
        if (ID_VEHICLE.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(ID_VEHICLE, TypeTicket, TypeVehicle)) {
                case "EXIST":
                    mt.Warning("La placa " + ID_VEHICLE + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    RestorePlate(TypeVehicle);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + ID_VEHICLE + " tiene prohibido el ingreso al \nestacionamiento.");
                    RestorePlate(TypeVehicle);
                    break;
                default:
                    /* ---------------- PANELS CONFIGURATION ---------------- */
                    ClearPanels();
                    pn_system.setVisible(true);
                    pn_main.setVisible(true);

                    /* ------------------ VEHICLE COUNTER ------------------- */
                    GetVehiclesCount();

                    /* ---------------------- OTHERS ------------------------ */
                    RestorePlate(TypeVehicle);
                    break;
            }
        }
    }
}
