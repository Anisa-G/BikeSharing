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
public class Admin {

    private PreparedStatement pstmt;
  
    private ResultSet rs;
    private final Database DB = new Database();



    public void updateUser(Integer id, String name, String last_name, String email, String username, String password, String id_card_number) {

        try {
            pstmt = DB.getConnection().prepareStatement("UPDATE register SET name=?,last_name=?,email=?, username=?,password=?,id_card_number=? WHERE id=?");

            pstmt.setString(1, name);
            pstmt.setString(2, last_name);
            pstmt.setString(3, email);
            pstmt.setString(4, username);
            pstmt.setString(5, password);
            pstmt.setString(6, id_card_number);
            pstmt.setInt(7, id);
           

            if (pstmt.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "Account updated!");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }
    
    
    public void updateBicycle(Integer id, String numberPlate, String location, String available, String id_user) {

        try {
            pstmt = DB.getConnection().prepareStatement("UPDATE bicycle SET number_plate=?,location=?,available=?,id_user=? WHERE id=?");

            pstmt.setString(1, numberPlate);
            pstmt.setString(2, location);
            pstmt.setString(3, available);
            pstmt.setString(4, id_user);
                     pstmt.setInt(5, id);
           

            if (pstmt.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "Bicycle updated!");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }

     public void fillUserTable(JTable table, String valueToSearch) {
        try {
            pstmt = DB.getConnection().prepareStatement("SELECT * FROM register WHERE CONCAT (name, last_name, email, username, password, id_card_number) LIKE ?");
            
            pstmt.setString(1, "%" + valueToSearch + "%");
        
            rs = pstmt.executeQuery();
           
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;

            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                
                

                model.addRow(row);

            }
           

        } catch (SQLException ex) {
            System.out.println("Could not fill the table " + ex);
        }

    }
  
    
    public void updateBicycleTable(Integer id, String numberPlate, String location, String available, String id_user) {

        try {
            pstmt = DB.getConnection().prepareStatement("UPDATE register SET name=?,last_name=?,email=?,username=?,password=?,id_card_number=? WHERE id=?");

            pstmt.setString(1, numberPlate);
            pstmt.setString(2, location);
            pstmt.setString(3, available);
            pstmt.setString(4, id_user);
                        pstmt.setInt(5, id);

            if (pstmt.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "Bicycle updated!");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }

    
    public void deleteAUser(Integer id, String name, String last_name, String email, String username, String password, String id_card_number) {

        try {
            pstmt = DB.getConnection().prepareStatement("DELETE FROM register WHERE id=?");

            pstmt.setInt(1, id);

            if (pstmt.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "Account deleted!");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }
public void deleteABicycle (Integer id, String numberPlate, String location, String available, String id_user) {

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
