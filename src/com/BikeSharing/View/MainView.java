package com.BikeSharing.View;

import com.BikeSharing.Controller.UserSignInController;
import com.BikeSharing.Model.User;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

/**
 *
 * @author Anisa Gurabardhi
 */
public class MainView extends javax.swing.JFrame {

    private final UserSignInController signInC = new UserSignInController();
    //private final SignIn_Up_Validation validation = new SignIn_Up_ValidationImpl();
    private final UserMainView main = new UserMainView();
    private final SignUpView signUp = new SignUpView();
    private final AdminManageUsers adminView = new AdminManageUsers();
    private final User verify = new User();

    /**
     * Creates new form LoginView
     */
    public MainView() {
        initComponents();

        setResizable(false);

        // Panel.setBackground(new Color(100, 200, 200, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        SignInButton = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        ShowPassword = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1100, 650));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(68, 147, 154));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(68, 147, 154));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 180, 10));

        SignInButton.setBackground(new java.awt.Color(255, 255, 255));
        SignInButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/if_ok-sign_173063 (1).png"))); // NOI18N
        SignInButton.setText("Sign In      ");
        SignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInButtonActionPerformed(evt);
            }
        });
        SignInButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SignInButtonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SignInButtonKeyTyped(evt);
            }
        });
        Panel.add(SignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 130, 30));

        SignUpButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/if_plus-sign_173078 (1).png"))); // NOI18N
        SignUpButton.setText("Get Started");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });
        Panel.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 130, 30));

        usernameField.setBackground(new java.awt.Color(68, 147, 154));
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setText("Enter username here");
        usernameField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFieldFocusLost(evt);
            }
        });
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameFieldMouseExited(evt);
            }
        });
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        usernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameFieldKeyReleased(evt);
            }
        });
        Panel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 200, 20));

        passwordField.setBackground(new java.awt.Color(68, 147, 154));
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        Panel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 200, 20));

        ShowPassword.setBackground(new java.awt.Color(68, 147, 154));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        Panel.add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/if_lock_285646.png"))); // NOI18N
        Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 41, 41));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/if_user-group_285648.png"))); // NOI18N
        Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 37, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Join our community now for free and help our city breath easier ");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Or sign in to your exisiting account and enjoy a ride");
        Panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/if_sign-error_299045.png"))); // NOI18N
        ExitButton.setText("Exit         ");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        Panel.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 120, 30));
        Panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 180, 10));

        jPanel1.add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -10, 490, 560));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pedal for progress");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/cyclist-dribbble.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 110, 690, 480));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Life is easier with EcoVolis!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInButtonActionPerformed
        String user = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (verify.verifyUser(user, password)) {

            if ("admin".equals(user) && "admin123".equals(password)) {

                adminView.setVisible(true);

                this.dispose();
                adminView.showUser.setText("Admin");
            } else {

                main.setVisible(true);
                this.dispose();

                main.showUser.setText(user);
            }
        } else {
            JOptionPane.showMessageDialog(null, "This user doesn't exist in the database");
        }

    }//GEN-LAST:event_SignInButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        int exit = JOptionPane.showConfirmDialog(this, "Do you want to exit?");
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        signUp.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void SignInButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignInButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInButtonKeyPressed

    private void SignInButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SignInButtonKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_SignInButtonKeyTyped

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String user = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            signInC.setUsername(user);
            signInC.setPassword(password);

            if (verify.verifyUser(user, password)) {

                if ("admin".equals(user) && "admin123".equals(password)) {
                    adminView.setVisible(true);

                    this.dispose();
                    adminView.showUser.setText("Admin");
                } else {

                    main.setVisible(true);
                    this.dispose();

                    main.showUser.setText(user);
                }
            } else {
                JOptionPane.showMessageDialog(null, "This user doesn't exist in the database");
            }
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if (ShowPassword.isSelected()) {
            passwordField.setEchoChar((char) 0);

        } else {
            passwordField.setEchoChar('*');
        }


    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void usernameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusLost

    }//GEN-LAST:event_usernameFieldFocusLost

    private void usernameFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseExited

    }//GEN-LAST:event_usernameFieldMouseExited

    private void usernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyPressed
        if (usernameField.getForeground() != Color.BLACK) {
            if (usernameField.getText().equals("Enter username here")) {
                usernameField.setText("");
            }

        }
        usernameField.setForeground(Color.BLACK);
    }//GEN-LAST:event_usernameFieldKeyPressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        usernameField.setCaretPosition(0);


    }//GEN-LAST:event_formWindowGainedFocus

    private void usernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFieldKeyReleased
        if (usernameField.getText().isEmpty() == true) {
            usernameField.setText("Enter username here");
            usernameField.setCaretPosition(0);
            usernameField.setForeground(new java.awt.Color(204, 204, 204));

        }


    }//GEN-LAST:event_usernameFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JButton SignInButton;
    public javax.swing.JButton SignUpButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
