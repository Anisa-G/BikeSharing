/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BikeSharing.Model;

import com.BikeSharing.Database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anisa Gurabardhi
 */
public class Bicycle {

    private PreparedStatement pstmt;
    private ResultSet rs;
    private final Database DB = new Database();


   public void fillBicycleTableAtAdmin(JTable table, String valueToSearch) {
        try {
           pstmt = DB.getConnection().prepareStatement("SELECT * FROM bicycle WHERE CONCAT (number_plate, location, available, id_user) LIKE ?");
       pstmt.setString(1, "%" + valueToSearch + "%");
            rs = pstmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
          
               row = new Object[5];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                
                model.addRow(row);
            }

        } catch (SQLException ex) {
            System.out.println("Can not fill the table " + ex);
        }

    }
    
   public void fillBicycleTableAtUser(JTable table, String valueToSearch) {
               try {
           pstmt = DB.getConnection().prepareStatement("SELECT * FROM bicycle WHERE CONCAT (number_plate, location, available) LIKE ?");
       pstmt.setString(1, "%" + valueToSearch + "%");
            rs = pstmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
                row = new Object[3];
                row[0] = rs.getString(2);
                row[1] = rs.getString(3);
                row[2] = rs.getString(4);
                
           

                model.addRow(row);
            }

        } catch (SQLException ex) {
            System.out.println("Can not fill the table " + ex);
        }

    }
        
   
   
   
    public void updateBicycleStatus(String number_plate, String user) {
        try {

            pstmt = DB.getConnection().prepareStatement("UPDATE bicycle SET available='No',id_user=? WHERE number_plate=?");
            pstmt.setString(1, user);

            pstmt.setString(2, number_plate);
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Bike successfully rent");
            }
        } catch (SQLException ex) {
            System.out.println("Could not update bicycle " + ex);
        }

    }
    
     public void addBicycle(Integer id, String numberPlate, String location, String available, String id_user) {

        try {
            pstmt = DB.getConnection().prepareStatement("INSERT INTO bicycle(number_plate, location, available,id_user) VALUES (?,?,?,?)");
            
            pstmt.setString(1, numberPlate);
            pstmt.setString(2, location);
            pstmt.setString(3, available);
            pstmt.setString(4, id_user);
       
        
            if (pstmt.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "Bicycle added successfully!");

            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }

    }

      public void deleteABicycle(Integer id, String numberPlate, String location, String available, String user_id) {

        try {
            pstmt = DB.getConnection().prepareStatement("DELETE FROM bicycle WHERE id=?");

            pstmt.setInt(1, id);

            if (pstmt.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "Bicycle deleted!");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }
      
      
      
      
}
