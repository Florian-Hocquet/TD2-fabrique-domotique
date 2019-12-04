package fr.univamu.iut.exo3;

public class Scanner implements DecorateurImprimante{
    private Imprimante i;

    public Scanner (Imprimante i) {
        this.i = i;
    }

    public void imprimer() {
        i.imprimer();
        System.out.println("La fonction imprimer du Scanner est activée");
    }
}
