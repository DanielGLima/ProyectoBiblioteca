package proyectobiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibroDB {

    private final String url = "jdbc:postgresql://localhost:5432/tu_basedatos";
    private final String user = "tu_usuario";
    private final String password = "tu_contraseña";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conn;
    }

    public boolean create(Libro libro) {
        String SQL = "INSERT INTO libro(isbn, titulo, autor, anio, editorial, cantidad) VALUES(?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {

            if (conn == null) {
                System.out.println("No se pudo establecer la conexión.");
                return false;
            }

            pstmt.setString(1, libro.getIsbn());
            pstmt.setString(2, libro.getTitulo());
            pstmt.setString(3, libro.getAutor());
            pstmt.setInt(4, libro.getAnioPublicacion());
            pstmt.setString(5, libro.getEditorial());
            pstmt.setInt(6, libro.getCantidadDisponible());

            pstmt.executeUpdate();
            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
