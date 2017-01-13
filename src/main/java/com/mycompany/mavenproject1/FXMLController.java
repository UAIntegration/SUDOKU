package com.mycompany.mavenproject1;

import ibessonov.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class FXMLController implements Initializable {
    String code = "";
    String result = "";
    int count = 0;
    
    @FXML
    private Label label;
    
    @FXML
    private ProgressBar prog;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws InterruptedException {
        count++;
        System.out.println("You clicked me " + count + " times!");
        label.setText("finished");
        label.autosize();
        code = "080900013931580700000103890300010080540020061120050009052801000093260158810005000";
        Walk me = new Walk();
        me.setDaemon(true);
        me.start();
        prog.setProgress(0.5);
        Thread.sleep(5000);
        if (result.length()<5) label.setText("Difficult...");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    class Walk extends Thread implements Runnable {
        @Override
        public void run() {
            result = Main.main(code);
            System.out.println(Main.main(result));
        }
    }
}
