package fr.univamu.iut.exo1;

class Cafetiere implements Connectable {

    private String nom;

    public Cafetiere (String nom) {
        this.nom = nom;
    }


    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void equiper(String gadget) {
        System.out.println("On équipe la cafetière de" + gadget);
    }
}