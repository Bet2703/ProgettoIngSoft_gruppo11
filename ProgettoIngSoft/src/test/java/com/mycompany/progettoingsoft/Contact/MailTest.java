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
public class MailTest {
    private String mail1 = "fabiano.dellorusso@mail.com";
    private String mail2 = "aniello.dilieto@mail.com";
    private String mail3 = "andrea.amendola@mail.com";
    private Mail mails;
    
    public MailTest() {
    }

    
    @BeforeEach
    public void setUp(){
        mails = new Mail(mail1, mail2, mail3);
    }
    /**
     * Test of setMail1 method, of class Mail.
     */
    @Test
    public void testSetMail1() {
        this.setUp();
        System.out.println("setMail1");
        
        mails.setMail1(mail1);
        assertEquals(mail1, mails.getMail1());
    }

    /**
     * Test of setMail2 method, of class Mail.
     */
    @Test
    public void testSetMail2() {
        this.setUp();
        System.out.println("setMail2");
        mails.setMail2(mail2);
        assertEquals(mail2, mails.getMail2());
    }

    /**
     * Test of setMail3 method, of class Mail.
     */
    @Test
    public void testSetMail3() {
        this.setUp();
        System.out.println("setMail3");
        mails.setMail3(mail3);
        assertEquals(mail3, mails.getMail3());
    }

    /**
     * Test of getMails method, of class Mail.
     */
    @Test
    public void testGetMails() {
        System.out.println("getMails");
        Mail instance = new Mail();
        String expResult = "";
        String result = instance.getMails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail1 method, of class Mail.
     */
    @Test
    public void testGetMail1() {
        System.out.println("getMail1");
        Mail instance = new Mail();
        String expResult = "";
        String result = instance.getMail1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail2 method, of class Mail.
     */
    @Test
    public void testGetMail2() {
        System.out.println("getMail2");
        Mail instance = new Mail();
        String expResult = "";
        String result = instance.getMail2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMail3 method, of class Mail.
     */
    @Test
    public void testGetMail3() {
        System.out.println("getMail3");
        Mail instance = new Mail();
        String expResult = "";
        String result = instance.getMail3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Mail.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mail instance = new Mail();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
