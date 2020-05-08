package Aufgabe_Schleife_Arrays.Aufgabe_01;

import java.util.Scanner;

/**
 * Dies ist die Dokumentation der Klasse Tausch1. Tausch1 frägt den Benutzer
 * nach zwei Zahlen, die er dann vertauscht
 *
 * @author Daniel Halik
 * @version 1.0
 */
public class Tausch1 {
    /**
     * Main
     */
    public static void main(String[] args) {
        /**
         * Attribute
         */
        int variable1, variable2, variable3;
        Scanner scan = new Scanner(System.in);
        Ausgabe aus = new Ausgabe();

        /**
         * Setter
         */
        System.out.println("Erste Zahl");
        variable1 = scan.nextInt();
        System.out.println("Zweite Zahl");
        variable2 = scan.nextInt();

        /**
         * Function
         */
        aus.fkt_Print(variable1, variable2);

        System.out.println("Zahlen werden getauscht");
        variable3 = variable1;
        variable1 = variable2;
        variable2 = variable3;

        aus.fkt_Print(variable1, variable2);
    }

}