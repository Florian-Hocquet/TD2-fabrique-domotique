package fr.univamu.iut.exo2;

public class Radiateur extends Connectable {

    public Radiateur(String nom) {
        this.nom = nom;
    }

    public static void equiper(String gadget) {
        System.out.println("On équipe la radiateur de" + gadget);
    }
}