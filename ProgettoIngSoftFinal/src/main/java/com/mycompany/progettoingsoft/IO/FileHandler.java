/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettoingsoft.IO;

import com.mycompany.progettoingsoft.Rubric.Rubric;
import com.mycompany.progettoingsoft.Rubric.Rubric;

/**
 * @file FileHandler.java
 * @brief questo file contiene un'interfaccia che gestisce le funzionalità "importContacts" e "exportContacts"
 * 
 * L'utilizzo di un'interfaccia per queste funzionalità permette di evitare dipendenze tra le classi.
 * 
 * @author Benedetta
 */
public interface FileHandler {
    /**
     * @brief Permette di importare nella rubrica un insieme di contatti.
     * @param filename 
     * @return la Rubric importata
     */
    public abstract Rubric importContacts(String filename);
    /**
     * @brief Permette di esportare la rubrica in un file esterno.
     * @param filename
     */
    public abstract void exportContacts(String filename);
}
