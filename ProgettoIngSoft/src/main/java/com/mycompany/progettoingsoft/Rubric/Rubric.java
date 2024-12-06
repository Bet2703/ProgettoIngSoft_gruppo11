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
 * @file Rubric.java
 * @brief Questa classe si occupa di gestire un insieme di Contatti, 
 * mettendo a disposizione metodi per gestire una rubrica.
 * 
 * @author Benedetta
 */
public class Rubric implements FileHandler{
    private ObservableList<Contact> contacts;
    
    /**
     * @brief Costruttore della classe Rubric. 
     * 
     * Si occupa di inizializzare la collezione. 
     */
    public Rubric() {
	contacts = FXCollections.observableArrayList();
    }
    
    /**
     * @brief Metodo get per l'insieme di contatti. 
     * @return Ritorna l'insieme di contatti.
     */
    public ObservableList<Contact> getContacts() {
        return contacts;
    }
    
    /**
     * @brief Gestisce l'inserimento di un contatto nell'insieme.
     * @param c il contatto da aggiungere all'insieme.
     * @return Ritorna una valore booleano per confermare o meno l'inserimento.
     */
    public final boolean addContact(Contact c){
        
    }
    
    /**
     * @brief Gestisce la modifica del contatto passato come parametro.
     * @param c Il contatto da modificare.
     * @param newName Il nuovo nome.
     * @param newSurname Il nuovo cognome.
     * @param newNumber Il nuovo insieme di numeri.
     * @param newMail Il nuovo insieme di mail.
     * @param newFavourite Modifica il valore booleano che contrassegna il contatto come preferito.
     * @return Ritorna un valore booleano per confermare o meno la modifica.
     */
    public final boolean modifyContact(Contact c, String newName, String newSurname, Number newNumber, Mail newMail, boolean newFavourite){
    }
	
    /**
     * @brief Gestisce la rimozione del contatto passato come parametro.
     * @param c
     * @return Ritorna un valore booleano per confermare o meno la rimozione. 
     */
    public boolean removeContact( Contact c ){
    }
    
    /**
     * @brief Gestisce la possibilià di contrassegnare il contatto come preferito. 
     * @param c
     * @return Ritorna un booleano se il contatto è stato contrassegnato o meno. 
     */
    public final boolean contactIsFavourite( Contact c ){
    }
    
    /**
     * @biref Gestisce la ricerca di un contatto nell'insieme.
     * @param s La stringa da ricercare nei contatti.
     * @return Ritorna un sottoinsieme della rubrica con i contatti contenenti la stringa s.
     */
    public Rubric searchContact( String s ){
                   
    }  
    
    /**
     * @brief Metodo dell'interfaccia FileHandler, con implementazione per importare contatti.
     * @param filename Il nome del file da importare.
     * @return Ritorna la rubrica contenuta nel file.
     */
    @Override
    public Rubric importContacts(String filename) {
        
    }
    
    /**
     * @brief Metodo dell'interfaccia FileHandler, con implementazione per esportare i contatti.
     * @param filename 
     */
    @Override
    public void exportContacts(String filename) {
        
    }

    @Override
    public String toString() {
        
    }
}
