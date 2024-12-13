/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Benedetta
 */
public class ContactTest {
    private Number numbers;
    private Mail mails;
    private Contact contact1;
    private Contact contact2;
   
    public ContactTest() {
    }

    @BeforeEach
    public void setUp() {
        numbers = new Number("1357924680", "2468013579");
        mails = new Mail("aniello.dilieto@mail.com", "benedetta.delmauro@mail.com");
        contact1 = new Contact("Aniello", "Di Lieto", numbers, mails);
    }
    
    
    /**
     * Test of setName method, of class Contact.
     */
    @Test
    public void testSetName() {
        this.setUp();
        System.out.println("setName");
        String name = "Fabiano";
        contact1.setName(name);
        assertEquals(name, contact1.getName());
    }

    /**
     * Test of setSurname method, of class Contact.
     */
    @Test
    public void testSetSurname() {
        this.setUp();
        System.out.println("setSurname");
        String surname = "Del Mauro";
        contact1.setSurname(surname);
        assertEquals(surname, contact1.getSurname());
    }

    /**
     * Test of setFavourite method, of class Contact.
     */
    @Test
    public void testSetFavourite() {
        this.setUp();
        System.out.println("setFavourite");
        boolean favourite = true;
        contact1.setFavourite(favourite);
        assertTrue(contact1.isFavourite());
        
        favourite = false;
        contact1.setFavourite(favourite);
        assertFalse(contact1.isFavourite());
    }

    /**
     * Test of getName method, of class Contact.
     */
    @Test
    public void testGetName() {
        this.setUp();
        System.out.println("getName");
        String expResult = "Aniello";
        String result = contact1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSurname method, of class Contact.
     */
    @Test
    public void testGetSurname() {
        this.setUp();
        System.out.println("getSurname");
        String expResult = "Di Lieto";
        String result = contact1.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of isFavourite method, of class Contact.
     */
    @Test
    public void testIsFavourite() {
        this.setUp();
        System.out.println("isFavourite");
        boolean expResult = false;
        boolean result = contact1.isFavourite();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumbers method, of class Contact.
     */
    @Test
    public void testSetNumbers() {
        this.setUp();
        System.out.println("setNumbers");
        contact1.setNumbers(numbers);
        assertEquals(numbers, contact1.getNumbers());
    }

    /**
     * Test of setMails method, of class Contact.
     */
    @Test
    public void testSetMails() {
        this.setUp();
        System.out.println("setMails");
        contact1.setMails(mails);
        assertEquals(mails, contact1.getMails());
    }
    
    /**
     * Test of getNumbers method, of class Contact.
     */
    @Test
    public void testGetNumbers() {
        this.setUp();
        System.out.println("getNumbers");
        Number expResult = numbers;
        Number result = contact1.getNumbers();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMails method, of class Contact.
     */
    @Test
    public void testGetMails() {
        this.setUp();
        System.out.println("getMails");
        Mail expResult = mails;
        Mail result = contact1.getMails();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Contact.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Contact contact2 = new Contact("Andrea", "Amendola", numbers, mails);
        Contact contact3 = new Contact("Benedetta", "Del Mauro", numbers, mails);
        Contact contact4 = new Contact("Fabiano", "Dello Russo", numbers, mails);
        Contact contact5 = new Contact("Fabrizio", "Di Lieto", numbers, mails);
        
        assertTrue(contact2.compareTo(contact1)<0); 
        //Andrea Amendola è alfabeticamente precendente ad Aniello Di Lieto
        
        assertTrue(contact4.compareTo(contact3)>0);
        //Fabiano Dello Russo è alfabeticamente successivo a Benedetta Del Mauro
        
        assertTrue(contact5.compareTo(contact1)>0);
        //Fabrizio Di Lieto e Aniello Di Lieto hanno lo stesso cognome.
        //Vengono ordinati secondo il nome: Fabrizio è alfabeticamente successivo a Aniello
    }

    /**
     * Test of toString method, of class Contact.
     */
    @Test
    public void testToString() {
        this.setUp();
        System.out.println("toString");
        String expResult = "Contact:  Name: Aniello Surname: Di Lieto Numbers: 1357924680, 2468013579, null,  Mails: aniello.dilieto@mail.com, benedetta.delmauro@mail.com, null,  Favourite: false";
        String result = contact1.toString();
        assertEquals(expResult, result);
    }
    
}
