package project;

import java.awt.Color;
import methods.cls_methods;
import Atxy2k.CustomTextField.RestrictedTextField;

/**
 * @author Kevin Oleaga Garcia
 * @email oleaga@outlook.com
 * @version 1.0
 */
public class frmLogin extends javax.swing.JFrame {

    String user = null, pass = null;
    cls_methods mt = new cls_methods();

    public frmLogin() {
        initComponents();
        mt.Connect();
        setLocationRelativeTo(null);
        pn_password.setVisible(false);
        new RestrictedTextField(tbx_user).setLimit(20);
        new RestrictedTextField(tbx_password).setLimit(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_close = new javax.swing.JButton();
        lb_top = new javax.swing.JLabel();
        pn_user = new javax.swing.JPanel();
        lb_user = new javax.swing.JLabel();
        lb_imgUser = new javax.swing.JLabel();
        tbx_user = new javax.swing.JTextField();
        sp_user = new javax.swing.JSeparator();
        pn_btnNext = new javax.swing.JPanel();
        lb_next = new javax.swing.JLabel();
        pn_password = new javax.swing.JPanel();
        lb_password = new javax.swing.JLabel();
        lb_imgPassword = new javax.swing.JLabel();
        tbx_password = new javax.swing.JPasswordField();
        sp_password = new javax.swing.JSeparator();
        pn_btnLogin = new javax.swing.JPanel();
        lb_login = new javax.swing.JLabel();
        pn_btnReturn = new javax.swing.JPanel();
        lb_return = new javax.swing.JLabel();
        pn_bottom = new javax.swing.JPanel();
        lb_projectName = new javax.swing.JLabel();
        lb_version = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmLogin"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CloseWhite 25px.png"))); // NOI18N
        btn_close.setToolTipText("Salir del sistema.");
        btn_close.setBorder(null);
        btn_close.setBorderPainted(false);
        btn_close.setContentAreaFilled(false);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setFocusPainted(false);
        btn_close.setFocusable(false);
        btn_close.setRequestFocusEnabled(false);
        btn_close.setRolloverEnabled(false);
        btn_close.setVerifyInputWhenFocusTarget(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 10, -1, -1));

        lb_top.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login 300px.jpg"))); // NOI18N
        getContentPane().add(lb_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 280));

        pn_user.setBackground(new java.awt.Color(38, 67, 72));
        pn_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_user.setForeground(new java.awt.Color(255, 255, 255));
        lb_user.setText("Usuario");
        pn_user.add(lb_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 30));

        lb_imgUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_imgUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User 25px.png"))); // NOI18N
        pn_user.add(lb_imgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 55, 25, 25));

        tbx_user.setBackground(new java.awt.Color(38, 67, 72));
        tbx_user.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbx_user.setForeground(new java.awt.Color(255, 255, 255));
        tbx_user.setToolTipText("Ingrese su usuario.");
        tbx_user.setBorder(null);
        tbx_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_userActionPerformed(evt);
            }
        });
        tbx_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_userKeyTyped(evt);
            }
        });
        pn_user.add(tbx_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 55, 170, 25));
        pn_user.add(sp_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, 10));

        pn_btnNext.setBackground(new java.awt.Color(38, 50, 56));
        pn_btnNext.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_next.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_next.setForeground(new java.awt.Color(255, 255, 255));
        lb_next.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_next.setText("Siguiente");
        lb_next.setToolTipText("");
        lb_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_nextMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_nextMousePressed(evt);
            }
        });
        pn_btnNext.add(lb_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        pn_user.add(pn_btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, 30));

        getContentPane().add(pn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 230));

        pn_password.setBackground(new java.awt.Color(38, 67, 72));
        pn_password.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Contraseña");
        pn_password.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 30));

        lb_imgPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_imgPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Password 25px.png"))); // NOI18N
        pn_password.add(lb_imgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 55, 25, 25));

        tbx_password.setBackground(new java.awt.Color(38, 67, 72));
        tbx_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbx_password.setForeground(new java.awt.Color(255, 255, 255));
        tbx_password.setToolTipText("Ingrese su contraseña.");
        tbx_password.setBorder(null);
        tbx_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbx_passwordActionPerformed(evt);
            }
        });
        tbx_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbx_passwordKeyTyped(evt);
            }
        });
        pn_password.add(tbx_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 55, 170, 25));
        pn_password.add(sp_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, 10));

        pn_btnLogin.setBackground(new java.awt.Color(38, 50, 56));
        pn_btnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_login.setForeground(new java.awt.Color(255, 255, 255));
        lb_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_login.setText("Iniciar Sesión");
        lb_login.setToolTipText("");
        lb_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_loginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_loginMousePressed(evt);
            }
        });
        pn_btnLogin.add(lb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        pn_password.add(pn_btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, 30));

        pn_btnReturn.setBackground(new java.awt.Color(38, 50, 56));
        pn_btnReturn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_return.setForeground(new java.awt.Color(255, 255, 255));
        lb_return.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_return.setText("Volver");
        lb_return.setToolTipText("");
        lb_return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_returnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_returnMousePressed(evt);
            }
        });
        pn_btnReturn.add(lb_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        pn_password.add(pn_btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 135, 200, 30));

        getContentPane().add(pn_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 230));

        pn_bottom.setBackground(new java.awt.Color(38, 50, 56));
        pn_bottom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_projectName.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lb_projectName.setForeground(new java.awt.Color(255, 255, 255));
        lb_projectName.setText("Parking CR");
        pn_bottom.add(lb_projectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        lb_version.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lb_version.setForeground(new java.awt.Color(255, 255, 255));
        lb_version.setText("v1.0");
        pn_bottom.add(lb_version, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, 20));

        getContentPane().add(pn_bottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 300, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void lb_nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_nextMousePressed
        user = tbx_user.getText();

        if (user.isEmpty()) {
            mt.Warning("No ha digitado ningún usuario. \nPor favor digite un usuario e inténtelo nuevamente.");
        } else {
            switch (mt.FN_Login01(user)) {
                case 1:
                    pn_password.setVisible(true);
                    pn_user.setVisible(false);
                    break;
                case 0:
                    tbx_user.setText(null);
            }
        }
    }//GEN-LAST:event_lb_nextMousePressed

    private void lb_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_loginMousePressed
        pass = tbx_password.getText();

        if (pass.isEmpty()) {
            mt.Warning("No ha digitado ningúna contraseña. \nPor favor digite una contraseña e inténtelo nuevamente.");
        } else {
            switch (mt.FN_Login02(user, pass)) {
                case 1:
                    switch (mt.FN_GetRole(user, pass)) {
                        case 1:
                            new frmAdmin().setVisible(true);
                            mt.username = mt.Encrypt(user);
                            this.dispose();
                            break;
                        case 2:
                            new frmUser().setVisible(true);
                            this.dispose();
                            break;
                    }
                    break;
                case 0:
                    tbx_password.setText(null);
            }
        }
    }//GEN-LAST:event_lb_loginMousePressed

    private void lb_returnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_returnMousePressed
        user = null;
        pass = null;
        tbx_user.setText(null);
        tbx_password.setText(null);
        pn_user.setVisible(true);
        pn_password.setVisible(false);
    }//GEN-LAST:event_lb_returnMousePressed

    private void lb_nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_nextMouseEntered
        pn_btnNext.setBackground(new Color(69, 90, 100));  //ON
    }//GEN-LAST:event_lb_nextMouseEntered

    private void lb_nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_nextMouseExited
        pn_btnNext.setBackground(new Color(38, 50, 56));  //OFF
    }//GEN-LAST:event_lb_nextMouseExited

    private void lb_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_loginMouseEntered
        pn_btnLogin.setBackground(new Color(69, 90, 100));  //ON
    }//GEN-LAST:event_lb_loginMouseEntered

    private void lb_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_loginMouseExited
        pn_btnLogin.setBackground(new Color(38, 50, 56));  //OFF
    }//GEN-LAST:event_lb_loginMouseExited

    private void lb_returnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_returnMouseEntered
        pn_btnReturn.setBackground(new Color(69, 90, 100));  //ON
    }//GEN-LAST:event_lb_returnMouseEntered

    private void lb_returnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_returnMouseExited
        pn_btnReturn.setBackground(new Color(38, 50, 56));  //OFF
    }//GEN-LAST:event_lb_returnMouseExited

    private void tbx_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_userActionPerformed
        user = tbx_user.getText();

        if (user.isEmpty()) {
            mt.Warning("No ha digitado ningún usuario. \nPor favor digite un usuario e inténtelo nuevamente.");
        } else {
            switch (mt.FN_Login01(user)) {
                case 1:
                    pn_password.setVisible(true);
                    pn_user.setVisible(false);
                    break;
                case 0:
                    tbx_user.setText(null);
            }
        }
    }//GEN-LAST:event_tbx_userActionPerformed

    private void tbx_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbx_passwordActionPerformed
        pass = tbx_password.getText();

        if (pass.isEmpty()) {
            mt.Warning("No ha digitado ningúna contraseña. \nPor favor digite una contraseña e inténtelo nuevamente.");
        } else {
            switch (mt.FN_Login02(user, pass)) {
                case 1:
                    switch (mt.FN_GetRole(user, pass)) {
                        case 1:
                            new frmAdmin().setVisible(true);
                            mt.username = mt.Encrypt(user);
                            this.dispose();
                            break;
                        case 2:
                            new frmUser().setVisible(true);
                            this.dispose();
                            break;
                    }
                    break;
                case 0:
                    tbx_password.setText(null);
            }
        }
    }//GEN-LAST:event_tbx_passwordActionPerformed

    private void tbx_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_userKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_tbx_userKeyTyped

    private void tbx_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbx_passwordKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_tbx_passwordKeyTyped

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel lb_imgPassword;
    private javax.swing.JLabel lb_imgUser;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_next;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_projectName;
    private javax.swing.JLabel lb_return;
    private javax.swing.JLabel lb_top;
    private javax.swing.JLabel lb_user;
    private javax.swing.JLabel lb_version;
    private javax.swing.JPanel pn_bottom;
    private javax.swing.JPanel pn_btnLogin;
    private javax.swing.JPanel pn_btnNext;
    private javax.swing.JPanel pn_btnReturn;
    private javax.swing.JPanel pn_password;
    private javax.swing.JPanel pn_user;
    private javax.swing.JSeparator sp_password;
    private javax.swing.JSeparator sp_user;
    private javax.swing.JPasswordField tbx_password;
    private javax.swing.JTextField tbx_user;
    // End of variables declaration//GEN-END:variables
}
