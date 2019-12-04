package fr.univamu.iut.exo3;

import fr.univamu.iut.exo2.Connectable;
import fr.univamu.iut.exo2.ConnectableFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class AppliDomotique {

    static ArrayList<Connectable> objets = new ArrayList<Connectable>();

    public static int menu() {
        int choix = 1;
        System.out.println("Taper 0 pour finir, 1 pour connecter une cafetière et 2 pour une radio");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choix = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            System.out.println("Problème de saisie");
        }
        return choix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String connectableCreer = " ";

        while (connectableCreer != "") {
            System.out.println("----------- Veuillez le nom de l'objet à créer -----------");
            connectableCreer = sc.nextLine();
            System.out.println("Veuillez sélectionner un gagdet à lui ajouter");
            String gagdetAjouter = sc.nextLine();
            ConnectableFactory.connecter(connectableCreer, gagdetAjouter);
            System.out.println(objets);
        }

    }
}