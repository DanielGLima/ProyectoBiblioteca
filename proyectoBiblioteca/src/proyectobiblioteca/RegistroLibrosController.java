package proyectobiblioteca;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RegistroLibrosController {

    @FXML
    private TextField isbnField;
    @FXML
    private TextField tituloField;
    @FXML
    private TextField autorField;
    @FXML
    private TextField anioField;
    @FXML
    private TextField editorialField;
    @FXML
    private TextField cantidadField;
    @FXML
    private Button saveButton;
    @FXML
    private Label messageLabel;

    private LibroDB libroDB;

    public RegistroLibrosController() {
        libroDB = new LibroDB();
    }

    @FXML
    private void handleSave() {
        String isbn = isbnField.getText();
        String titulo = tituloField.getText();
        String autor = autorField.getText();
        int anio = Integer.parseInt(anioField.getText());
        String editorial = editorialField.getText();
        int cantidad = Integer.parseInt(cantidadField.getText());

        Libro libro = new Libro(isbn, titulo, autor, anio, editorial, cantidad);

        if (libroDB.create(libro)) {
            messageLabel.setText("Libro agregado exitosamente.");
            clearFields();
        } else {
            messageLabel.setText("Error al agregar el libro.");
        }
    }

    private void clearFields() {
        isbnField.clear();
        tituloField.clear();
        autorField.clear();
        anioField.clear();
        editorialField.clear();
        cantidadField.clear();
    }
}
