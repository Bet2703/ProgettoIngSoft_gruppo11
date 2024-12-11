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
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        if(!c.getName().equals(newName)){
            c.setName(newName);
            i=true;
        }
        if(!c.getSurname().equals(newSurname)){
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
    public Rubric importContacts(String filename) {
        Rubric imported = new Rubric();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line = br.readLine(); // Legge l'intestazione
        while ((line = br.readLine()) != null) {
            String[] fields = line.split("[;]"); // Split gestisce i campi con virgolette
            if (fields.length >= 4) {
                String name = fields[0];
                String surname = fields[1];
                String[] numberFields = fields[2].split("[,]");
                String[] mailFields = fields[3].split("[,]");
                
                Number numbers = new Number(
                    numberFields.length > 0 ? numberFields[0] : "",
                    numberFields.length > 1 ? numberFields[1] : "",
                    numberFields.length > 2 ? numberFields[2] : ""
                );

                Mail mails = new Mail(
                    mailFields.length > 0 ? mailFields[0] : "",
                    mailFields.length > 1 ? mailFields[1] : "",
                    mailFields.length > 2 ? mailFields[2] : ""
                );

                Contact contact = new Contact(name, surname, numbers, mails);
                imported.addContact(contact);
            }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File non trovato: " + filename);
            return null;
        } catch (IOException e) {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
            return null;
        }
        return imported;
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
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            bw.write("NAME; SURNAME; NUMBERS; MAILS");
            bw.newLine();
            
            for(Contact c : this.contacts){
                bw.write(c.getName());
                bw.append(";");
                bw.write(c.getSurname());
                bw.append(";");
                bw.write(c.getNumbers().toString());
                bw.append(";");
                bw.write(c.getMails().toString());
                bw.newLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Rubric.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rubric");
        for(Contact ci : this.contacts){
            sb.append(ci.toString() + "\n");
        }
        return sb.toString();
    }
}