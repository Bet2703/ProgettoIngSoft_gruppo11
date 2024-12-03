/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Rubric;

import com.mycompany.progettoingsoft.Contact.Contact;
import com.mycompany.progettoingsoft.IO.FileHandler;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Benedetta
 */
public class Rubric implements FileHandler{
    private Set<Contact> contacts;
	
    public Rubric() {
	contacts = new TreeSet<>();
    }

    public Set<Contact> getContacts() {
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
    public void importContacts(String filename) {
        
    }

    @Override
    public Rubric exportContacts(String filename) {
        
    }

    @Override
    public String toString() {
        
    }
}
