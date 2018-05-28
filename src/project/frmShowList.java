package project;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import methods.cls_methods;

/**
 * @author Kevin Oleaga Garcia
 * @email oleaga@outlook.com
 * @version 1.0
 */
public class frmShowList extends javax.swing.JFrame {

    cls_methods mt = new cls_methods();

    public frmShowList() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        mt.VI_GetVehicles(tbl_vehicles);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_top = new javax.swing.JPanel();
        lb_title = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        pn_content = new javax.swing.JPanel();
        lb_filter = new javax.swing.JLabel();
        cbx_type = new javax.swing.JComboBox<>();
        btn_print = new javax.swing.JButton();
        jsp_vehicles = new javax.swing.JScrollPane();
        tbl_vehicles = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("frmShowList"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_top.setBackground(new java.awt.Color(38, 67, 72));
        pn_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_title.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb_title.setForeground(new java.awt.Color(224, 224, 224));
        lb_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/List 80px.png"))); // NOI18N
        lb_title.setText("Listado de vehiculos");
        pn_top.add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 430, 80));

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CloseWhite 25px.png"))); // NOI18N
        btn_close.setBorder(null);
        btn_close.setBorderPainted(false);
        btn_close.setContentAreaFilled(false);
        btn_close.setDefaultCapable(false);
        btn_close.setFocusPainted(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        pn_top.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 10, 25, 25));

        getContentPane().add(pn_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 120));

        pn_content.setBackground(new java.awt.Color(255, 255, 255));
        pn_content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_filter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_filter.setText("Filtrar:");
        pn_content.add(lb_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        cbx_type.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbx_type.setMaximumRowCount(4);
        cbx_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Camiones", "Automóviles", "Motocicletas" }));
        cbx_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_typeActionPerformed(evt);
            }
        });
        pn_content.add(cbx_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 30));

        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print 30px.png"))); // NOI18N
        btn_print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn_print.setContentAreaFilled(false);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        pn_content.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 30, 30));

        tbl_vehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jsp_vehicles.setViewportView(tbl_vehicles);

        pn_content.add(jsp_vehicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 160));

        getContentPane().add(pn_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 560, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        dispose();
        cls_methods.ShowListControl = false;
    }//GEN-LAST:event_btn_closeActionPerformed

    private void cbx_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_typeActionPerformed
        mt.VI_GetVehiclesByType(tbl_vehicles, cbx_type.getSelectedItem().toString());
    }//GEN-LAST:event_cbx_typeActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        String type = cbx_type.getSelectedItem().toString();

        if (type.equals("Todos")) {
            mt.printShowList();
            frmPrintingTicket fm = new frmPrintingTicket();
            
            fm.setVisible(true);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(frmShowList.class.getName()).log(Level.SEVERE, null, ex);
            }
            fm.dispose();
        

        }else if (type.equals("Camiones")) {
            
        }else if (type.equals("Automóviles")) {
            
        }else if (type.equals("Motocicletas")) {
            
        }
    }//GEN-LAST:event_btn_printActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmShowList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmShowList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox<String> cbx_type;
    private javax.swing.JScrollPane jsp_vehicles;
    private javax.swing.JLabel lb_filter;
    private javax.swing.JLabel lb_title;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_top;
    private javax.swing.JTable tbl_vehicles;
    // End of variables declaration//GEN-END:variables
}
