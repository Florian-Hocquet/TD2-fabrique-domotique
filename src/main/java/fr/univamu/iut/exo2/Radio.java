package fr.univamu.iut.exo2;

public class Radio extends Connectable {

    public Radio(String nom) {
        this.nom = nom;
    }

    public static void equiper(String gadget) {
        System.out.println("On équipe la cafetière de" + gadget);
    }
}