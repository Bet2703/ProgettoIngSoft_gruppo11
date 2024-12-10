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
import javafx.beans.property.SimpleStringProperty;
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
        contactsListTable.setItems(rubric.getContacts());
        
        surnameClm.setCellValueFactory(c -> {
           return new SimpleStringProperty(c.getValue().getSurname());
        });
       
        nameClm.setCellValueFactory(c -> {
            return new SimpleStringProperty(c.getValue().getName());
        });
       
        number1Clm.setCellValueFactory(c -> {
           return new SimpleStringProperty(c.getValue().getNumbers().getNumber1());
        });
       
        number2Clm.setCellValueFactory(c -> {
           return new SimpleStringProperty(c.getValue().getNumbers().getNumber2());
        });
       
        number3Clm.setCellValueFactory(c -> {
           return new SimpleStringProperty(c.getValue().getNumbers().getNumber3());
        });
       
        mail1Clm.setCellValueFactory(c -> {
            return new SimpleStringProperty(c.getValue().getMails().getMail1());
        });
       
        mail2Clm.setCellValueFactory(c -> {
            return new SimpleStringProperty(c.getValue().getMails().getMail2());
        });
              
        mail3Clm.setCellValueFactory(c -> {
           return new SimpleStringProperty(c.getValue().getMails().getMail3());
        });
        
        contactsListTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue != null){
                nameField.setText(newValue.getName());
                surnameField.setText(newValue.getSurname());
                number1Field.setText(newValue.getNumbers().getNumber1());
                number2Field.setText(newValue.getName());
                number3Field.setText(newValue.getName());
                mail1Field.setText(newValue.getMails().getMail1());
                mail2Field.setText(newValue.getMails().getMail2());
                mail3Field.setText(newValue.getMails().getMail3());
            }
        });
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
        Contact selectedContact = contactsListTable.getSelectionModel().getSelectedItem();
        if(selectedContact != null){
            rubric.modifyContact(selectedContact, nameField.getText(), surnameField.getText(), new Number(number1Field.getText(), number2Field.getText(), number3Field.getText()),new Mail(mail1Field.getText(), mail2Field.getText(), mail3Field.getText()), favouriteCheck);
        }
    }

    /**
     * @brief Metodo che gestisce l'azione relativa al pulsante "RemoveContact".
     * @param event 
     */
    @FXML
    private void removeContact(ActionEvent event) {
    }
    
}

