/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Dinam
 */
public class Famille {
    private String famCode;
    private String libelle;

    public Famille() {
    }

    public Famille(String famCode, String libelle) {
        this.famCode = famCode;
        this.libelle = libelle;
    }

    public String getFamCode() {
        return famCode;
    }

    public void setFamCode(String famCode) {
        this.famCode = famCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Famille{" + "famCode=" + famCode + ", libelle=" + libelle + '}';
    }
    
    
}
