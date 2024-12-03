/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Benedetta
 */
public class RubricViewController implements Initializable {

    @FXML
    private Button importButton;
    @FXML
    private Button exportButton;
    @FXML
    private TextField searchField;
    @FXML
    private Button closeButton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField number1Field;
    @FXML
    private TextField number2Field;
    @FXML
    private TextField number3Field;
    @FXML
    private TextField mail1Field;
    @FXML
    private TextField mail2Field;
    @FXML
    private TextField mail3Field;
    @FXML
    private CheckBox favouriteCheck;
    @FXML
    private TableColumn<?, ?> nameClm;
    @FXML
    private TableColumn<?, ?> surnameClm;
    @FXML
    private TableColumn<?, ?> number1Clm;
    @FXML
    private TableColumn<?, ?> number2Clm;
    @FXML
    private TableColumn<?, ?> number3Clm;
    @FXML
    private TableColumn<?, ?> mail1Clm;
    @FXML
    private TableColumn<?, ?> mail2Clm;
    @FXML
    private TableColumn<?, ?> mail3Clm;
    @FXML
    private Button addContactButton;
    @FXML
    private Button ModifyContactButton;
    @FXML
    private Button removeContactButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void importFile(ActionEvent event) {
    }

    @FXML
    private void exportFile(ActionEvent event) {
    }

    @FXML
    private void searchContact(ActionEvent event) {
    }

    @FXML
    private void closeRubric(ActionEvent event) {
    }

    @FXML
    private void contactIsFavourite(ActionEvent event) {
    }

    @FXML
    private void addContact(ActionEvent event) {
    }

    @FXML
    private void modifyContact(ActionEvent event) {
    }

    @FXML
    private void removeContact(ActionEvent event) {
    }
    
}
