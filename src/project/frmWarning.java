package project;

import methods.cls_methods;

/**
 * @author Kevin Oleaga Garcia
 * @email oleaga@outlook.com
 * @version 1.0
 */
public class frmWarning extends javax.swing.JFrame {

    public frmWarning(String message) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        tbx_message.setText(message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_content = new javax.swing.JPanel();
        lb_title = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        jsp_message = new javax.swing.JScrollPane();
        tbx_message = new javax.swing.JTextArea();
        pn_logo = new javax.swing.JPanel();
        lb_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmWarning"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));
        pn_content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_title.setFont(new java.awt.Font("Microsoft YaHei", 1, 16)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 205, 19));
        lb_title.setText("OOPS...");
        pn_content.add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close 25px.png"))); // NOI18N
        btn_close.setBorder(null);
        btn_close.setBorderPainted(false);
        btn_close.setContentAreaFilled(false);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setFocusPainted(false);
        btn_close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        pn_content.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 10, 25, 25));

        jsp_message.setBorder(null);

        tbx_message.setEditable(false);
        tbx_message.setColumns(20);
        tbx_message.setFont(new java.awt.Font("Microsoft YaHei", 1, 14)); // NOI18N
        tbx_message.setRows(4);
        jsp_message.setViewportView(tbx_message);

        pn_content.add(jsp_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 440, 80));

        pn_logo.setBackground(new java.awt.Color(255, 205, 19));
        pn_logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Warning 110px.png"))); // NOI18N
        pn_logo.add(lb_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pn_content, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_content, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        dispose();
        cls_methods.msgControl = false;
    }//GEN-LAST:event_btn_closeActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmWarning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmWarning(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JScrollPane jsp_message;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_title;
    private javax.swing.JPanel pn_content;
    private javax.swing.JPanel pn_logo;
    private javax.swing.JTextArea tbx_message;
    // End of variables declaration//GEN-END:variables
}
