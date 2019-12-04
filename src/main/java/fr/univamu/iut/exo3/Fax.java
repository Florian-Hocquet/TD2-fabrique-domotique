package fr.univamu.iut.exo3;

public class Fax implements DecorateurImprimante{
    private Imprimante i;

    public Fax(Imprimante i) {
        this.i = i;
    }

    public void imprimer() {
        i.imprimer();
        System.out.println("La fonction imprimer du Fax est activée");
    }

    public void changercartouche() {

    }
}
