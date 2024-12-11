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
     * @brief Costruttore della classe Number con tre numeri di telefono.
     * 
     * Inizializza i numeri di telefono con le 3 stringhe che riceve come parametri in ingresso.
     * Ogni numero viene impostato separatamente.
     * See also: setNumber1(String num1), setNumber2(String num 2), setNumber3(String num3)
     * 
     * @param[in] num1.
     * @param[in] num2.
     * @param[in] num3.
     * @see setNumber1(String num1)
     * @see setNumber2(String num2)
     * @see setNumber3(String num3)
     */
    public Number (String num1, String num2, String num3){
        setNumber1( num1);
        setNumber2( num2 );  
        setNumber3( num3);
    }
    
    /**
     * @brief Costruttore della classe Number con due numeri di telefono.
     * 
     * Inizializza i numeri di telefono con le 2 stringhe che riceve come parametri in ingresso.
     * Ogni numero viene impostato separatamente.
     * See also: setNumber1(String num1), setNumber2(String num 2)
     * 
     * @param[in] num1.
     * @param[in] num2.
     * @see setNumber1(String num1)
     * @see setNumber2(String num2)
     */
    public Number (String num1, String num2){
        setNumber1( num1);
        setNumber2( num2 );        
    }
    
    /**
     * @brief Costruttore della classe Number con un numero di telefono.
     * 
     * Inizializza il numero di telefono con la stringa che riceve com eparametro in ingresso.
     * Ogni numero viene impostato separatamente.
     * See also: setNumber1(String num1)
     * 
     * @param[in] num1.
     * @see setNumber1(String num1)
     */
    public Number (String num1){
        setNumber1( num1 );        
    }
    
    /**
     * @brief Costruttore vuoto della classe Number
     * 
     * Questo costruttore crea un oggetto "Number" senza inizializzare i numeri di telefono.
     */
    public Number(){}
    
    /**
     * @brief Metodo che gestisce la set del primo numero di telefono.
     * 
     * Imposta il numero di telefono passato come parametro della funzione al primo elemento dell'array "numbers".
     * Se il numero è null non viene effettuata nessuna modifica.
     * 
     * @pre Il parametro "num1" non deve essere null.
     * @post Il primo elemento dell'array "numbers" viene aggiornato con il valore di "num1".
     * 
     * @param[in] num1.
     */
    public void setNumber1(String num1){
        if( num1 != null ){
            this.numbers[0] = num1;
        }
    }
    
    /**
     * @brief Metodo che gestisce la set del secondo numero di telefono.
     * 
     * Imposta il numero di telefono passato come parametro della funzione al secondo elemento dell'array "numbers".
     * Se il numero è null non viene effettuata nessuna modifica.
     * 
     * @pre Il parametro "num2" non deve essere null.
     * @post Il secondo elemento dell'array "numbers" viene aggiornato con il valore di "num2".
     * 
     * @param[in] num2.
     */
    public void setNumber2(String num2){
        if( num2 != null ){
            this.numbers[1] = num2;
        }
    }
    
    /**
     * @brief Metodo che gestisce la set del terzo numero di telefono.
     * 
     * Imposta il numero di telefono passato come parametro della funzione al terzo elemento dell'array "numbers".
     * Se il numero è null non viene effettuata nessuna modifica.
     * 
     * @pre Il parametro "num3" non deve essere null.
     * @post Il terzo elemento dell'array "numbers" viene aggiornato con il valore di "num3".
     * 
     * @param[in] num2.
     */
    public void setNumber3(String num3){
        if( num3 != null ){
            this.numbers[2] = num3;
        }
    }
    
    /**
     * @brief Metodo che aggiunge un numero di telefono all'array contenente i numeri di telefono.
     * 
     * @pre La variabile "number" non deve essere null.
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
     * @brief Restituisce tutti i numeri di telefono associati al contatto.
     * 
     * Questo metodo recupera i numeri di telefono al contatto, concatenati in una sola stringa e separati da uno spazio.
     * 
     * @pre I numeri devono essere inizializzati correttamente.
     * @post Viene restituita una stringa contenente i numeri di telefono separati da uno spazion.
     * 
     * @return Una stringa contenente i numeri di telefono del contatto, separati da uno spazio.
     */
    public String getNumbers() {
        return getNumber1() + " " + getNumber2() + " " + getNumber3();
    }
    
    /**
     * @brief Metodo che gestisce la get del primo numero di telefono.
     * 
     * Accede al valore del primo elemento dell' attributo privato "numbers".
     * 
     * @pre Il parametro "numbers" è stato inizializzato correttamente.
     * @post Viene restituito il valore del primo elemento dell'array "numbers", l'array di stringhe non viene modificato.
     * 
     * @return Il primo numero di telefono.
     */
    public String getNumber1() {
        return numbers[0];
    }
    
    /**
     * @brief Metodo che gestisce la get del secondo numero di telefono.
     * 
     * Accede al valore del secondo elemento dell' attributo privato "numbers".
     * 
     * @pre Il parametro "numbers" è stato inizializzato correttamente.
     * @post Viene restituito il valore del secondo elemento dell'array "numbers", l'array di stringhe non viene modificato.
     * 
     * @return Il secondo numero di telefono.
     */
    public String getNumber2() {
        return numbers[1];
    }
    
    /**
     * @brief Metodo che gestisce la get del terzo numero di telefono.
     * 
     * Accede al valore del terzo elemento dell' attributo privato "numbers".
     * 
     * @pre Il parametro "numbers" è stato inizializzato correttamente.
     * @post Viene restituito il valore del terzo elemento dell'array "numbers", l'array di stringhe non viene modificato.
     * 
     * @return Il terzo numero di telefono.
     */
    public String getNumber3() {
        return numbers[2];
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