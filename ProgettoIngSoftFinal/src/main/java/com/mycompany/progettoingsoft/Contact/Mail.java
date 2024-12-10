/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

import java.io.Serializable;

/**
 * @file Mail.java
 * @brief Questo file gestisce le mail.
 * 
 * Permette di fare la set e la get delle mails organizzati 
 * in un array di stringhe che può contenere al massimo 3 oggetti e di inizializzare.
 * 
 * @author fabianoamendola
 */
public class Mail implements Serializable{
    private String[] mails = new String[3];
    
    /**
     * @brief Costruttore della classe Mail con tre mail.
     * 
     * Inizializza le mail con le 3 stringhe che riceve come parametri in ingresso.
     * Ogni mail viene impostata separatamente.
     * See also: setMail1(String mail1), setMail2(String mail2), setMail3(String mail3)
     * 
     * @param[in] mail1.
     * @param[in] mail2.
     * @param[in] mail3.
     * @see setMail1(String mail1)
     * @see setMail2(String mail2)
     * @see setMail3(String mail3)
     */
    public Mail (String mail1, String mail2, String mail3){
        setMail1( mail1 );
        setMail2( mail2 );  
        setMail3( mail3 );
    }
    
    /**
     * @brief Costruttore della classe Mail con due mail.
     * 
     * Inizializza le mail con le 2 stringhe che riceve come parametri in ingresso.
     * Ogni mail viene impostata separatamente.
     * See also: setMail1(String mail1), setMail2(String mail2)
     * 
     * @param[in] mail1.
     * @param[in] mail2.
     * @see setMail1(String mail1)
     * @see setMail2(String mail2)
     */
    public Mail (String mail1, String mail2){
        setMail1( mail1 );
        setMail2( mail2 ); 
    } 
    
    /**
     * @brief Costruttore della classe Mail con una mail.
     * 
     * Inizializza la mail con la stringa che riceve come parametro in ingresso.
     * Ogni mail viene impostata separatamente.
     * See also: setMail1(String mail1)
     * 
     * @param[in] mail1.
     * @see setMail1(String mail1)
     */
    public Mail (String mail1){
        setMail1( mail1 ); 
    } 
    
    /**
     * @brief Costruttore vuoto della classe Mail.
     * 
     * Questo costruttore crea un oggetto "Mail" senza inizializzare le mail.
     */
    public Mail (){}
    
    /**
     * @brief Metodo che gestisce la set della prima mail.
     * 
     * Imposta la mail passata come parametro in ingresso della funzione al primo elemento dell'array "mails".
     * Se la mail è null non viene effettuata nessuna modifica.
     * 
     * @pre Il parametro "mail1" non deve essere null.
     * @post Il primo elemento dell'array "mails" viene aggiornato con il valore di "mail1".
     * 
     * @param[in] mail1.
     */
    public void setMail1(String mail1){
        if( mail1 != null ){
            this.mails[0] = mail1;
        }
    }
    
    /**
     * @brief Metodo che gestisce la set della seconda mail.
     * 
     * Imposta la mail passata come parametro in ingresso della funzione al secondo elemento dell'array "mails".
     * Se la mail è null non viene effettuata nessuna modifica.
     * 
     * @pre Il parametro "mail2" non deve essere null.
     * @post Il secondo elemento dell'array "mails" viene aggiornato con il valore di "mail2".
     * 
     * @param[in] mail2.
     */
    public void setMail2(String mail2){
        if( mail2 != null ){
            this.mails[1] = mail2;
        }
    }
    
    /**
     * @brief Metodo che gestisce la set della terza mail.
     * 
     * Imposta la mail passata come parametro in ingresso della funzione al terzo elemento dell'array "mails".
     * Se la mail è null non viene effettuata nessuna modifica.
     * 
     * @pre Il parametro "mail3" non deve essere null.
     * @post Il terzo elemento dell'array "mails" viene aggiornato con il valore di "mail3".
     * 
     * @param[in] mail3.
     */
    public void setMail3(String mail3){
        if( mail3 != null ){
            this.mails[3] = mail3;
        }
    }
    
    /**
     * @brief Metodo che aggiunge una mail all'array contenente le mails.
     * 
     * @pre La variabile "mails" non deve essere null.
     * @post La stringa "mails" viene aggiunta all'array.
     *
     * @param[in] mail.
     */
    public void addMail(String mail){
        if (mail != null){
            for (int i=0; i<mails.length; i++){
                if(mails[i] == null){
                    mails[i] = mail;
                }
            }
        }
    }
    
    /**
     * @brief Restituisce tutte le mail associate al contatto.
     * 
     * Questo metodo recupera le mail associate al contatto, concatenate in una sola stringa e separate da uno spazio.
     * 
     * @pre Le mail devono essere inizializzate correttamente.
     * @post Viene restituita una stringa contenente le mail separate da uno spazion.
     * 
     * @return Una stringa contenente le mail del contatto, separate da uno spazio.
     */
    public String getMails() {
        return getMail1() + " " + getMail2() + " " + getMail3();
    }
    
    /**
     * @brief Metodo che gestisce la get dela prima mail.
     * 
     * Accede al valore del primo elemento dell' attributo privato "mails".
     * 
     * @pre Il parametro "mails" è stato inizializzato correttamente.
     * @post Viene restituito il valore del primo elemento dell'array "mails", l'array di stringhe non viene modificato.
     * 
     * @return La prima mail.
     */
    public String getMail1() {
        return mails[0];
    }
    
    /**
     * @brief Metodo che gestisce la get dela seconda mail.
     * 
     * Accede al valore del secondo elemento dell' attributo privato "mails".
     * 
     * @pre Il parametro "mails" è stato inizializzato correttamente.
     * @post Viene restituito il valore del secondo elemento dell'array "mails", l'array di stringhe non viene modificato.
     * 
     * @return La seconda mail.
     */
    public String getMail2() {
        return mails[1];
    }
    
    /**
     * @brief Metodo che gestisce la get dela terza mail.
     * 
     * Accede al valore del terzo elemento dell' attributo privato "mails".
     * 
     * @pre Il parametro "mails" è stato inizializzato correttamente.
     * @post Viene restituito il valore del terzo elemento dell'array "mails", l'array di stringhe non viene modificato.
     * 
     * @return La terza mail.
     */
    public String getMail3() {
        return mails[2];
    }
    
    @Override 
    public String toString(){
        StringBuffer sb = new StringBuffer ();
        for (int i=0; i<mails.length; i++){
            sb.append(mails[i] + ", ");
        }
        return sb.toString();
    }
}
