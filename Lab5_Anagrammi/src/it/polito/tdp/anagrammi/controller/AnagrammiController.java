package it.polito.tdp.anagrammi.controller;



import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class AnagrammiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label txtParola;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea txtResultCorrect;

    @FXML
    private TextArea txtResultWrong;

    @FXML
    private Button btnClear;

	private Model model;

    @FXML
    void doCalcolaAnagrammi(ActionEvent event) {

    }

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultCorrect != null : "fx:id=\"txtResultCorrect\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtResultWrong != null : "fx:id=\"txtResultWrong\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }

	public void setModel(Model model) {
		this.model=model;
		
	}
}


