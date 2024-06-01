package proyectobiblioteca;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainViewController implements Initializable {

    @FXML
    private BorderPane vp;
    @FXML
    private AnchorPane ap;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void registroLibros(MouseEvent event) {
        loadPage("registroLibros");
    }

    @FXML
    private void registroUsuarios(MouseEvent event) {
        loadPage("registroUsuarios");
    }

    @FXML
    private void prestamoLibros(MouseEvent event) {
        loadPage("prestamoLibros");
    }

    @FXML
    private void devolucionLibros(MouseEvent event) {
        loadPage("devolucionLibros");
    }

    @FXML
    private void busquedaLibros(MouseEvent event) {
        loadPage("busquedaLibros");
    }

    @FXML
    private void gestionarUsuario(MouseEvent event) {
        loadPage("gestionarUsuario");
    }

    @FXML
    private void consultarTransacciones(MouseEvent event) {
        loadPage("consultarTransacciones");
    }

    private void loadPage(String page){
    Parent root = null;
    try {
        root = FXMLLoader.load(getClass().getResource("/proyectobiblioteca/views/" + page + ".fxml"));
    } catch (IOException ex) {
        Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
    }
    vp.setCenter(root);
}
}
