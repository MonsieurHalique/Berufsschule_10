package LS_04_ObjektOrientierung.Aufgabe_03;

import java.util.Scanner;

public class SparbuchTest {
    public static void main(String[] args) {
        Sparbuch tmp = new Sparbuch();
        Scanner scan = new Scanner(System.in);
        boolean weitereBuchung = true;
        do {
            System.out.println("Bitte Betrag eingeben");
            tmp.buchen(scan.nextDouble());
            System.out.println("Kontostand: " + tmp.getKontostand());
            System.out.println("Weitere Buchung vornehmen?[true/false]");
            weitereBuchung = scan.nextBoolean();
        } while(weitereBuchung == true);
        System.out.println("Zinsen: " + tmp.getZinssatz());
        System.out.println("Kontostand nach Zinsen: " + tmp.zinsenBerechnen());
    }
}
