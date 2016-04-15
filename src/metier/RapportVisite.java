/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Date;

/**
 *
 * @author Maxime
 */
public class RapportVisite
{
    
    Visiteur unVisiteur;
    int numRap;
    Praticien unPraticien;
    Date date;
    String motif;
    
    public RapportVisite(Visiteur unVisiteur, int numRap, Praticien unPraticien, Date date, String motif)
    {
        this.unVisiteur = unVisiteur;
        this.numRap = numRap;
        this.unPraticien = unPraticien;
        this.date = date;
        this.motif = motif;
    }
    
   
    
    public int getNumRap()
    {
        return numRap;
    }
    
   
    
    public Date getDate()
    {
        return date;
    }
    
    public String getMotif()
    {
        return motif;
    }

    public Visiteur getUnVisiteur() {
        return unVisiteur;
    }

    public void setUnVisiteur(Visiteur unVisiteur) {
        this.unVisiteur = unVisiteur;
    }

    public Praticien getUnPraticien() {
        return unPraticien;
    }

    public void setUnPraticien(Praticien unPraticien) {
        this.unPraticien = unPraticien;
    }
    
   
    
    public void setNumRap(int numRap)
    {
        this.numRap = numRap;
    }
    
   
    
    public void setMotif(String motif) 
    {
        this.motif = motif;
    }
    
}
