/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;




public class Praticien {

    //attributs
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;
    private float coef;
    private TypePraticien typePraticien;

    //Constructeur
    public Praticien() {
    }

    public Praticien(int id, String nom, String prenom, String adresse, String cp, String ville, float coef, TypePraticien typePraticien) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.coef = coef;
        this.typePraticien = typePraticien;
    }

    @Override
    public String toString() {
        return this.getNom() + " " + this.getPrenom();
    }
    
    public String toString2() {
        return "Praticien{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", cp=" + cp + ", ville=" + ville + ", coef=" + coef + ", typePraticien=" + typePraticien.toString2() + '}';
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public TypePraticien getTypePraticien() {
        return typePraticien;
    }

    public void setTypePraticien(TypePraticien typePraticien) {
        this.typePraticien = typePraticien;
    }

}
