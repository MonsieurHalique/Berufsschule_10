package Aufgabe_Schleife_Arrays.Aufgabe_05;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Dies ist die Dokumentation der Klasse Zeittumrechnung. Zeitumrechnung frägt den Benutzer
 * nach einer Sekundenzahl, die er in Stunde, Minuten und Sekunden umrechnet
 *
 * @author Franz Bauhuber
 * @version 1.0
 */
public class Zeitumrechnung {
    public static void main(String[] args) {
        /**
         * Attribute
         */
        int eingabe, sekunden, minuten, stunden;
        Scanner scan = new Scanner(System.in);
        /**
         * Eingabe
         */
        System.out.println("Bitte Sekundenzahl eingeben");
        eingabe = scan.nextInt();
        /**
         * Verarbeitung
         */
        stunden = eingabe / 3600;
        sekunden = eingabe % 3600;
        minuten = sekunden / 60;
        sekunden = sekunden % 60;
        /**
         * Ausgabe
         */
        System.out.println(eingabe + " Sekunden sind: ");
        System.out.println(stunden + " Stunden, \n" + minuten + " Minuten, \n" + sekunden + " Sekunden");
    }
}
