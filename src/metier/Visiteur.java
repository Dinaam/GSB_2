
package metier;

import java.util.Date;


public class Visiteur {
    private String matricule;
    private String nom;
    private String prenom;
    private String adresse; 
    private String cp;
    private String ville;
    private Date date;
    private Secteur secteur;
    private Labo labo;

    

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getCp() {
        return cp;
    }

    public String getVille() {
        return ville;
    }

    public Date getDate() {
        return date;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public void setLabo(Labo labo) {
        this.labo = labo;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }

    public Labo getLabo() {
        return labo;
    }

    public Visiteur(String matricule, String nom, String prenom, String adresse, String cp, String ville, Date date, Secteur secteur, Labo labo) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.date = date;
        this.secteur = secteur;
        this.labo = labo;
    }
    
}
