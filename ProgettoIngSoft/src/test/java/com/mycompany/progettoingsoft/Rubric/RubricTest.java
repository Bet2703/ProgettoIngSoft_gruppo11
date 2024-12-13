/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Rubric;

import com.mycompany.progettoingsoft.Contact.Contact;
import com.mycompany.progettoingsoft.Contact.Mail;
import com.mycompany.progettoingsoft.Contact.Number;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author andre
 */
public class RubricTest {
    private Number numbers;
    private Mail mails;
    private Contact contact;
    private Contact contact2;
    private Rubric rubric;
    
    public RubricTest() {
    }
    

    @BeforeEach
    public void setUp() {
        numbers = new Number("1357924680", "2468013579");
        mails = new Mail("aniello.dilieto@mail.com", "benedetta.delmauro@mail.com");
        contact = new Contact("Aniello", "Di Lieto", numbers, mails);
        contact2 = new Contact("Andrea", "Di Muro", numbers, mails);        
        rubric=new Rubric();
    }

    /**
     * Test of getContacts method, of class Rubric.
     */
    @Test
    public void testGetContacts() {
        System.out.println("getContacts");
        this.setUp();
        ObservableList<Contact> contacts = rubric.getContacts();
        assertNotNull(contacts); // La lista dei contatti non dovrebbe essere null.
        assertTrue(contacts.isEmpty()); // La lista dei contatti dovrebbe essere inizialmente vuota.
    }



    /**
     * Test of addContact method, of class Rubric.
     */
    @Test
    public void testAddContact() {
        System.out.println("addContact");
        this.setUp();
        boolean added = rubric.addContact(contact);
        assertTrue(added); // Il contatto dovrebbe essere aggiunto con successo.
        assertEquals(1, rubric.getContacts().size()); // La lista dei contatti dovrebbe contenere un contatto.
    }


    /**
     * Test of modifyContact method, of class Rubric.
     */
    @Test
    public void testModifyContact() {
        System.out.println("modifyContact");
        this.setUp();
        Contact contact = new Contact("Fabiano", "Amendola", new Number("123456789"), new Mail("fabiano.amendola@mail.com"));
        rubric.addContact(contact);

        boolean modified = rubric.modifyContact(contact, "Nello", "Del Mauro", new Number("987654321"), new Mail("nello.delmauro@mail.com"), true);

        assertTrue(modified); // Il contatto dovrebbe essere modificato con successo.
        assertEquals("Nello", contact.getName()); // Il nome dovrebbe essere aggiornato.
        assertEquals("Del Mauro", contact.getSurname()); // Il cognome dovrebbe essere aggiornato.
        assertEquals("987654321", contact.getNumbers().getNumber1()); // Il numero dovrebbe essere aggiornato.
        assertEquals("nello.delmauro@mail.com", contact.getMails().getMail1()); // L'email dovrebbe essere aggiornata.
        assertTrue(contact.isFavourite()); // Lo stato di preferito dovrebbe essere aggiornato.
    }

    /**
     * Test of removeContact method, of class Rubric.
     */
    @Test
    public void testRemoveContact() {
        System.out.println("removeContact");
        this.setUp();
         rubric.addContact(contact);

        boolean removed = rubric.removeContact(contact);
        assertTrue(removed); // Il contatto è stato rimosso con successo.
        assertTrue(rubric.getContacts().isEmpty()); // La lista dei contatti dovrebbe essere vuota dopo la rimozione.
    }

    

    /**
     * Test of contactIsFavourite method, of class Rubric.
     */
    @Test
    public void testContactIsFavourite() {
        System.out.println("contactIsFavourite");
        this.setUp();
         rubric.addContact(contact);

        rubric.contactIsFavourite(contact);
        assertTrue(contact.isFavourite()); // Il contatto dovrebbe essere marcato come preferito.

    }

    /**
     * Test of searchContact method, of class Rubric.
     */
    @Test
    public void testSearchContact() {
        System.out.println("searchContact");
        Rubric rubrics = new Rubric();
        Contact contact1 = new Contact("Andrea", "Del Mauro", new Number("123456789"), new Mail("andrea.delmauro@mail.com"));
        Contact contact3 = new Contact("Benedetta", "Amendola", new Number("987654321"), new Mail("benedetta.amendola@mail.com"));
        rubrics.addContact(contact1);
        rubrics.addContact(contact3);

        Rubric result = rubrics.searchContact("Andrea");
        assertEquals(1, result.getContacts().size()); // La ricerca dovrebbe restituire un contatto.
        assertEquals(contact1, result.getContacts().get(0)); // Il contatto restituito dovrebbe corrispondere alla query di ricerca.
    }

    

    /**
     * Test of importContacts method, of class Rubric.
     */
    @Test
    public void testImportContacts() {
        System.out.println("importContacts");
        this.setUp();
        String testFileName = "contatti_test.csv";
        // Si assume che esista un file valido con dati appropriati
        Rubric imported = rubric.importContacts(testFileName);
        assertNotNull(imported); // La rubrica importata non dovrebbe essere null.
        assertFalse(imported.getContacts().isEmpty()); // La rubrica importata dovrebbe contenere contatti.
    }

    /**
     * Test of exportContacts method, of class Rubric.
     */
    @Test
    public void testExportContacts() {
        System.out.println("exportContacts");
        this.setUp();
        rubric.addContact(contact);

        String testFileName = "esporta_contatti_test.csv";
        rubric.exportContacts(testFileName);
    }

    /**
     * Test of toString method, of class Rubric.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        this.setUp();
        Contact contact3 = new Contact("Fabiano", "Amendola", new Number("123456789"), new Mail("fabiano.amendola@mail.com"));
        rubric.addContact(contact3);
        String result = rubric.toString();
        assertTrue(result.contains("Fabiano")); // La rappresentazione in stringa dovrebbe includere il nome del contatto.
        assertTrue(result.contains("Amendola")); // La rappresentazione in stringa dovrebbe includere il cognome del contatto.
        assertTrue(result.contains("123456789")); // La rappresentazione in stringa dovrebbe includere il numero del contatto.
        assertTrue(result.contains("fabiano.amendola@mail.com")); // La rappresentazione in stringa dovrebbe includere l'email del contatto.

    }
    
}
