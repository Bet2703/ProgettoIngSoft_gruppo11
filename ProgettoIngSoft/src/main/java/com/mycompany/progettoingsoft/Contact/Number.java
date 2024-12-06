/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

/**
 * @file Number.java
 * @brief Questo file gestissce i numeri di telefono.
 * 
 * Permette di inizializzare, fare la set e la get dei numeri di telefono 
 * organizzati in un array di stringhe che può contenere massimo 3 oggetti. 
 * 
 * @author Aniello
 */
public class Number {
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
        
    }

    @Override
    public String toString() {
        
    }
}
