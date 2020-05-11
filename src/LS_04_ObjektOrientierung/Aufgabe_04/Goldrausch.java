package LS_04_ObjektOrientierung.Aufgabe_04;

import java.util.Scanner;

public class Goldrausch {
    public static void main(String[] args) {
        Gold rolex = new Gold();
        Scanner scan = new Scanner(System.in);
        double gewicht;
        System.out.println("Wie viele Gramm Gold hat ihre Roli?");
        gewicht = scan.nextDouble();
        rolex.grammInUnze(gewicht);
        System.out.println("Das Gold in meiner Roli ist " + rolex.bekommeGoldwert(1573.70) + "€ wert");
    }
}
