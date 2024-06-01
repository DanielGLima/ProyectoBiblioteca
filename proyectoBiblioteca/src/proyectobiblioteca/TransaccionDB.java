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
public class TransaccionDB {
    Connection conn;
   
    public TransaccionDB(){
        conn = ConexionDB.getConnection();
    }
    
    public void create(Transaccion e){
        
        PreparedStatement st = null;
        
        try {
            String sql = """
                         INSERT INTO transaccion(Id,Tipo,IdCliente,Isbn,FechaPrestamo,FechaDevolucion,Multa)
                         """;
            
        st = conn.prepareStatement(sql);
        st.setInt(1, e.getId());
        st.setInt(2, e.getTipo());
        st.setInt(3, e.getIdCliente());
        st.setString(4, e.getIsbn());
        st.setDate(5, e.getFehaPrestamo());
        st.setDate(6, e.getFechaDevolucion());
        st.setDouble(7, e.getMulta());
        st.executeUpdate();
        
        } catch(SQLException ex){
            Logger.getLogger(TransaccionDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TransaccionDB.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }
}
