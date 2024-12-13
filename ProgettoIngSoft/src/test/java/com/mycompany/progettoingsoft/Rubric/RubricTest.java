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
        rubric.addContact(contact);

        boolean modified = rubric.modifyContact(contact, "Nello", "Del Mauro", new Number("987654321"), new Mail("nello.delmauro@mail.com"), true);

        assertTrue(modified); // Il contatto dovrebbe essere modificato con successo.
        assertEquals("Nello", contact.getName()); // Il nome dovrebbe essere aggiornato.
        assertEquals("Del Mauro", contact.getSurname()); // Il cognome dovrebbe essere aggiornato.
        assertEquals("987654321", contact.getNumbers()); // Il numero dovrebbe essere aggiornato.
        assertEquals("nello.delmauro@mail.com", contact.getMails()); // L'email dovrebbe essere aggiornata.
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
        Contact c = null;
        Rubric instance = new Rubric();
        instance.contactIsFavourite(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchContact method, of class Rubric.
     */
    @Test
    public void testSearchContact() {
        System.out.println("searchContact");
        String s = "";
        Rubric instance = new Rubric();
        Rubric expResult = null;
        Rubric result = instance.searchContact(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importContacts method, of class Rubric.
     */
    @Test
    public void testImportContacts() {
        System.out.println("importContacts");
        String filename = "";
        Rubric instance = new Rubric();
        Rubric expResult = null;
        Rubric result = instance.importContacts(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportContacts method, of class Rubric.
     */
    @Test
    public void testExportContacts() {
        System.out.println("exportContacts");
        String filename = "";
        Rubric instance = new Rubric();
        instance.exportContacts(filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rubric.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rubric instance = new Rubric();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
