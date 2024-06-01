/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class ClienteDB {
    
    Connection conn;
    
    public  ClienteDB(){
        conn = ConexionDB.getConnection();
    }
    
    public void create(Cliente e){
        PreparedStatement st = null;
        
        try{
            String sql = """
                         INSERT INTO Cliente(Id,Nombre,Direccion,Telefono,NoIdentificacion)
                         VALUES (?,?,?,?,?)
                         """;
            st = conn.prepareStatement(sql);
            st.setInt(1, e.getId());
            st.setString(2, e.getNombre());
            st.setString(3, e.getDireccion());
            st.setInt(4, e.getTelefono());
            st.setInt(5, e.getNoIdentificacion());
            int executeUpdate = st.executeUpdate();
            
        }
        catch (SQLException ex) {
            Logger.getLogger(ClienteDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDB.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    
    
    }
}