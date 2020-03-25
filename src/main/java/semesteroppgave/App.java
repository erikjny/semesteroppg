package semesteroppgave;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semesteroppgave.GUI.GUIController;

import java.io.IOException;

public class App extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("GUI", stage));
        stage.setScene(scene);
        stage.show();
    }

    private static Parent loadFXML(String fxml, Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        Parent root = (Parent)fxmlLoader.load();
        GUIController controller = fxmlLoader.getController();
        controller.setStage(stage);
        return root;
    }

    public static void main(String[] args) {
        launch();
    }

}
