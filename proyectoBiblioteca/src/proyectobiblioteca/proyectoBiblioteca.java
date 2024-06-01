package proyectobiblioteca;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class proyectoBiblioteca extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Cargar el archivo FXML de la vista principal
        Parent root = FXMLLoader.load(getClass().getResource("/proyectobiblioteca/views/MainView.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Biblioteca");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
