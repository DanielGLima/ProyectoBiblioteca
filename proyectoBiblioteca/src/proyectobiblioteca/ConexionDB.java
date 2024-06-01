/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class ConexionDB extends proyectoBiblioteca{
    private String url = "jdbc:postgresql://bubble.db.elephantsql.com:5432/nypveluw";
    private Properties properties = new Properties();
    private static Connection conn = null;
    
    private ConexionDB () {
        properties.setProperty("user", "nypveluw");
        properties.setProperty("password", "IPRB8MfbsQY1or3yxQhz1lFvmB8x7vAS");
        
        try {
            conn = DriverManager.getConnection(url, properties);
            System.out.println("Conexion Exitosa a la base de datos");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fallo al conectar a la base de datos");
        }
    }
    
    public static Connection getConnection() {
        if (conn == null) {
               ConexionDB c = new ConexionDB();
               return c.conn;
        }
        else {
            return conn ;
        }
    }
            public static boolean estaConectado() {
        try {
            return !getConnection().isClosed();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
