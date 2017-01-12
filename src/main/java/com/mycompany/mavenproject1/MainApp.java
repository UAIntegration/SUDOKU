package com.mycompany.mavenproject1;

import ibessonov.Main;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent main1 = FXMLLoader.load(getClass().getResource("/fxml/Scene_1.fxml"));
        Scene scene = new Scene(main1);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("Sudoku Solver");
        stage.setScene(scene);
        stage.show();
        String text = "080900013931580700000103890300010080540020061120050009052801000093260158810005000";
        System.out.println(Main.main(text));
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
