package com.JdbcDemo;

import java.sql.Connection;      
import java.sql.DriverManager;   
import java.sql.ResultSet;       
import java.sql.SQLException;   
import java.sql.Statement;     

public class InsertdemoWithExplanation {
 public static void main(String[] args) {

     try {
       

         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("Driver is loaded");
         Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","tiger");

         System.out.println("Got database connection");
         Statement st = con.createStatement();

         st.execute("INSERT INTO EMP(EMP_ID, NAME, SALARY) VALUES (106, 'KUMAR', 6000)");
         st.execute("INSERT INTO EMP(EMP_ID, NAME, SALARY) VALUES (107, 'RAMA', 7000)");

         ResultSet rs = st.executeQuery("SELECT * FROM EMP");


         while (rs.next()) {

             int id = rs.getInt(1);        // EMP_ID

             String name = rs.getString(2); // NAME

             int sal = rs.getInt("SALARY");

             System.out.println(id + "\t" + name + "\t" + sal);
         }

         rs.close();   
         st.close();   
         con.close();  

     }
     catch (ClassNotFoundException e) {
         System.out.println("Driver not found: " + e);
     }
     catch (SQLException e) {
         System.out.println("SQL Error: " + e);
     }
 }
}
