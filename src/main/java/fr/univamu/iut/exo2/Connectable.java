package fr.univamu.iut.exo2;

public abstract class Connectable {

    String nom;

    public Connectable(String nom) {
        this.nom = nom;
    }

    public Connectable() {}

    public static void equiper(String gadget) {
        System.out.println("l objet connectable est équipé de : " + gadget);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
