package com.vojtech.javafx;

import atlantafx.base.theme.PrimerLight;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {


        Application.setUserAgentStylesheet(new PrimerLight().getUserAgentStylesheet());
        Scene scene;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/vojtech/javafx/view/First.fxml"));
            Parent root = loader.load();
            scene = new Scene(root);

            String css = getClass().getResource("/com/vojtech/javafx/css/main.css").toExternalForm();

            scene.getStylesheets().add(css);

        } catch (Exception e) {
            scene = new Scene(new AnchorPane());
        }




        String iconPathName = null;
        try {
            iconPathName = getClass().getResource("/com/vojtech/javafx/image/winning-cup-icon.png").toExternalForm();
            Image icon = new Image(iconPathName);
            stage.getIcons().add(icon);
        } catch (Exception e) {

        }


        stage.setTitle("sTandi.");
        stage.setScene(scene);
        stage.show();




    }

}