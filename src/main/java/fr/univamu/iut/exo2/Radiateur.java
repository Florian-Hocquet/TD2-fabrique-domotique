package fr.univamu.iut.exo2;

class Radiateur implements Connectable {

    String nom;

    public Radiateur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public  void equiper(String gadget) {
        System.out.println("On équipe la radiateur de" + gadget);
    }
}