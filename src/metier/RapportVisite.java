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
    
    String matricule;
    int numRap;
    int numPra;
    Date date;
    String motif;
    
    public RapportVisite(String matricule, int numRap, int numPra, Date date, String motif)
    {
        this.matricule = matricule;
        this.numRap = numRap;
        this.numPra = numPra;
        this.date = date;
        this.motif = motif;
    }
    
    public String getMatricule()
    {
        return matricule;
    }
    
    public int getNumRap()
    {
        return numRap;
    }
    
    public int getNumPra()
    {
        return numPra;
    }
    
    public Date getDate()
    {
        return date;
    }
    
    public String getMotif()
    {
        return motif;
    }
    
    public void setMatricule(String matricule)
    {
        this.matricule = matricule;
    }
    
    public void setNumRap(int numRap)
    {
        this.numRap = numRap;
    }
    
    public void setNumPra(int numPra)
    {
        this.numPra = numPra;
    }
    
    public void setMotif(String motif) 
    {
        this.motif = motif;
    }
    
}
