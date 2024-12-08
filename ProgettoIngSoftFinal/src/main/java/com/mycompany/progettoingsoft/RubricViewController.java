/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft;

import com.mycompany.progettoingsoft.Contact.Contact;
import com.mycompany.progettoingsoft.Rubric.Rubric;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * @file RubricViewController.java
 * @brief Questo file permette di gestire l'interfaccia grafica della rubrica. 
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
    private TableColumn<Contact, String> nameClm;
    @FXML
    private TableColumn<Contact, String> surnameClm;
    @FXML
    private TableColumn<Contact, String> number1Clm;
    @FXML
    private TableColumn<Contact, String> number2Clm;
    @FXML
    private TableColumn<Contact, String> number3Clm;
    @FXML
    private TableColumn<Contact, String> mail1Clm;
    @FXML
    private TableColumn<Contact, String> mail2Clm;
    @FXML
    private TableColumn<Contact, String> mail3Clm;
    @FXML
    private Button addContactButton;
    @FXML
    private Button ModifyContactButton;
    @FXML
    private Button removeContactButton;
    @FXML
    private TableView<Contact> contactsListTable;
    
    private Rubric rubric = new Rubric();
  
    /**
     * @brief Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO        
    }    
    
    /**
     * @brief Metodo che gestisce l'azione relativa al pulsante "Import".
     * @param event 
     */
    @FXML
    private void importFile(ActionEvent event) {
    }
    
    /**
     * @brief Metodo che gestisce l'azione relativa al pulsante "Export".
     * @param event 
     */
    @FXML
    private void exportFile(ActionEvent event) {
    }
    
    /**
     * @brief Metodo che gestisce l'azione relativa alla ricerca di un contatto.
     * @param event 
     */
    @FXML
    private void searchContact(ActionEvent event) {
    }
    
    /**
     * @brief Metodo che gestisce l'azione relativa al checkbox che contrassegna i contatti come preferiti.
     * @param event 
     */
    @FXML
    private void contactIsFavourite(ActionEvent event) {
    }
    
    /**
     * @brief Metodo che gestisce l'azione relativa al pulsante "AddContact".
     * @param event 
     */
    @FXML
    private void addContact(ActionEvent event) {
        
    }

    /**
     * @brief Metodo che gestisce l'azione relativa al pulsante "ModifyContact".
     * @param event 
     */
    @FXML
    private void modifyContact(ActionEvent event) {
    }

    /**
     * @brief Metodo che gestisce l'azione relativa al pulsante "RemoveContact".
     * @param event 
     */
    @FXML
    private void removeContact(ActionEvent event) {
    }
    
}

