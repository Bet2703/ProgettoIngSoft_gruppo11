/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

/**
 * @file Mail.java
 * @brief Questo file gestisce le mail.
 * 
 * Permette di fare la set e la get delle mails organizzati 
 * in un array di stringhe che può contenere al massimo 3 oggetti e di inizializzare.
 * 
 * @author fabianoamendola
 */
public class Mail {
    private String[] mails = new String[3];
    
    /**
     * @brief Costruttore della classe Mail.
     * 
     * Inizializza le mail con le 3 stringhe che riceve come parametri in input.
     * See also: setMails (String [] mails)
     * 
     * @param[in] mail1.
     * @param[in] mail2.
     * @param[in] mail3.
     * @see setMails (String [] mails)
     */
    public Mail(String mail1, String mail2, String mail3){
        setMails(new String[]{mail1, mail2, mail3});
    }
    
    /**
     * @brief Overload del costruttore.
     * 
     * Inizializza le mails con le 2 strignhe che riceve come parametri in input.
     * See also: setMails (String [] mails)
     * 
     * @param[in] mail1.
     * @param[in] mail2. 
     * @see setMails (String [] mails)
     */
    public Mail(String mail1, String mail2){
        setMails(new String[]{mail1, mail2});
    }    
    
    /**
     * @brief Overload del costruttore.
     * 
     * Inizializza la mail con la stringa che riceve come parametro in input.
     * See also: setMails (String [] mails)
     * 
     * @param[in] mail1. 
     * @see setMails (String [] mails)
     */
    public Mail(String mail1){
        setMails(new String[]{mail1});
    }
    public Mail (){}
    
    /**
     * @brief Metodo che gestisce la set delle mail.
     * 
     * @pre Il parametro "mails" non deve essere null.
     * @post La variabile "mails" viene aggiornata con l'array passato come parametro in input.
     * 
     * @param[inout] mails.
     */
    public void setMails(String[] mails){
        if (mails !=null){
            for (int i=0; i<mails.length; i++){
                this.mails[i] = mails[i];
            }
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
     * @brief Metodo che gestisce la get delle mails.
     * 
     * Accede al valore dell'attributo privato mails.
     * 
     * @pre il parametro "mails" è stato inizializzato in modo corretto.
     * @post viene restituito il valore di "mails", l'array di stringhe non viene modificato.
     * 
     * @return Array di stringhe contenente le mails.
     */
    public String[] getMails() {
        return mails;
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
