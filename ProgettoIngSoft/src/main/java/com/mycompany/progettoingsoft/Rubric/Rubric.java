/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Rubric;

import com.mycompany.progettoingsoft.Contact.Contact;
import com.mycompany.progettoingsoft.IO.FileHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 *
 * @author Benedetta
 */
public class Rubric implements FileHandler{
    private ObservableList<Contact> contacts;
	
    public Rubric() {
	contacts = FXCollections.observableArrayList();
    }

    public ObservableList<Contact> getContacts() {
        return contacts;
    }
	
    public final boolean addContact(Contact c){
        
    }
	
    public final boolean modifyContact( Contact c ){
    }
	
    public boolean removeContact( Contact c ){
    }
	
    public final boolean contactIsFavourite( Contact c ){
    }
    
    public Contact searchContact( String s ){
                   
    }  
    
    @Override
    public Rubric importContacts(String filename) {
        
    }

    @Override
    public void exportContacts(String filename) {
        
    }

    @Override
    public String toString() {
        
    }
}
