/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

import com.mycompany.progettoingsoft.Contact.Mail;
import com.mycompany.progettoingsoft.Contact.Number;

/**
 * @file Contact.java
 * @brief Questo file gestissce i contatti della rubrica.
 * 
 * Permette di inizializzare, fare la set e la get del nome, cognome e permette di
 * segnare un contatto con il contrassegna "Favourite". Richiama inoltre i metodi 
 * set e get di "Number" e "Mail". Implementa l'Override di "compareTo" e 
 * "toString".
 * 
 * @author andre
 */
public class Contact implements Comparable<Contact> {
    private String name;
    private String surname;
    private Number numbers;
    private Mail mails;
    private boolean favourite;
    /**
     * @brief Costruttore della classe Contact.
     * 
     * Inizializza nome, cognome, i numeri e le mail come parametri di ingresso.
     * 
     * @post Viene creato l'oggetto Contact.
     * 
     * @param[in] name
     * @param[in] surname
     * @param[in] numbers
     * @param[in] mails 
     */
    public Contact(String name, String surname, Number numbers, Mail mails){
        this.name=name;
        this.surname=surname;
        this.numbers = numbers;
        this.mails = mails;
    } 
    
    /**
     * @brief Metodo che gestisce la set del nome.
     * 
     * @post la variabile name viene aggiornata con la stringa passata come parametro.
     * 
     * @param[in] name.
     */
    public void setName(String name) {
    }
    
    /**
     * @brief Metodo che gestisce la set del cognome.
     * 
     * @post la variabile surname viene aggiornata con la stringa passata come parametro.
     * 
     * @param[in] surname. 
     */
    public void setSurname(String surname) {
    }
    
    /**
     * @brief Metodo che gestisce la set del contrassegna "Favoutrite"
     * 
     * @post la variabile setFavourite viene aggiornata con il valore booleano favourite.
     * 
     * @param[in] favourite. 
     */
    public void setFavourite(boolean favourite) {
    }
    
    /**
     * @brief Metodo che gestisce la get della stringa nome.
     * 
     * Accede al valore dell' attributo privato name.
     * 
     * @pre il parametro "name" è stato inizializzato correttamente.
     * @post viene restituito il valore di "name".
     * 
     * @return stringa contenente il nome.
     */
    public String getName() {
    }
    
    /**
     * @brief Metodo che gestisce la get della stringa cognome.
     * 
     * Accede al valore dell' attributo privato surname.
     * 
     * @pre il parametro "surname" è stato inizializzato correttamente.
     * @post viene restituito il valore di "surname".
     * 
     * @return stringa contenente il cognome.
     */
    public String getSurname() {
    }
    /**
    * @brief Metodo che gestisce la get della variabile booleana isFavourite.
    * 
    * Accede al valore dell' attributo privato favourite.
    * 
    * @pre il parametro "favourite" è stato inizializzato correttamente.
    * @post viene restituito il valore di "favourite".
    * 
    * @return variabile booleana isFavourite.
    */
    public boolean isFavourite() {
    }  
    
    /**
     * @brief Richiama il metodo setNumbers della classe Number.
     * 
     * @see setNumbers(String[] numbers)
     * 
     * @param[in] numbers. 
     */
    public void setNumbers(Number numbers){
        
    }
    /**
     * @brief Richiama il metodo setMails della classe Mail.
     * 
     * @see setMails(String[] mails)
     * 
     * @param[in] mails. 
     */
    public void setMails (Mail mails){
        
    }
    /**
     * @brief Confronta l'oggetto corrente con un altro oggetto di tipo Contact.
     * 
     * Viene ordinato secondo l'ordine naturale del cognome
     * Se due cognomi sono uguali, segue l'ordine naturale del nome
     * 
     * @param[in] o
     * @return  Un valore negativo, zero o positivo se l'oggetto corrente è rispettivamente minore, uguale o maggiore rispetto a o.
     */
    @Override
    public int compareTo(Contact o) {
        
    }

    @Override
    public String toString() {
    }
}
