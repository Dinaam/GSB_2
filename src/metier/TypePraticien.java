/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;




public class TypePraticien {

    //attributs
   
    private String code;
    private String libelle;
    private String lieu;

    //Constructeur
    public TypePraticien() {
    }

    public TypePraticien(String code, String libelle, String lieu) {
        this.code = code;
        this.libelle = libelle;
        this.lieu = lieu;
    }
    
    @Override
    public String toString() {
        return this.getLibelle();
    }
    
    public String toString2() {
        return "TypePraticien{" + "code=" + code + ", libelle=" + libelle + ", lieu=" + lieu + '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

}
