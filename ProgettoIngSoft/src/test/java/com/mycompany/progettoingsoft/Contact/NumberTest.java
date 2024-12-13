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
    
    public NumberTest() {
    }
    
    @BeforeEach
    public void setUp(){
        numbers = new Number( num1, num2, num3 );
    }

    /**
     * Test del metodo setNumber1, della classe Number.
     */
    @Test
    public void testSetNumber1() {
        this.setUp();
        System.out.println("setNumber1");
        assertEquals(num1, numbers.getNumber1());
    }

    /**
     * Test del metodo setNumber2, della classe Number.
     */
    @Test
    public void testSetNumber2() {
        this.setUp();
        System.out.println("setNumber2");
        assertEquals(num2, numbers.getNumber2());
    }

    /**
     * Test del metodo setNumber3, della classe Number.
     */
    @Test
    public void testSetNumber3() {
        this.setUp();
        System.out.println("setNumber3");
        assertEquals(num3, numbers.getNumber3());
    }

    /**
     *Test del metodo getNumbers, della classe Number.
     */
    @Test
    public void testGetNumbers() {
        this.setUp();
        System.out.println("getNumbers");
        String expResult = num1 + " " + num2 + " " + num3;
        assertEquals(expResult, numbers.getNumbers());
    }

    /**
     * Test del metodo getNumber1, della classe Number.
     */
    @Test
    public void testGetNumber1() {
        this.setUp();
        System.out.println("getNumber1");
        assertEquals(num1, numbers.getNumber1());
    }

    /**
     * Test del metodo getNumber2, della classe Number.
     */
    @Test
    public void testGetNumber2() {
        this.setUp();
        System.out.println("getNumber2");
        assertEquals(num2, numbers.getNumber2());
    }

    /**
     * Test del metodo getNumber3, della classe Number.
     */
    @Test
    public void testGetNumber3() {
        this.setUp();
        System.out.println("getNumber3");
        assertEquals(num3, numbers.getNumber3());
    }

    /**
     * Test del metodo toString, della classe Number.
     */
    @Test
    public void testToString() {
        this.setUp();
        System.out.println("toString");
        String expResult = num1 + ", " + num2 + ", " + num3 + ", ";
        assertEquals(expResult, numbers.toString());
    }
}
