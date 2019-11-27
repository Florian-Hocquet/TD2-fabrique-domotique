package fr.univamu.iut.exo2;

public class Cafetiere extends Connectable {

    public Cafetiere(String nom) {
        this.nom = nom;
    }

    public static void equiper(String gadget) {
        System.out.println("On équipe la cafetière de" + gadget);
    }
}