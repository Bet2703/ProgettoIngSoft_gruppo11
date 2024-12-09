/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

import java.io.Serializable;

/**
 * @file Number.java
 * @brief Questo file gestissce i numeri di telefono.
 * 
 * Permette di inizializzare, fare la set e la get dei numeri di telefono 
 * organizzati in un array di stringhe che può contenere massimo 3 oggetti. 
 * 
 * @author Aniello
 */
public class Number implements Serializable {
    private String[] numbers = new String[3];
    
    
    /**
     * @brief Costruttore della classe Number.
     * 
     * Inizializza i numeri di telefono con le 3 stringhe che riceve come parametri in ingresso.
     * See also: setNumbers(String[] numbers)
     * Inizializza i numeri di telefono con le 3 stringhe che riceve come parametri di ingresso.
     * See also: setNumbers(String[] numbers).
     * 
     * @param[in] num1.
     * @param[in] num2.
     * @param[in] num3.
     * @see setNumbers(String[] numbers)
     */
    public Number (String num1, String num2, String num3){
        setNumbers(new String[]{num1, num2, num3});        
    }
    
    /**
     * @brief Overload del costruttore.
     * 
     * Inizializza i numeri di telefono con le 2 stringhe che riceve come parametri in ingresso.
     * See also: setNumbers(String[] numbers)
     * 
     * @param[in] num1.
     * @param[in] num2.
     * @see setNumbers(String[] numbers)
     */
    public Number (String num1, String num2){
        setNumbers(new String[]{num1, num2});        
    }
    
    /**
     * @brief Overload del costruttore.
     * 
     * Inizializza il numero con la stringa che riceve come parametro in ingresso.
     * See also: setNumbers(String[] numbers)
     * 
     * @param[in] num1. 
     * @see setNumbers(String[] numbers)
     */
    public Number (String num1){
        setNumbers(new String[]{num1});        
    }
    public Number(){}
    
    /**
     * @brief Metodo che gestisce la set dei numeri di telefono.
     * 
     * @pre Il parametro "numbers" non deve essere null.
     * @post la variabile "numbers" viene aggiornata con l'array passato come parametro di ingresso.
     * 
     * @param[inout] numbers.
     */
    public void setNumbers(String[] numbers){
        if( numbers != null ){
            for( int i=0; i<numbers.length; i++ ){
                this.numbers [i]= numbers[i];
            }
        }
    }
    
    /**
     * @brief Metodo che aggiunge un numero di telefono all'array contenente i numeri di telefono.
     * 
     * @pre la variabile "number" non deve essere null.
     * @post La stringa "number" viene aggiunta all' array.
     * 
     * @param[in] number. 
     */
    public void addNumber(String number){
        if( number != null ){
            for( int i=0; i<numbers.length; i++){
                if( numbers[i] == null ){
                    numbers[i] = number;
                }
            }
        }
    }
    
    /**
     * @brief Metodo che gestisce la get dei numeri di telefono.
     * 
     * Accede al valore dell' attributo privato numbers.
     * 
     * @pre il parametro "numbers" è stato inizializzato correttamente.
     * @post viene restituito il valore di "numbers", l'array di stringhe non viene modificato.
     * 
     * @return Array di stringhe contenente i numeri di telefono.
     */
    public String[] getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for( int i=0; i<numbers.length; i++ ){
            sb.append( numbers[i] + ", " );
        }
        return sb.toString();
    }
}
