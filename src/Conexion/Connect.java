/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author totit
 */
public class Connect {
    
   


    
    private static String DRIVER= "com.mysql.cj.jdbc.Driver";
    private static String USUARIO= "mi_credencial";
    private static String PASSWORD= "12345678";
    private static String URL= "jdbc:mysql://database-1.ce0nhwtoznll.us-east-1.rds.amazonaws.com";
    
    static{
            try{
            Class.forName(DRIVER);      
            }catch (ClassNotFoundException e){
                JOptionPane.showMessageDialog(null,"Error en el driver:"+e);
                    }

    }
    public Connection getConnection(){
        Connection con =null;
        try{
        con=DriverManager.getConnection(URL,USUARIO,PASSWORD);
        JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en la conexion");
            
        }
        return con;
    }
}
    

