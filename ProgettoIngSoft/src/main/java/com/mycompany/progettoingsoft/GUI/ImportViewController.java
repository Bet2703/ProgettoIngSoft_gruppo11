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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 * @file ImportViewController.java
 * @brief Questa classe permette di importare un file all'interno del progetto 
 * attraverso il nome. 
 * @author andre
 */
public class ImportViewController implements Initializable {

    @FXML
    private TextField filenameField;
    @FXML
    private Button openFileButton;

    /**
     *@brief Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    /**
     * @brief Metodo che gestisce l'import del file.
     * @param event 
     */
    @FXML
    private void importFile(ActionEvent event) {
    }

    
}
