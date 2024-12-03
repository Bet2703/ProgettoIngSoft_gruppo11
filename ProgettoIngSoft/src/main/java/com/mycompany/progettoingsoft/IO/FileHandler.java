/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.IO;

import com.mycompany.progettoingsoft.Rubric.Rubric;
import com.mycompany.progettoingsoft.Rubric.Rubric;

/**
 *
 * @author Benedetta
 */
public interface FileHandler {
    public abstract void importContacts(String filename);
    public abstract Rubric exportContacts(String filename);
}
