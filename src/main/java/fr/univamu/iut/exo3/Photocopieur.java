package fr.univamu.iut.exo3;

import jdk.internal.vm.PostVMInitHook;

public class Photocopieur implements DecorateurImprimante{
    private Imprimante i;

    public Photocopieur(Imprimante i) {
        this.i = i;
    }

    public void imprimer() {
        i.imprimer();
        System.out.println("La fonction imprimer du Photocopieur est activée");
    }
}
