/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.sql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import crud.sql.Employee;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author Muhammad Shaheer
 */

public class EmployeeDao {
     public static boolean insertEmployeeToDB(Employee emp) {
         boolean flag = false;
         //jdbc code..
         try {
             Connection con = ConnectionProcedure.createC();
             String q = "insert into employee(ename,ephone,ecity) values(?,?,?)";
             PreparedStatement pstmt = con.prepareStatement(q);
             //set value of parameter
             pstmt.setString(1,emp.getEmployeeName());
             pstmt.setString(2, emp.getEmployeePhone());
             pstmt.setString(3, emp.getEmployeeCity());
             
             //execute..
             pstmt.executeUpdate();
             flag = true;
      
         } catch(Exception e) {
             System.out.print("Too long");
         }
         return flag;
     }
     
     //JLIST
   
     
     public void fillDataJList(JList jList) {
       ResultSet rs = null;
       Statement stmt = null;
     
         try {
             
            DefaultListModel model = new DefaultListModel();
            Connection conn = ConnectionProcedure.createC();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                String name = rs.getString("ename");
                model.addElement(name );
            }
             jList.setModel(model);
         } catch(SQLException sqle){
             System.out.print("sqle");
         }
     }
       
     }
         
     
     

