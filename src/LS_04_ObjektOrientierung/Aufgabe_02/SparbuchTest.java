package LS_04_ObjektOrientierung.Aufgabe_02;

import java.util.Scanner;

public class SparbuchTest {
    public static void main(String[] args) {
        Sparbuch tmp = new Sparbuch();
        Scanner scan = new Scanner(System.in);
        System.out.println("Name");
        tmp.setNamen(scan.next());
        while (true) {
            System.out.println("Betrag");
            tmp.buchen(scan.nextDouble());
            System.out.println(tmp.getKontostand() + " : " + tmp.getNamen() + " : " + tmp.getZinssatz());
            System.out.println(tmp.zinsenBerechnen());
            System.out.println("Nächste Buchung");
            if (scan.next().equals("N"))
                break;
        }
    }
}
