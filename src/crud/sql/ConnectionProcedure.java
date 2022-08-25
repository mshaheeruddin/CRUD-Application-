/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.sql;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Muhammad Shaheer
 */
public class ConnectionProcedure {
    
static Connection con;
    public static Connection createC() {
try {        
//load the driver
Class.forName("com.mysql.jdbc.Driver");
//create the connection
String user = "root";
String password = "microphone";
String url = "jdbc:mysql://localhost:3306/user_manage";


con = DriverManager.getConnection(url,user,password);

        
    }catch (Exception e ) {
        e.printStackTrace();
    }
    
return con;
    }
}

