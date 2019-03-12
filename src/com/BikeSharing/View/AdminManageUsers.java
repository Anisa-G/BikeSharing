
package com.BikeSharing.View;

import com.BikeSharing.Model.Admin;
import com.BikeSharing.Model.Bicycle;
import com.BikeSharing.Model.User;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anisa Gurabardhi
 */
public class AdminManageUsers extends javax.swing.JFrame {

   
    private final Admin admin = new Admin();
    private final User user = new User();
    //UserMainView mainf = new UserMainView();
    Bicycle bicycle = new Bicycle();
    

    public AdminManageUsers() {
        initComponents();
        setResizable(false);
        admin.fillUserTable(table, "");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        showUser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        IdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        IdNumberField = new javax.swing.JTextField();
        RemoveButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/if_icon-ios7-arrow-right_211607.png"))); // NOI18N
        jButton1.setText("Go to Manage Bicycle Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 200, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/users.gif"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 180));

        showUser.setFont(new java.awt.Font("DIN", 0, 18)); // NOI18N
        showUser.setText("Admin");
        jPanel1.add(showUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 170, 30));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("DIN", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Last Name", "Email", "Username", "Password", "ID number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 550, 310));

        jLabel11.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel11.setText("Enter value to search:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 40));

        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel3.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 400, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 600, 420));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel8.setText("ID:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        IdField.setEditable(false);
        IdField.setText(" ");
        IdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdFieldActionPerformed(evt);
            }
        });
        jPanel4.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 230, -1));

        jLabel2.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel2.setText("Name:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 230, -1));

        jLabel3.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel3.setText("Last Name:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 20));

        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });
        jPanel4.add(LastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, -1));

        jLabel4.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel4.setText("Email:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 20));
        jPanel4.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 230, -1));

        jLabel5.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel5.setText("Username:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));
        jPanel4.add(UsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 230, -1));

        jLabel6.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel6.setText("Password:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));
        jPanel4.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 230, -1));

        jLabel7.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel7.setText("ID number:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 20));

        IdNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdNumberFieldActionPerformed(evt);
            }
        });
        jPanel4.add(IdNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 230, -1));

        RemoveButton.setFont(new java.awt.Font("DIN", 0, 12)); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 80, -1));

        UpdateButton.setFont(new java.awt.Font("DIN", 0, 12)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel4.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        AddButton.setFont(new java.awt.Font("DIN", 0, 12)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel4.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 59, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/if_refresh_59198.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 30, 20));

        jLabel1.setFont(new java.awt.Font("DIN", 0, 18)); // NOI18N
        jLabel1.setText("Manage users");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 380, 470));

        jLabel9.setFont(new java.awt.Font("DIN", 0, 18)); // NOI18N
        jLabel9.setText("Welcome to your account: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        int dialogButton = 0;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this user?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            if (IdField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No user selected!");
            } else {
                int id = Integer.valueOf(IdField.getText());
                admin.deleteAUser(id, null, null, null, null, null, null);
                table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Surname", "Email", "Username", "Password"}));
                admin.fillUserTable(table, "");
            }
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        String name = NameField.getText();
        String last_name = LastNameField.getText();
        String email = EmailField.getText();
        String username = UsernameField.getText();
        String password = String.valueOf(PasswordField.getText());
        String id_card_number = IdNumberField.getText();
        Integer id = Integer.parseInt(IdField.getText());
            admin.updateUser(id, name, last_name, email, username, password, id_card_number);
          table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Surname", "Email", "Username", "Password"}));
           admin.fillUserTable(table, "");
           new AdminManageUsers().setVisible(true);
           this.dispose();


    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        String name = NameField.getText();
        String lastname = LastNameField.getText();
        String email = EmailField.getText();
        String username = UsernameField.getText();
        String password = String.valueOf(PasswordField.getPassword());
        String id_card_number = IdNumberField.getText();

        if (user.checkUsername(UsernameField.getText()) == true) {

            JOptionPane.showMessageDialog(null, "Username Already exists. Try another one");
            UsernameField.setText("");

        } else {
            user.addUser(null, name, lastname, email, username, password, id_card_number);
            NameField.setText("");
            LastNameField.setText("");
            EmailField.setText("");
            UsernameField.setText("");
            PasswordField.setText("");
            IdNumberField.setText("");
            table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Lastname", "Email", "Username", "Password", "ID number"}));
            admin.fillUserTable(table, "");

        }


    }//GEN-LAST:event_AddButtonActionPerformed

    private void IdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdFieldActionPerformed
        
    }//GEN-LAST:event_IdFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
         AdminManageBicycles bicycles = new AdminManageBicycles();
        bicycles.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IdNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdNumberFieldActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int rowIndex = table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel) table.getModel();

       IdField.setText(model.getValueAt(rowIndex, 0).toString());
       NameField.setText(model.getValueAt(rowIndex, 1).toString());
       LastNameField.setText(model.getValueAt(rowIndex, 2).toString());
       EmailField.setText(model.getValueAt(rowIndex, 3).toString());
       UsernameField.setText(model.getValueAt(rowIndex, 4).toString());
       PasswordField.setText(model.getValueAt(rowIndex, 5).toString());
       IdNumberField.setText(model.getValueAt(rowIndex, 6).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchKeyPressed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
         table.setModel(new DefaultTableModel(null, new Object[]{"ID", "Name", "Lastname", "Email", "Username", "Password", "ID number"}));
            admin.fillUserTable(table, Search.getText());
    }//GEN-LAST:event_SearchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NameField.setText("");
        LastNameField.setText("");
        EmailField.setText("");
        UsernameField.setText("");

        PasswordField.setText("");
        
        IdNumberField.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManageUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField IdField;
    private javax.swing.JTextField IdNumberField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTextField Search;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel showUser;
    public static javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
