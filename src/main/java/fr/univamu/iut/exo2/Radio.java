package fr.univamu.iut.exo2;

class Radio implements Connectable {

    String nom;

    public Radio(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public  void equiper(String gadget) {
        System.out.println("On équipe la radio de" + gadget);
    }
}