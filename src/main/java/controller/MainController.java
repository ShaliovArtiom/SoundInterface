package main.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;



/**
 * Created by shali on 19.10.2017.
 */
public class MainController {

    @FXML
    private TextArea textArea;


    @FXML
    public void voiceButton(){
        new ParseController(textArea.getText());

    }

    @FXML
    public void clearButton(){
        textArea.setText("");
    }
}
