package com.BikeSharing.Model;

import com.BikeSharing.Database.Database;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Anisa Gurabardhi
 */
public class User {

    private PreparedStatement pstmt;
    private ResultSet rs;
    private final Database DB = new Database();

    public void addUser(Integer id, String name, String last_name, String email, String username, String password, String id_card_number) {

        try {
            pstmt = DB.getConnection().prepareStatement("INSERT INTO register(name, last_name, email, username, password, id_card_number) VALUES (?,?,?,?,?,?) ");
            pstmt.setString(1, name);
            pstmt.setString(2, last_name);
            pstmt.setString(3, email);
            pstmt.setString(4, username);
            pstmt.setString(5, password);
            pstmt.setString(6, id_card_number);

            if (pstmt.executeUpdate() != 0) {

                JOptionPane.showMessageDialog(null, "Account created successfully!");

            }
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }

    }

    public boolean verifyUser(String username, String password) {

        try {
            pstmt = DB.getConnection().prepareStatement("SELECT * FROM register WHERE username=? AND password=?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                return true;
            }
           
        } catch (SQLException ex) {
            System.out.println("Could not verify user "+ex);
        }
        return false;
    }

    public boolean checkUsername(String username) {
        boolean usernameExists = false;
        try {
            pstmt = DB.getConnection().prepareStatement("SELECT * FROM register WHERE username=?");
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                usernameExists = true;
            }
           
        } catch (SQLException ex) {
            System.out.println("Could not check user "+ex);
        }
        return usernameExists;
    }

//  public void deleteAccount(String username) {
//
//        try {
//            pstmt = DB.getConnection().prepareStatement("DELETE FROM register WHERE username=?");
//
//            pstmt.setString (1, username);
//
//            if (pstmt.executeUpdate() != 0) {
//
//                JOptionPane.showMessageDialog(null, "Account deleted!");
//
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Something went wrong");
//        }
//    }
//    
    
}
