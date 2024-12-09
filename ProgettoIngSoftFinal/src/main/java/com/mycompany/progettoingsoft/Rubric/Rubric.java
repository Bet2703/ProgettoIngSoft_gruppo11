/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Rubric;

import com.mycompany.progettoingsoft.Contact.Number;
import com.mycompany.progettoingsoft.Contact.Mail;
import com.mycompany.progettoingsoft.Contact.Contact;
import com.mycompany.progettoingsoft.IO.FileHandler;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 * @file Rubric.java
 * @brief Questa classe si occupa di gestire un insieme di Contatti
 * 
 * Mette a disposizione metodi per gestire una rubrica, quali aggiungi contatto,
 * modifica contatto, rimuovi contatto, ricerca di un contatto nella lista, 
 * import ed export della rubrica.
 * 
 * @author Benedetta
 */
public class Rubric implements FileHandler {
    private ObservableList<Contact> contacts;
    
    /**
     * @brief Costruttore della classe Rubric. 
     * 
     * Si occupa di inizializzare la collezione. 
     */
    public Rubric() {
	this.contacts = FXCollections.observableArrayList();
    }
    
    /**
     * @brief Metodo get per l'insieme di contatti. 
     * 
     * @return Ritorna l'insieme di contatti.
     */
    public ObservableList<Contact> getContacts() {
        return contacts;
    }
    
    /**
     * @brief Gestisce l'inserimento di un contatto nell'insieme.
     * 
     * @pre Il contatto è stato creato.
     * @post Il contatto viene aggiunto alla rubrica.
     * 
     * @param[in] c il contatto da aggiungere all'insieme.
     * @return Ritorna una valore booleano per confermare o meno l'inserimento.
     */
    public final boolean addContact(Contact c){
        
        if(contacts.add(c)){
            contacts.sort(null);
            return true;
        }
        else return false;
    }
    
    /**
     * @brief Gestisce la modifica del contatto passato come parametro.
     * 
     * @pre Esiste almeno un contatto nella rubrica.
     * @post Il contatto è stato modificato.
     * 
     * @param[inout] c Il contatto da modificare.
     * @param[in] newName Il nuovo nome.
     * @param[in] newSurname Il nuovo cognome.
     * @param[in] newNumber Il nuovo insieme di numeri.
     * @param[in] newMail Il nuovo insieme di mail.
     * @param[in] newFavourite Modifica il valore booleano che contrassegna il contatto come preferito.
     * @return Ritorna un valore booleano per confermare o meno la modifica.
     */
    public final boolean modifyContact(Contact c, String newName, String newSurname, Number newNumber, Mail newMail, boolean newFavourite){
        boolean i=false;
        if(c.getName()!=newName){
            c.setName(newName);
            i=true;
        }
        if(c.getSurname()!=newSurname){
            i=true;
            c.setSurname(newSurname);
        }
        if(!c.getNumbers().equals(newNumber)){
            i=true;
            c.setNumbers(newNumber);
        }
        if(!c.getMails().equals(newMail)){
            i=true;
            c.setMails(newMail);
        }
        if(c.isFavourite()!=newFavourite){
            i=true;
            c.setFavourite(newFavourite);
        }
        return i;
    }
	
    /**
     * @brief Gestisce la rimozione del contatto passato come parametro.
     * 
     * @pre Esiste almento un contatto nella rubrica.
     * @post Il contatto viene rimosso dalla rubrica. 
     * @param[in] c
     * @return Ritorna un valore booleano per confermare o meno la rimozione. 
     */
    public boolean removeContact( Contact c ){
        return this.contacts.remove(c);
    }
    
    /**
     * @brief Gestisce la possibilià di contrassegnare il contatto come preferito. 
     * 
     * @pre Esiste almeno un contatto nella rubrica.
     * @post Il contatto viene modificato e contrassegnato.
     * 
     * @param[in] c
     * @return Ritorna un booleano se il contatto è stato contrassegnato o meno. 
     * 
     * @see modifyContact(Contact c, String newName, String newSurname, Number newNumber, Mail newMail, boolean newFavourite)
     */
    public final void contactIsFavourite( Contact c ){
        c.setFavourite(true);
        
    }
    
    /**
     * @biref Gestisce la ricerca di un contatto nell'insieme.
     * 
     * @pre Esiste almeno un contatto nella rubrica. 
     * @post Viene mostrato un sottoinsieme della rubrica.
     * 
     * @param[in] s La stringa da ricercare nei contatti.
     * @return Ritorna un sottoinsieme della rubrica con i contatti contenenti la stringa s.
     */
    public Rubric searchContact( String s ){
        Rubric search = new Rubric(); // Crea una nuova rubrica per memorizzare i risultati
        for (Contact c : contacts ) { // Itera su tutti i contatti nella rubrica
            if (c.getName().toLowerCase().contains(s.toLowerCase())||(c.getSurname().toLowerCase().contains(s.toLowerCase()))) {
                search.addContact(c); // Aggiunge il contatto che corrisponde alla ricerca
            }
        }
    return search; // Restituisce la rubrica filtrata
    }           
      
    
    /**
     * @brief Metodo dell'interfaccia FileHandler, con implementazione per importare contatti.
     * 
     * @pre Esiste un file nella directory del progetto.
     * @post Il file viene importato e la rubrica mostrata.
     * 
     * @param[in] filename Il nome del file da importare.
     * @return Ritorna la rubrica contenuta nel file.
     */
     @Override
    public Rubric importContacts (String filename)  {
        try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream(filename))){
            return (Rubric) ois.readObject();
        } catch (FileNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException ex) {
            return null;
        }
    } 
    /**
     * @brief Metodo dell'interfaccia FileHandler, con implementazione per esportare i contatti.
     * 
     * @pre La rubrica contiene almento un contatto da esportare. 
     * @post La rubrica viene esportata e salvata su un file.
     * 
     * @param[inout] filename 
     */
    @Override
    public void exportContacts(String filename) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(this.contacts);
        } catch (IOException ex) {
            Logger.getLogger(Rubric.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Rubric");
        for(Contact ci : this.contacts){
            sb.append(ci.toString() + "\n");
        }
        return sb.toString();
    }
}
