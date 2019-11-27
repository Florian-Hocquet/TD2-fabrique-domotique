package fr.univamu.iut.exo3;

public abstract class Imprimante {

    String nom;

    public Imprimante(String nom) {
        this.nom = nom;
    }

    public Imprimante() {}

    public void imprimer() {
        System.out.println("Je suis une imprimante normale");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
