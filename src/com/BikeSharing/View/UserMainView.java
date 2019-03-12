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
public class UserMainView extends javax.swing.JFrame {

   // private final User user = new User();
  //  private final Admin admin = new Admin();
    private final Bicycle bicycle = new Bicycle();
   
    public UserMainView() {
        initComponents();
         setResizable(false);
      hours.setSelectedItem("Hours");
        bicycle.fillBicycleTableAtUser(table, "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        showUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NumberField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        locationField = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        AvailableField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hours = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        RentButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        SignOutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        FileMenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        DeleteMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setPreferredSize(new java.awt.Dimension(1100, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/BikeSharing/Images/deliveroo_dribbble_bike_city_icon_800x600.gif"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 720, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DIN", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Welcome to your account: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, 20));

        showUser.setFont(new java.awt.Font("DIN", 0, 18)); // NOI18N
        showUser.setForeground(new java.awt.Color(0, 0, 153));
        showUser.setText("username");
        jPanel2.add(showUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel2.setText("Number plate:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 20));

        NumberField.setEditable(false);
        NumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 270, -1));

        jLabel3.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel3.setText("Location:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        locationField.setEditable(false);
        locationField.setColumns(20);
        locationField.setRows(5);
        jScrollPane2.setViewportView(locationField);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 270, 110));

        jLabel11.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel11.setText("Available:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        AvailableField.setEditable(false);
        jPanel2.add(AvailableField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 270, -1));

        jLabel5.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel5.setText("Rent it for:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        hours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        hours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursActionPerformed(evt);
            }
        });
        jPanel2.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 90, -1));

        jLabel6.setFont(new java.awt.Font("DIN", 0, 12)); // NOI18N
        jLabel6.setText("hours");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, 40));

        jLabel10.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel10.setText("The price you have to pay is:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, 40));

        Price.setBackground(new java.awt.Color(204, 204, 204));
        Price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 40, 20));

        RentButton.setText("Rent");
        RentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 70, -1));

        jLabel9.setFont(new java.awt.Font("DIN", 0, 14)); // NOI18N
        jLabel9.setText("Enter value to search:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 240, -1));

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
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 240, 20));

        table.setFont(new java.awt.Font("DIN", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number Plate", "Location", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 410, 110));

        SignOutButton.setText("Sign Out");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SignOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, -1));

        jLabel4.setFont(new java.awt.Font("DIN", 0, 12)); // NOI18N
        jLabel4.setText("ALL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 750, 590));

        FileMenu.setText("File");

        DeleteMenu.setText("Delete account");
        DeleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMenuActionPerformed(evt);
            }
        });
        FileMenu.add(DeleteMenu);

        FileMenuBar.add(FileMenu);

        setJMenuBar(FileMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        MainView sign_out = new MainView();
        sign_out.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignOutButtonActionPerformed

    private void RentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentButtonActionPerformed
        if (!NumberField.getText().isEmpty()) {
            if ("Yes".equals(AvailableField.getText())) {
                bicycle.updateBicycleStatus(NumberField.getText(), showUser.getText());
                table.setModel(new DefaultTableModel(null, new Object[]{"Number Plate", "Location", "Available"}));
                bicycle.fillBicycleTableAtUser(table, "");
            } else {
                JOptionPane.showMessageDialog(null, "This bike is not available. Select another one");
            }

        } else {
            JOptionPane.showMessageDialog(null, "You need to select a bicycle first!");
        }

    }//GEN-LAST:event_RentButtonActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

    }//GEN-LAST:event_SearchActionPerformed

    private void SearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyPressed

    }//GEN-LAST:event_SearchKeyPressed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        table.setModel(new DefaultTableModel(null, new Object[]{"Number Plate", "Location", "Available"}));
        bicycle.fillBicycleTableAtUser(table, Search.getText());
    }//GEN-LAST:event_SearchKeyReleased

    private void NumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberFieldActionPerformed

    private void hoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursActionPerformed
        int i = Integer.parseInt((String) hours.getSelectedItem()) * 50;

        Price.setText("" + i);


    }//GEN-LAST:event_hoursActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int rowIndex = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        NumberField.setText(model.getValueAt(rowIndex, 0).toString());
        locationField.setText(model.getValueAt(rowIndex, 1).toString());
        AvailableField.setText(model.getValueAt(rowIndex, 2).toString());


    }//GEN-LAST:event_tableMouseClicked

    private void DeleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMenuActionPerformed


        
    }//GEN-LAST:event_DeleteMenuActionPerformed

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
            java.util.logging.Logger.getLogger(UserMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            // java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.LeShowUsernamevel.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserMainView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AvailableField;
    private javax.swing.JMenuItem DeleteMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuBar FileMenuBar;
    private javax.swing.JTextField NumberField;
    private javax.swing.JLabel Price;
    private javax.swing.JButton RentButton;
    private javax.swing.JTextField Search;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JComboBox<String> hours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea locationField;
    public javax.swing.JLabel showUser;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
