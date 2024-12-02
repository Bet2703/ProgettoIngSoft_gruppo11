/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

/**
 *
 * @author Benedetta
 */
public class Number {
    private String[] numbers = new String[3];
    
    public Number (String num1, String num2, String num3){
        setNumbers(new String[]{num1, num2, num3});        
    }
    
    //Overload del costruttore
    public Number (String num1, String num2){
        setNumbers(new String[]{num1, num2});        
    }
    public Number (String num1){
        setNumbers(new String[]{num1});        
    }
    public Number(){}
    
    public void setNumbers(String[] numbers){
        
    }
    
    public String[] getNumbers() {
        
    }

    @Override
    public String toString() {
        
    }
}
