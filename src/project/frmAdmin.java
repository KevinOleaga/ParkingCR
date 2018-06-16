package project;

import java.awt.Color;
import java.util.ArrayList;
import methods.cls_methods;
import GetDateTime.DateTime;
import static java.awt.Frame.MAXIMIZED_BOTH;
import Atxy2k.CustomTextField.RestrictedTextField;

/**
 * @author Kevin Oleaga Garcia
 * @email oleaga@outlook.com
 * @version 1.0
 */
public class frmAdmin extends javax.swing.JFrame implements Runnable {

    cls_methods mt = new cls_methods();

    Thread th;
    static String plate = null;
    static String item = "item_1";
    static String username = null;

    public frmAdmin() {
        initComponents();
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(true);
        pn_system.setVisible(false);

        /* ----------------------- DASHBOARD WIDGETS ------------------------ */
        lb_WidgetUsersTotal.setText(String.valueOf(mt.FN_CountUsers()));
        lb_WidgetPartnersTotal.setText(String.valueOf(mt.FN_CountPartners()));
        lb_WidgetBlockedTotal.setText(String.valueOf(mt.FN_CountBlackList()));
        lb_WidgetVehiclesTotal.setText(String.valueOf(mt.FN_CountVehicles()));

        /* --------------------- SYSTEM PLATES LENGTH ----------------------- */
        new RestrictedTextField(tbx_idTruck).setLimit(8);
        new RestrictedTextField(tbx_idCar).setLimit(8);
        new RestrictedTextField(tbx_idMotorcycle).setLimit(8);
        
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 50, 56));  // ON
        item_2.setBackground(new Color(38, 67, 72));  // OFF
        item_3.setBackground(new Color(38, 67, 72));  // OFF
        item_9.setBackground(new Color(102, 0, 0));   // OFF

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
        sp_menu = new javax.swing.JSeparator();
        item_9 = new javax.swing.JPanel();
        lb_logoItem9 = new javax.swing.JLabel();
        lb_item9 = new javax.swing.JLabel();
        pn_dashboard = new javax.swing.JPanel();
        pn_WidgetUsers = new javax.swing.JPanel();
        lb_WidgetUsersIcon = new javax.swing.JLabel();
        lb_WidgetUsersTitle = new javax.swing.JLabel();
        lb_WidgetUsersTotal = new javax.swing.JLabel();
        sp_WidgetUsers = new javax.swing.JSeparator();
        lb_WidgetUsersFooterIcon = new javax.swing.JLabel();
        lb_WidgetUsersFooterTitle = new javax.swing.JLabel();
        pn_WidgetPartners = new javax.swing.JPanel();
        lb_WidgetPartnersIcon = new javax.swing.JLabel();
        lb_WidgetPartnersTitle = new javax.swing.JLabel();
        lb_WidgetPartnersTotal = new javax.swing.JLabel();
        sp_WidgetPartners = new javax.swing.JSeparator();
        lb_WidgetPartnersFooterIcon = new javax.swing.JLabel();
        lb_WidgetPartnersFooterTitle = new javax.swing.JLabel();
        pn_WidgetBlocked = new javax.swing.JPanel();
        lb_WidgetBlockedIcon = new javax.swing.JLabel();
        lb_WidgetBlockedTitle = new javax.swing.JLabel();
        lb_WidgetBlockedTotal = new javax.swing.JLabel();
        sp_WidgetBlocked = new javax.swing.JSeparator();
        lb_WidgetBlockedFooterIcon = new javax.swing.JLabel();
        lb_WidgetBlockedFooterTitle = new javax.swing.JLabel();
        pn_WidgetVehicles = new javax.swing.JPanel();
        lb_WidgetVehiclesIcon = new javax.swing.JLabel();
        lb_WidgetVehiclesTitle = new javax.swing.JLabel();
        lb_WidgetVehiclesTotal = new javax.swing.JLabel();
        sp_WidgetVehicles = new javax.swing.JSeparator();
        lb_WidgetVehiclesFooterIcon = new javax.swing.JLabel();
        lb_WidgetVehiclesFooterTitle = new javax.swing.JLabel();
        pn_stats = new javax.swing.JPanel();
        pn_calculator = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
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
        lb_textTruck = new javax.swing.JLabel();
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
        btn_returnPayment = new javax.swing.JButton();
        pn_paymentInput = new javax.swing.JPanel();
        lb_paymentInputTitle = new javax.swing.JLabel();
        sp_paymentInput = new javax.swing.JSeparator();
        lb_plate = new javax.swing.JLabel();
        tbx_idVehicle = new javax.swing.JTextField();
        sp_idVehicle = new javax.swing.JSeparator();
        btn_showDetails = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_showDetails2 = new javax.swing.JButton();
        btn_showDetailsaaa = new javax.swing.JButton();
        pn_bottom = new javax.swing.JPanel();
        lb_name = new javax.swing.JLabel();
        lb_hour = new javax.swing.JLabel();
        sp_date = new javax.swing.JSeparator();
        lb_fecha = new javax.swing.JLabel();

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
        lb_item2.setText("Adm. de parqueo");
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
        lb_item3.setText("Adm. de usuarios");
        item_3.add(lb_item3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 240, 50));
        pn_menu.add(sp_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 445, 220, -1));

        item_9.setBackground(new java.awt.Color(102, 0, 0));
        item_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                item_9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                item_9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                item_9MousePressed(evt);
            }
        });
        item_9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        item_9.add(lb_logoItem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 14, 20, 20));

        lb_item9.setBackground(new java.awt.Color(255, 255, 255));
        lb_item9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_item9.setForeground(new java.awt.Color(224, 224, 224));
        lb_item9.setText("Cerrar Sesión");
        item_9.add(lb_item9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 14, -1, -1));

        pn_menu.add(item_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 455, 240, 50));

        getContentPane().add(pn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 768));

        pn_dashboard.setBackground(new java.awt.Color(244, 243, 239));
        pn_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_WidgetUsers.setBackground(new java.awt.Color(255, 255, 255));
        pn_WidgetUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_WidgetUsersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users 70px.png"))); // NOI18N
        pn_WidgetUsers.add(lb_WidgetUsersIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_WidgetUsersTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_WidgetUsersTitle.setForeground(new java.awt.Color(243, 187, 69));
        lb_WidgetUsersTitle.setText("Usuarios");
        pn_WidgetUsers.add(lb_WidgetUsersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        lb_WidgetUsersTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_WidgetUsersTotal.setForeground(new java.awt.Color(243, 187, 69));
        lb_WidgetUsersTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_WidgetUsersTotal.setText("0");
        pn_WidgetUsers.add(lb_WidgetUsersTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_WidgetUsers.setForeground(new java.awt.Color(164, 158, 147));
        pn_WidgetUsers.add(sp_WidgetUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_WidgetUsersFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_WidgetUsers.add(lb_WidgetUsersFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_WidgetUsersFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_WidgetUsersFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_WidgetUsersFooterTitle.setText("Actualizado");
        pn_WidgetUsers.add(lb_WidgetUsersFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_WidgetUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 255, 140));

        pn_WidgetPartners.setBackground(new java.awt.Color(255, 255, 255));
        pn_WidgetPartners.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_WidgetPartnersIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Partner 70px.png"))); // NOI18N
        pn_WidgetPartners.add(lb_WidgetPartnersIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_WidgetPartnersTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_WidgetPartnersTitle.setForeground(new java.awt.Color(122, 194, 154));
        lb_WidgetPartnersTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_WidgetPartnersTitle.setText("Socios");
        pn_WidgetPartners.add(lb_WidgetPartnersTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, -1));

        lb_WidgetPartnersTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_WidgetPartnersTotal.setForeground(new java.awt.Color(122, 194, 154));
        lb_WidgetPartnersTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_WidgetPartnersTotal.setText("0");
        pn_WidgetPartners.add(lb_WidgetPartnersTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_WidgetPartners.setForeground(new java.awt.Color(164, 158, 147));
        pn_WidgetPartners.add(sp_WidgetPartners, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_WidgetPartnersFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_WidgetPartners.add(lb_WidgetPartnersFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_WidgetPartnersFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_WidgetPartnersFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_WidgetPartnersFooterTitle.setText("Actualizado");
        pn_WidgetPartners.add(lb_WidgetPartnersFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_WidgetPartners, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 35, 255, 140));

        pn_WidgetBlocked.setBackground(new java.awt.Color(255, 255, 255));
        pn_WidgetBlocked.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_WidgetBlockedIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Locked 70px.png"))); // NOI18N
        pn_WidgetBlocked.add(lb_WidgetBlockedIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_WidgetBlockedTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_WidgetBlockedTitle.setForeground(new java.awt.Color(235, 94, 40));
        lb_WidgetBlockedTitle.setText("Bloqueados");
        pn_WidgetBlocked.add(lb_WidgetBlockedTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 10, 135, -1));

        lb_WidgetBlockedTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_WidgetBlockedTotal.setForeground(new java.awt.Color(235, 94, 40));
        lb_WidgetBlockedTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_WidgetBlockedTotal.setText("0");
        pn_WidgetBlocked.add(lb_WidgetBlockedTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_WidgetBlocked.setForeground(new java.awt.Color(164, 158, 147));
        pn_WidgetBlocked.add(sp_WidgetBlocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_WidgetBlockedFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_WidgetBlocked.add(lb_WidgetBlockedFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_WidgetBlockedFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_WidgetBlockedFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_WidgetBlockedFooterTitle.setText("Actualizado");
        pn_WidgetBlocked.add(lb_WidgetBlockedFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_WidgetBlocked, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 35, 255, 140));

        pn_WidgetVehicles.setBackground(new java.awt.Color(255, 255, 255));
        pn_WidgetVehicles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_WidgetVehiclesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vehicles 70px.png"))); // NOI18N
        pn_WidgetVehicles.add(lb_WidgetVehiclesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 70, 70));

        lb_WidgetVehiclesTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_WidgetVehiclesTitle.setForeground(new java.awt.Color(104, 179, 200));
        lb_WidgetVehiclesTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_WidgetVehiclesTitle.setText("Vehículos");
        pn_WidgetVehicles.add(lb_WidgetVehiclesTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 120, -1));

        lb_WidgetVehiclesTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_WidgetVehiclesTotal.setForeground(new java.awt.Color(104, 179, 200));
        lb_WidgetVehiclesTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_WidgetVehiclesTotal.setText("0");
        pn_WidgetVehicles.add(lb_WidgetVehiclesTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, -1));

        sp_WidgetVehicles.setForeground(new java.awt.Color(164, 158, 147));
        pn_WidgetVehicles.add(sp_WidgetVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 10));

        lb_WidgetVehiclesFooterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Updated 25px.png"))); // NOI18N
        pn_WidgetVehicles.add(lb_WidgetVehiclesFooterIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 107, 25, 25));

        lb_WidgetVehiclesFooterTitle.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lb_WidgetVehiclesFooterTitle.setForeground(new java.awt.Color(164, 158, 147));
        lb_WidgetVehiclesFooterTitle.setText("Actualizado");
        pn_WidgetVehicles.add(lb_WidgetVehiclesFooterTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 109, -1, 20));

        pn_dashboard.add(pn_WidgetVehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 35, 255, 140));

        pn_stats.setBackground(new java.awt.Color(255, 255, 255));
        pn_stats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_dashboard.add(pn_stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 800, 300));

        pn_calculator.setBackground(new java.awt.Color(255, 255, 255));
        pn_calculator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_dashboard.add(pn_calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 190, 255, 300));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_dashboard.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 505, 255, 210));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        pn_dashboard.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 505, 255, 210));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        pn_dashboard.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 505, 255, 210));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        pn_dashboard.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 505, 255, 210));

        getContentPane().add(pn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1130, 740));

        pn_system.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_main.setBackground(new java.awt.Color(244, 243, 239));
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

        lb_textTruck.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lb_textTruck.setForeground(new java.awt.Color(255, 255, 255));
        lb_textTruck.setText("Placa del vehículo:");
        pn_inputTruck.add(lb_textTruck, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 40));

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

        btn_returnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return 60px.png"))); // NOI18N
        btn_returnPayment.setToolTipText("Volver.");
        btn_returnPayment.setBorder(null);
        btn_returnPayment.setBorderPainted(false);
        btn_returnPayment.setContentAreaFilled(false);
        btn_returnPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnPaymentActionPerformed(evt);
            }
        });
        pn_payment.add(btn_returnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        pn_paymentInput.setBackground(new java.awt.Color(38, 50, 56));
        pn_paymentInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_paymentInputTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_paymentInputTitle.setForeground(new java.awt.Color(255, 255, 255));
        lb_paymentInputTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_paymentInputTitle.setText("Digite la placa del vehículo");
        pn_paymentInput.add(lb_paymentInputTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));
        pn_paymentInput.add(sp_paymentInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 970, 10));

        lb_plate.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lb_plate.setForeground(new java.awt.Color(255, 255, 255));
        lb_plate.setText("Placa del vehículo:");
        pn_paymentInput.add(lb_plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, 50));

        tbx_idVehicle.setBackground(new java.awt.Color(38, 50, 56));
        tbx_idVehicle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tbx_idVehicle.setForeground(new java.awt.Color(255, 255, 255));
        tbx_idVehicle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tbx_idVehicle.setBorder(null);
        pn_paymentInput.add(tbx_idVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 220, 40));
        pn_paymentInput.add(sp_idVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 220, 10));

        btn_showDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Continue 60px.png"))); // NOI18N
        btn_showDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_showDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_showDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showDetailsActionPerformed(evt);
            }
        });
        pn_paymentInput.add(btn_showDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, -1, -1));

        pn_paymentDetails.setBackground(new java.awt.Color(255, 255, 255));
        pn_paymentDetails.setForeground(new java.awt.Color(153, 0, 0));
        pn_paymentDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_EntryDate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryDate.setForeground(new java.awt.Color(153, 0, 0));
        lb_EntryDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_EntryDate.setText("Fecha de entrada:");
        pn_paymentDetails.add(lb_EntryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, -1));

        lb_EntryDateData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryDateData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_EntryDateData.setText("01/01/2000");
        pn_paymentDetails.add(lb_EntryDateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 140, -1));

        lb_EntryTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryTime.setForeground(new java.awt.Color(153, 0, 0));
        lb_EntryTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_EntryTime.setText("Hora de entrada:");
        pn_paymentDetails.add(lb_EntryTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 220, -1));

        lb_EntryTimeData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_EntryTimeData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_EntryTimeData.setText("12:00:00 pm");
        pn_paymentDetails.add(lb_EntryTimeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 150, -1));

        lb_DepartureDate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureDate.setForeground(new java.awt.Color(153, 0, 0));
        lb_DepartureDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_DepartureDate.setText("Fecha de salida:");
        lb_DepartureDate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pn_paymentDetails.add(lb_DepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 220, -1));

        lb_DepartureDateData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureDateData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_DepartureDateData.setText("01/01/2000");
        pn_paymentDetails.add(lb_DepartureDateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 140, -1));

        lb_DepartureTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureTime.setForeground(new java.awt.Color(153, 0, 0));
        lb_DepartureTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_DepartureTime.setText("Hora de salida:");
        pn_paymentDetails.add(lb_DepartureTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 220, -1));

        lb_DepartureTimeData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_DepartureTimeData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_DepartureTimeData.setText("12:00:00 pm");
        pn_paymentDetails.add(lb_DepartureTimeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 150, -1));

        lb_TotalTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTime.setForeground(new java.awt.Color(153, 0, 0));
        lb_TotalTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TotalTime.setText("Tiempo de estadia:");
        pn_paymentDetails.add(lb_TotalTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 220, -1));

        lb_TotalTimeData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTimeData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_TotalTimeData.setText("12 Hr 00 Min 00 Sec");
        pn_paymentDetails.add(lb_TotalTimeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 230, -1));

        lb_Plate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_Plate.setForeground(new java.awt.Color(153, 0, 0));
        lb_Plate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Plate.setText("Placa:");
        pn_paymentDetails.add(lb_Plate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 70, -1));

        lb_PlateData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_PlateData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_PlateData.setText("12345678");
        pn_paymentDetails.add(lb_PlateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        lb_TypeVehicle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeVehicle.setForeground(new java.awt.Color(153, 0, 0));
        lb_TypeVehicle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TypeVehicle.setText("Tipo de vehículo:");
        pn_paymentDetails.add(lb_TypeVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 200, -1));

        lb_TypeVehicleData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeVehicleData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_TypeVehicleData.setText("Motocicleta");
        pn_paymentDetails.add(lb_TypeVehicleData, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        lb_TypeTicket.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeTicket.setForeground(new java.awt.Color(153, 0, 0));
        lb_TypeTicket.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TypeTicket.setText("Tipo de cliente:");
        pn_paymentDetails.add(lb_TypeTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 180, -1));

        lb_TypeTicketData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TypeTicketData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_TypeTicketData.setText("Renta Diaria");
        pn_paymentDetails.add(lb_TypeTicketData, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 150, -1));

        lb_Margin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_Margin.setForeground(new java.awt.Color(153, 0, 0));
        lb_Margin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_Margin.setText("Margen:");
        pn_paymentDetails.add(lb_Margin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 100, -1));

        lb_MarginData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_MarginData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_MarginData.setText("5 Minutos");
        pn_paymentDetails.add(lb_MarginData, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 130, -1));

        lb_TotalTimeRounded.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTimeRounded.setForeground(new java.awt.Color(153, 0, 0));
        lb_TotalTimeRounded.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_TotalTimeRounded.setText("Tiempo a cobrar:");
        pn_paymentDetails.add(lb_TotalTimeRounded, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 200, -1));

        lb_TotalTimeRoundedData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_TotalTimeRoundedData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_TotalTimeRoundedData.setText("5.0 H");
        pn_paymentDetails.add(lb_TotalTimeRoundedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 60, -1));

        jPanel1.setBackground(new java.awt.Color(38, 50, 56));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("$5000000");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 230, 100));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total a pagar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 340, 100));

        btn_showDetails2.setBackground(new java.awt.Color(38, 50, 56));
        btn_showDetails2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information 50px.png"))); // NOI18N
        btn_showDetails2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        btn_showDetails2.setContentAreaFilled(false);
        btn_showDetails2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_showDetails2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        pn_paymentDetails.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 750, 100));

        btn_showDetailsaaa.setBackground(new java.awt.Color(38, 50, 56));
        btn_showDetailsaaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print 50px.png"))); // NOI18N
        btn_showDetailsaaa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(38, 50, 56), 2, true));
        btn_showDetailsaaa.setContentAreaFilled(false);
        btn_showDetailsaaa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_paymentDetails.add(btn_showDetailsaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, -1, -1));

        pn_paymentInput.add(pn_paymentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 930, 380));

        pn_payment.add(pn_paymentInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 970, 580));

        pn_system.add(pn_payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 740));

        getContentPane().add(pn_system, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1130, 740));

        pn_bottom.setBackground(new java.awt.Color(38, 67, 72));
        pn_bottom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_name.setBackground(new java.awt.Color(244, 243, 239));
        lb_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_name.setForeground(new java.awt.Color(224, 224, 224));
        lb_name.setText("Parqueo Chalit LyF S.A.");
        lb_name.setToolTipText("");
        pn_bottom.add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 27));

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
        pn_bottom.add(sp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(995, 5, -1, 20));

        lb_fecha.setBackground(new java.awt.Color(244, 243, 239));
        lb_fecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_fecha.setForeground(new java.awt.Color(224, 224, 224));
        lb_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_fecha.setText("01/01/2000");
        lb_fecha.setToolTipText("");
        lb_fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pn_bottom.add(lb_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 0, 100, 27));

        getContentPane().add(pn_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 740, 1130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_1MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 50, 56));  // ON
        item_2.setBackground(new Color(38, 67, 72));  // OFF
        item_3.setBackground(new Color(38, 67, 72));  // OFF
        item_9.setBackground(new Color(102, 0, 0));   // OFF
    }//GEN-LAST:event_item_1MouseEntered

    private void item_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_1MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        switch (item) {
            case "item_1":
                item_1.setBackground(new Color(38, 50, 56));  // ON
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_2":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 50, 56));  // ON
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_3":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 50, 56));  // ON
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            default:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
        }
    }//GEN-LAST:event_item_1MouseExited

    private void item_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_1MousePressed
        item = "item_1";

        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 50, 56));  // ON
        item_2.setBackground(new Color(38, 67, 72));  // OFF
        item_3.setBackground(new Color(38, 67, 72));  // OFF
        item_9.setBackground(new Color(102, 0, 0));   // OFF

        /* ----------------------- DASHBOARD WIDGETS ------------------------ */
        lb_WidgetUsersTotal.setText(String.valueOf(mt.FN_CountUsers()));
        lb_WidgetPartnersTotal.setText(String.valueOf(mt.FN_CountPartners()));
        lb_WidgetBlockedTotal.setText(String.valueOf(mt.FN_CountBlackList()));
        lb_WidgetVehiclesTotal.setText(String.valueOf(mt.FN_CountVehicles()));

        /* --------------------- PANELS CONFIGURATION ----------------------- */
        pn_dashboard.setVisible(true);
        pn_system.setVisible(false);
    }//GEN-LAST:event_item_1MousePressed
    
    private void item_9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_9MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 67, 72));  // OFF
        item_2.setBackground(new Color(38, 67, 72));  // OFF
        item_3.setBackground(new Color(38, 67, 72));  // OFF
        item_9.setBackground(new Color(80, 0, 0));    // ON                
    }//GEN-LAST:event_item_9MouseEntered

    private void item_9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_9MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        switch (item) {
            case "item_1":
                item_1.setBackground(new Color(38, 50, 56));  // ON
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_2":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 50, 56));  // ON
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_3":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 50, 56));  // ON
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            default:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
        }
    }//GEN-LAST:event_item_9MouseExited

    private void item_9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_9MousePressed
        /* ------------------------------ EXIT ------------------------------ */
        dispose();
        new frmLogin().setVisible(true);
    }//GEN-LAST:event_item_9MousePressed

    private void btn_entranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entranceActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(true);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);
    }//GEN-LAST:event_btn_entranceActionPerformed

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(false);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(true);
        pn_paymentDetails.setVisible(false);
    }//GEN-LAST:event_btn_paymentActionPerformed

    private void lb_showVehiclesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showVehiclesMousePressed
        /* ---------------------- SHOW LIST CONTROL ------------------------- */
        if (mt.ShowListControl == false) {
            new frmShowList().setVisible(true);
            mt.ShowListControl = true;
        }
    }//GEN-LAST:event_lb_showVehiclesMousePressed

    private void btn_truckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_truckActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(false);
        pn_truck.setVisible(true);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idTruck.requestFocus();
    }//GEN-LAST:event_btn_truckActionPerformed

    private void btn_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(false);
        pn_truck.setVisible(false);
        pn_car.setVisible(true);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idCar.requestFocus();
    }//GEN-LAST:event_btn_carActionPerformed

    private void btn_motorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_motorcycleActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(false);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(true);
        pn_payment.setVisible(false);

        /* ---------------------------- OTHERS ------------------------------ */
        tbx_idMotorcycle.requestFocus();
    }//GEN-LAST:event_btn_motorcycleActionPerformed

    private void btn_returnTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnTypeActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(true);
        pn_type.setVisible(false);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);
    }//GEN-LAST:event_btn_returnTypeActionPerformed

    private void btn_returnTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnTruckActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(true);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);
    }//GEN-LAST:event_btn_returnTruckActionPerformed

    private void btn_clockTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clockTruckActionPerformed
        plate = tbx_idTruck.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "CLIENTE CASUAL", "CAMIÓN", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idTruck.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idTruck.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idTruck.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_btn_clockTruckActionPerformed

    private void btn_returnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnCarActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(true);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);
    }//GEN-LAST:event_btn_returnCarActionPerformed

    private void btn_calendarCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarCarActionPerformed
        plate = tbx_idCar.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "RENTA DIARIA", "AUTOMÓVIL", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idCar.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idCar.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idCar.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_btn_calendarCarActionPerformed

    private void btn_clockCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clockCarActionPerformed
        plate = tbx_idCar.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "CLIENTE CASUAL", "AUTOMÓVIL", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idCar.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idCar.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idCar.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_btn_clockCarActionPerformed

    private void btn_returnMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnMotorcycleActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(false);
        pn_type.setVisible(true);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);
    }//GEN-LAST:event_btn_returnMotorcycleActionPerformed

    private void btn_calendarMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarMotorcycleActionPerformed
        plate = tbx_idMotorcycle.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "RENTA DIARIA", "MOTOCICLETA", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idMotorcycle.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idMotorcycle.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idMotorcycle.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_btn_calendarMotorcycleActionPerformed

    private void btn_clockMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clockMotorcycleActionPerformed
        plate = tbx_idMotorcycle.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "CLIENTE CASUAL", "MOTOCICLETA", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idMotorcycle.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idMotorcycle.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idMotorcycle.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_btn_clockMotorcycleActionPerformed

    private void lb_showVehiclesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showVehiclesMouseEntered
        pn_btnShowVehicles.setBackground(new Color(69, 90, 100));  // ON
    }//GEN-LAST:event_lb_showVehiclesMouseEntered

    private void lb_showVehiclesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_showVehiclesMouseExited
        pn_btnShowVehicles.setBackground(new Color(38, 50, 56));   // OFF
    }//GEN-LAST:event_lb_showVehiclesMouseExited

    private void btn_calendarTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calendarTruckActionPerformed
        plate = tbx_idTruck.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "RENTA DIARIA", "CAMIÓN", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idTruck.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idTruck.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idTruck.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_btn_calendarTruckActionPerformed

    private void tbx_idTruckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_idTruckActionPerformed
        plate = tbx_idTruck.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "CLIENTE CASUAL", "CAMIÓN", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idTruck.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idTruck.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idTruck.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_tbx_idTruckActionPerformed

    private void tbx_idCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_idCarActionPerformed
        plate = tbx_idCar.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "CLIENTE CASUAL", "AUTOMÓVIL", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idCar.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idCar.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idCar.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_tbx_idCarActionPerformed

    private void tbx_idMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_idMotorcycleActionPerformed
        plate = tbx_idMotorcycle.getText();

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.SP_NewVehicle(plate, "CLIENTE CASUAL", "MOTOCICLETA", username)) {
                case "EXIST":
                    mt.Warning("La placa " + plate + " se encuentra actualmente en el sistema. \nNo pueden existir 2 o más vehículos con la misma placa.");
                    tbx_idMotorcycle.setText(null);
                    break;
                case "LOCKED":
                    mt.Locked("La placa " + plate + " tiene prohibido el ingreso al \nestacionamiento.");
                    tbx_idMotorcycle.setText(null);
                    break;
                default:
                    lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
                    lb_cars.setText(String.valueOf(mt.FN_CountCars()));
                    lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

                    pn_main.setVisible(true);
                    pn_type.setVisible(false);
                    pn_truck.setVisible(false);
                    pn_car.setVisible(false);
                    pn_motorcycle.setVisible(false);
                    pn_payment.setVisible(false);
                    tbx_idMotorcycle.setText(null);
                    break;
            }
        }
    }//GEN-LAST:event_tbx_idMotorcycleActionPerformed

    private void tbx_idTruckKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_idTruckKeyTyped
        /* ---------------------- CONVERT TO UPPERCASE ---------------------- */
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_tbx_idTruckKeyTyped

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

    private void btn_returnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnPaymentActionPerformed
        /* ---------------------- PANELS CONFIGURATION ---------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(true);
        pn_type.setVisible(false);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);
    }//GEN-LAST:event_btn_returnPaymentActionPerformed

    private void btn_showDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showDetailsActionPerformed
        plate = tbx_idVehicle.getText();
        ArrayList<String> data = new ArrayList<>(4);

        if (plate.isEmpty()) {
            mt.Warning("No ha colocado ningúna placa. \nPor favor digite la placa del vehículo e inténtelo nuevamente.");
        } else {
            switch (mt.FN_VehicleExist(plate)) {
                case 0:
                    mt.Warning("La placa " + plate + " no se encuentra actualmente en el sistema. \nPor favor verifique la placa del vehículo e inténtelo nuevamente..");
                    break;
                case 1:
                    data = mt.SP_GetDetails(plate);
                    lb_EntryDateData.setText(data.get(2));
                    lb_EntryTimeData.setText(new DateTime().ConvertTo12h(data.get(3)));
                    lb_DepartureDateData.setText(new DateTime().GetFullDate());
                    lb_DepartureTimeData.setText(new DateTime().Get12hFullTime());
                    lb_PlateData.setText(plate);
                    lb_TypeVehicleData.setText(mt.Capitalize(data.get(0)));
                    lb_TypeTicketData.setText(mt.Capitalize(data.get(1)));
                    lb_MarginData.setText("null");
                    break;
            }
        }

        pn_paymentDetails.setVisible(true);
    }//GEN-LAST:event_btn_showDetailsActionPerformed

    private void item_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_3MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 67, 72));  // OFF
        item_2.setBackground(new Color(38, 67, 72));  // OFF
        item_3.setBackground(new Color(38, 50, 56));  // ON
        item_9.setBackground(new Color(102, 0, 0));   // OFF
    }//GEN-LAST:event_item_3MouseEntered

    private void item_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_3MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        switch (item) {
            case "item_1":
                item_1.setBackground(new Color(38, 50, 56));  // ON
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_2":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 50, 56));  // ON
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_3":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 50, 56));  // ON
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            default:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
        }
    }//GEN-LAST:event_item_3MouseExited

    private void item_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_3MousePressed
        item = "item_3";

        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 67, 72));  // OFF
        item_2.setBackground(new Color(38, 67, 72));  // OFF
        item_3.setBackground(new Color(38, 50, 56));  // ON
        item_9.setBackground(new Color(102, 0, 0));   // OFF

        /* --------------------- PANELS CONFIGURATION ----------------------- */
    }//GEN-LAST:event_item_3MousePressed

    private void item_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_2MouseEntered
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 67, 72));  // OFF
        item_2.setBackground(new Color(38, 50, 56));  // ON
        item_3.setBackground(new Color(38, 67, 72));  // OFF
        item_9.setBackground(new Color(102, 0, 0));   // OFF
    }//GEN-LAST:event_item_2MouseEntered

    private void item_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_2MouseExited
        /* ----------------------- MENU CONFIGURATION ----------------------- */
        switch (item) {
            case "item_1":
                item_1.setBackground(new Color(38, 50, 56));  // ON
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_2":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 50, 56));  // ON
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            case "item_3":
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 50, 56));  // ON
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
            default:
                item_1.setBackground(new Color(38, 67, 72));  // OFF
                item_2.setBackground(new Color(38, 67, 72));  // OFF
                item_3.setBackground(new Color(38, 67, 72));  // OFF
                item_9.setBackground(new Color(102, 0, 0));   // OFF
                break;
        }
    }//GEN-LAST:event_item_2MouseExited

    private void item_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_2MousePressed
        item = "item_2";

        /* ----------------------- MENU CONFIGURATION ----------------------- */
        item_1.setBackground(new Color(38, 67, 72));  // OFF
        item_2.setBackground(new Color(38, 50, 56));  // ON
        item_3.setBackground(new Color(38, 67, 72));  // OFF
        item_9.setBackground(new Color(102, 0, 0));   // OFF

        /* ------------------------ VEHICLE COUNTER ------------------------- */
        lb_trucks.setText(String.valueOf(mt.FN_CountTrucks()));
        lb_cars.setText(String.valueOf(mt.FN_CountCars()));
        lb_motorcycles.setText(String.valueOf(mt.FN_CountMotorcycles()));

        /* --------------------- PANELS CONFIGURATION ----------------------- */
        pn_dashboard.setVisible(false);
        pn_system.setVisible(true);

        /* ------------------ SYSTEM PANEL CONFIGURATION -------------------- */
        pn_main.setVisible(true);
        pn_type.setVisible(false);
        pn_truck.setVisible(false);
        pn_car.setVisible(false);
        pn_motorcycle.setVisible(false);
        pn_payment.setVisible(false);
    }//GEN-LAST:event_item_2MousePressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
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
    private javax.swing.JButton btn_returnPayment;
    private javax.swing.JButton btn_returnTruck;
    private javax.swing.JButton btn_returnType;
    private javax.swing.JButton btn_showDetails;
    private javax.swing.JButton btn_showDetails2;
    private javax.swing.JButton btn_showDetailsaaa;
    private javax.swing.JButton btn_truck;
    private javax.swing.JPanel item_1;
    private javax.swing.JPanel item_2;
    private javax.swing.JPanel item_3;
    private javax.swing.JPanel item_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JLabel lb_WidgetBlockedFooterIcon;
    private javax.swing.JLabel lb_WidgetBlockedFooterTitle;
    private javax.swing.JLabel lb_WidgetBlockedIcon;
    private javax.swing.JLabel lb_WidgetBlockedTitle;
    private javax.swing.JLabel lb_WidgetBlockedTotal;
    private javax.swing.JLabel lb_WidgetPartnersFooterIcon;
    private javax.swing.JLabel lb_WidgetPartnersFooterTitle;
    private javax.swing.JLabel lb_WidgetPartnersIcon;
    private javax.swing.JLabel lb_WidgetPartnersTitle;
    private javax.swing.JLabel lb_WidgetPartnersTotal;
    private javax.swing.JLabel lb_WidgetUsersFooterIcon;
    private javax.swing.JLabel lb_WidgetUsersFooterTitle;
    private javax.swing.JLabel lb_WidgetUsersIcon;
    private javax.swing.JLabel lb_WidgetUsersTitle;
    private javax.swing.JLabel lb_WidgetUsersTotal;
    private javax.swing.JLabel lb_WidgetVehiclesFooterIcon;
    private javax.swing.JLabel lb_WidgetVehiclesFooterTitle;
    private javax.swing.JLabel lb_WidgetVehiclesIcon;
    private javax.swing.JLabel lb_WidgetVehiclesTitle;
    private javax.swing.JLabel lb_WidgetVehiclesTotal;
    private javax.swing.JLabel lb_carIcon;
    private javax.swing.JLabel lb_cars;
    private javax.swing.JLabel lb_fecha;
    private javax.swing.JLabel lb_hour;
    private javax.swing.JLabel lb_iconCar;
    private javax.swing.JLabel lb_iconMotorcycle;
    private javax.swing.JLabel lb_iconTruck;
    private javax.swing.JLabel lb_imgTop;
    private javax.swing.JLabel lb_item1;
    private javax.swing.JLabel lb_item2;
    private javax.swing.JLabel lb_item3;
    private javax.swing.JLabel lb_item9;
    private javax.swing.JLabel lb_logoItem1;
    private javax.swing.JLabel lb_logoItem2;
    private javax.swing.JLabel lb_logoItem3;
    private javax.swing.JLabel lb_logoItem9;
    private javax.swing.JLabel lb_motorcycleIcon;
    private javax.swing.JLabel lb_motorcycles;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_paymentInputTitle;
    private javax.swing.JLabel lb_plate;
    private javax.swing.JLabel lb_showVehicles;
    private javax.swing.JLabel lb_textCar;
    private javax.swing.JLabel lb_textMotorcycle;
    private javax.swing.JLabel lb_textTruck;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_titleCar;
    private javax.swing.JLabel lb_titleMotorcycle;
    private javax.swing.JLabel lb_titleTruck;
    private javax.swing.JLabel lb_truckIcon;
    private javax.swing.JLabel lb_trucks;
    private javax.swing.JPanel pn_WidgetBlocked;
    private javax.swing.JPanel pn_WidgetPartners;
    private javax.swing.JPanel pn_WidgetUsers;
    private javax.swing.JPanel pn_WidgetVehicles;
    private javax.swing.JPanel pn_bottom;
    private javax.swing.JPanel pn_btnShowVehicles;
    private javax.swing.JPanel pn_calculator;
    private javax.swing.JPanel pn_car;
    private javax.swing.JPanel pn_dashboard;
    private javax.swing.JPanel pn_inputCar;
    private javax.swing.JPanel pn_inputMotorcycle;
    private javax.swing.JPanel pn_inputTruck;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_motorcycle;
    private javax.swing.JPanel pn_payment;
    private javax.swing.JPanel pn_paymentDetails;
    private javax.swing.JPanel pn_paymentInput;
    private javax.swing.JPanel pn_stats;
    private javax.swing.JPanel pn_system;
    private javax.swing.JPanel pn_truck;
    private javax.swing.JPanel pn_type;
    private javax.swing.JSeparator sp_WidgetBlocked;
    private javax.swing.JSeparator sp_WidgetPartners;
    private javax.swing.JSeparator sp_WidgetUsers;
    private javax.swing.JSeparator sp_WidgetVehicles;
    private javax.swing.JSeparator sp_date;
    private javax.swing.JSeparator sp_idVehicle;
    private javax.swing.JSeparator sp_inputCar;
    private javax.swing.JSeparator sp_inputMotorcycle;
    private javax.swing.JSeparator sp_inputTitleCar;
    private javax.swing.JSeparator sp_inputTitleMotorcycle;
    private javax.swing.JSeparator sp_inputTitleTruck;
    private javax.swing.JSeparator sp_inputTruck;
    private javax.swing.JSeparator sp_menu;
    private javax.swing.JSeparator sp_paymentInput;
    private javax.swing.JTextField tbx_idCar;
    private javax.swing.JTextField tbx_idMotorcycle;
    private javax.swing.JTextField tbx_idTruck;
    private javax.swing.JTextField tbx_idVehicle;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == th) {
            lb_hour.setText(new DateTime().Get12hFullTime());
            lb_fecha.setText(new DateTime().GetFullDate());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
