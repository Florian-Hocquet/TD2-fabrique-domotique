package fr.univamu.iut.exo2;

import java.util.ArrayList;
import java.util.Scanner;

public class ConnectableFactory {

    public static void connecter(String connectableCreer, String gagdetAjouter) {

            switch (connectableCreer) {
                case "Radio":
                    Connectable radio = new Radio("radio");
                    Connectable.equiper(gagdetAjouter);
                    AppliDomotique.objets.add(radio);
                    break;

                case "Cafetiere":
                    Connectable cafetiere = new Cafetiere("cafetiere");
                    Connectable.equiper(gagdetAjouter);
                    AppliDomotique.objets.add(cafetiere);
                    break;

                case "Radiateur":
                    Connectable radiateur = new Radiateur("radiateur");
                    Connectable.equiper(gagdetAjouter);
                    AppliDomotique.objets.add(radiateur);
                    break;

                    default:
                        System.out.println("C est pas bon");
            }
        }


}
