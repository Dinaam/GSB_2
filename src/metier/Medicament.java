/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;

/**
 *
 * @author Dinam
 */
public class Medicament {
    private String code;
    private String nom;
    private String composition;
    private String effets; 
    private String contreIndic;
    private Float prix;
    private Famille uneFamille;

    public Medicament() {
    }

    public Medicament(String code, String nom, String composition, String effets, String contreIndic, Float prix, Famille uneFamille) {
        this.code = code;
        this.nom = nom;
        this.composition = composition;
        this.effets = effets;
        this.contreIndic = contreIndic;
        this.prix = prix;
        this.uneFamille = uneFamille;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getEffets() {
        return effets;
    }

    public void setEffets(String effets) {
        this.effets = effets;
    }

    public String getContreIndic() {
        return contreIndic;
    }

    public void setContreIndic(String contreIndic) {
        this.contreIndic = contreIndic;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Famille getUneFamille() {
        return uneFamille;
    }

    public void setUneFamille(Famille uneFamille) {
        this.uneFamille = uneFamille;
    }

    @Override
    public String toString() {
        return  nom ;
    }

    
    
    
}

