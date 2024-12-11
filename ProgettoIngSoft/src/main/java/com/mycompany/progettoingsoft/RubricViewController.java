/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft;

import com.mycompany.progettoingsoft.Contact.Contact;
import com.mycompany.progettoingsoft.Contact.Mail;
import com.mycompany.progettoingsoft.Rubric.Rubric;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

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
        FileChooser fileChooser = new FileChooser();
          fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File file = fileChooser.showOpenDialog(null);

         if (file != null) {
        Rubric importedRubric = rubric.importContacts(file.getAbsolutePath());
        if (importedRubric != null) {
            rubric.getContacts().addAll(importedRubric.getContacts());
            contactsListTable.refresh();
        } 
    }
    }
    
    /**
     * @brief Metodo che gestisce l'azione relativa al pulsante "Export".
     * @param event 
     */
    @FXML
    private void exportFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        
    
         fileChooser.setTitle("Export Contacts");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File selectedFile = fileChooser.showSaveDialog(null);

        if (selectedFile != null) {
            rubric.exportContacts(selectedFile.getAbsolutePath());
            System.out.println("Contacts exported successfully.");
    }
    }
    /**
     * @brief Metodo che gestisce l'azione relativa alla ricerca di un contatto.
     * @param event 
     */
    @FXML
    private void searchContact(ActionEvent event) {
    String searchString = searchField.getText().trim();

    if (!searchString.isEmpty()) { 
        Rubric searchResults = rubric.searchContact(searchString);
        contactsListTable.setItems(searchResults.getContacts());
        System.out.println("Search results updated for: " + searchString);
    } else {
        // Se il campo di ricerca è vuoto, mostra tutti i contatti
        contactsListTable.setItems(rubric.getContacts());
        System.out.println("Search field is empty. Showing all contacts.");
    }
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
        Contact newContact = new Contact(nameField.getText(), surnameField.getText(), new com.mycompany.progettoingsoft.Contact.Number(number1Field.getText(), number2Field.getText(), number3Field.getText()), new Mail(mail1Field.getText(), mail2Field.getText(), mail3Field.getText()));
        
        if(rubric.addContact(newContact)){
            contactsListTable.refresh();
            resetField();
        }
        
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
        Contact selContact=contactsListTable.getSelectionModel().getSelectedItem();
        if(!(selContact==null)){
            rubric.removeContact(selContact);
            contactsListTable.refresh();
        } 
        resetField();
    }
    
}
