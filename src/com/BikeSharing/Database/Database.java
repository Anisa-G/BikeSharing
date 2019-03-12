package com.BikeSharing.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Anisa Gurabardhi
 */

public class Database {
    
    
  private static Connection connection = null;

      public  Connection getConnection(){
          
           try{
               
               connection = DriverManager.getConnection("jdbc:mysql://localhost/bike_sharing","root","");
               
           } catch (SQLException ex) {
               System.out.println("You failed to connect to the Database"+ex);
           } 
           return connection;
       }
     
}