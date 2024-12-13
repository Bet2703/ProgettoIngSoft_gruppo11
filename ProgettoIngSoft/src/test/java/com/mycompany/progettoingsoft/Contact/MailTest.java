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
 * @author fabianoamendola
 */
public class MailTest { 
    private String mail1 = "fabiano.dellorusso@mail.com"; 
    private String mail2 = "aniello.dilieto@mail.com"; 
    private String mail3 = "andrea.amendola@mail.com"; 
    private Mail mails; 
    private Mail mailsSet;
     
    public MailTest() { 
    } 
    
    @BeforeEach 
    public void setUp(){ 
        mails = new Mail(mail1, mail2, mail3); 
        mailsSet = new Mail ();
    } 

    /**
     * Test of setMail1 method, of class Mail.
     */
     @Test 
    public void testSetMail1() { 
        this.setUp(); 
        System.out.println("setMail1"); 
        mailsSet.setMail1(mail1); 
        assertEquals(mail1, mailsSet.getMail1()); 
    } 

    /**
     * Test of setMail2 method, of class Mail.
     */
    @Test 
    public void testSetMail2() { 
        this.setUp(); 
        System.out.println("setMail2"); 
        mailsSet.setMail2(mail2); 
        assertEquals(mail2, mailsSet.getMail2()); 
    } 

    /**
     * Test of setMail3 method, of class Mail.
     */
   @Test 
    public void testSetMail3() { 
        this.setUp(); 
        System.out.println("setMail3"); 
        mailsSet.setMail3(mail3); 
        assertEquals(mail3, mailsSet.getMail3()); 
    } 

    /**
     * Test of getMails method, of class Mail.
     */
    @Test 
    public void testGetMails() { 
        this.setUp(); 
        System.out.println("getMails"); 
        String expResult = mail1 + " " + mail2 + " " + mail3; 
        assertEquals(expResult, mails.getMails()); 
    } 
    /**
     * Test of getMail1 method, of class Mail.
     */
    @Test 
    public void testGetMail1() { 
        this.setUp(); 
        System.out.println("getMail1"); 
        assertEquals(mail1, mails.getMail1()); 
    } 

    /**
     * Test of getMail2 method, of class Mail.
     */
    @Test 
    public void testGetMail2() { 
        this.setUp(); 
        System.out.println("getMail2"); 
        assertEquals(mail2, mails.getMail2()); 
    } 

    /**
     * Test of getMail3 method, of class Mail.
     */
    @Test 
    public void testGetMail3() { 
        this.setUp(); 
        System.out.println("getMail3"); 
        assertEquals(mail3, mails.getMail3()); 
    } 

    /**
     * Test of toString method, of class Mail.
     */
    @Test 
    public void testToString() { 
        this.setUp(); 
        System.out.println("toString"); 
        String expResult = mail1 + ", " + mail2 + ", " + mail3 + ", "; 
        assertEquals(expResult, mails.toString()); 
    } 
    
}
