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
public class Mail {
    private String[] mails = new String[3];
    
    public Mail(String mail1, String mail2, String mail3){
        setMails(new String[]{mail1, mail2, mail3});
    }
    
    //Overload del costruttore
    public Mail(String mail1, String mail2){
        setMails(new String[]{mail1, mail2});
    }    
    
    public Mail(String mail1){
        setMails(new String[]{mail1});
    }
    public Mail (){}
    
    public void setMails(String[] mails){
        
    }
    
    public void addMail(String mail){
        
    }
    
    public String[] getMails() {
    }
    
    @Override 
    public String toString(){
    }
}
