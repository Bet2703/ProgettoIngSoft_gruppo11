/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Contact;

import com.mycompany.progettoingsoft.Contact.Mail;
import com.mycompany.progettoingsoft.Contact.Number;

/**
 *
 * @author Benedetta
 */
public class Contact implements Comparable<Contact> {
    private String name;
    private String surname;
    private Number numbers;
    private Mail mails;
    private boolean favourite;
    private boolean isDangerous;
    
    public Contact(String name, String surname, Number numbers, Mail mails){
        this.name=name;
        this.surname=surname;
        this.numbers = numbers;
        this.mails = mails;
    } 

    public void setName(String name) {
    }

    public void setSurname(String surname) {
    }

    public void setFavourite(boolean favourite) {
    }

    public void setIsDangerous(boolean isDangerous) {
    }

    public String getName() {
    }

    public String getSurname() {
    }

    public boolean isFavourite() {
    }

    public boolean isIsDangerous() {
    }    

    @Override
    public int compareTo(Contact o) {
        
    }

    @Override
    public String toString() {
    }
}
