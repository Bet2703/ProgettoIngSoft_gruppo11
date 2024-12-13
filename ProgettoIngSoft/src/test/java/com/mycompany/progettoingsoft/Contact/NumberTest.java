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
 * @author Aniello
 */
public class NumberTest {
    
    private String num1 = "1234567890";
    private String num2 = "0987654321";
    private String num3 = "3336669990";
    private Number numbers;
    private Number numbersSet;
    
    public NumberTest() {
    }
    
    @BeforeEach
    public void setUp(){
        numbers = new Number( num1, num2, num3 );
        numbersSet = new Number();
    }

    /**
     * Test of setNumber1 method, of class Number.
     */
    @Test
    public void testSetNumber1() {
        this.setUp();
        System.out.println("setNumber1");
        numbersSet.setNumber1(num1);
        assertEquals(num1, numbersSet.getNumber1());
    }

    /**
     * Test of setNumber2 method, of class Number.
     */
    @Test
    public void testSetNumber2() {
        this.setUp();
        System.out.println("setNumber2");
        numbersSet.setNumber2(num2);
        assertEquals(num2, numbersSet.getNumber2());
    }


    /**
     * Test of setNumber3 method, of class Number.
     */
    @Test
    public void testSetNumber3() {
        this.setUp();
        System.out.println("setNumber3");
        numbersSet.setNumber3(num3);
        assertEquals(num3, numbersSet.getNumber3());
    }

    /**
     * Test of getNumbers method, of class Number.
     */
    @Test
    public void testGetNumbers() {
        this.setUp();
        System.out.println("getNumbers");
        String expResult = num1 + " " + num2 + " " + num3;
        assertEquals(expResult, numbers.getNumbers());
    }

    /**
     * Test of getNumber1 method, of class Number.
     */
    @Test
    public void testGetNumber1() {
        this.setUp();
        System.out.println("getNumber1");
        assertEquals(num1, numbers.getNumber1());
    }

    /**
     * Test of getNumber2 method, of class Number.
     */
    @Test
    public void testGetNumber2() {
        this.setUp();
        System.out.println("getNumber2");
        assertEquals(num2, numbers.getNumber2());
    }

    /**
     * Test of getNumber3 method, of class Number.
     */
    @Test
    public void testGetNumber3() {
        this.setUp();
        System.out.println("getNumber3");
        assertEquals(num3, numbers.getNumber3());
    }

    /**
     * Test of toString method, of class Number.
     */
    @Test
    public void testToString() {
        this.setUp();
        System.out.println("toString");
        String expResult = num1 + ", " + num2 + ", " + num3 + ", ";
        assertEquals(expResult, numbers.toString());
    }
    
}
