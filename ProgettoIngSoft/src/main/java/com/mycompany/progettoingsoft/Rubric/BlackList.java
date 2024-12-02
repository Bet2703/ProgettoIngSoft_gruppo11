/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.Rubric;

import com.mycompany.progettoingsoft.Rubric.Rubric;
import com.mycompany.progettoingsoft.Contact.Contact;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Benedetta
 */
public class BlackList extends Rubric {
    private Set<Contact> blackList;
    
    public BlackList (){
        this.blackList = new TreeSet<>();
    }
    
    public BlackList showBlackList(){
        
    }
    
    @Override
    public boolean removeContact( Contact c ){
                  
    }
}
