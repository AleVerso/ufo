package it.polito.tdp.ufo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> CBoxShape;

    @FXML
    private Button btnConta;

    @FXML
    private TextField txtNumber;

    @FXML
    void DoConta(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert CBoxShape != null : "fx:id=\"CBoxShape\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnConta != null : "fx:id=\"btnConta\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtNumber != null : "fx:id=\"txtNumber\" was not injected: check your FXML file 'Scene.fxml'.";

    }
} 