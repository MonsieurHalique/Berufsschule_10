package LS_04_ObjektOrientierung.Aufgabe_02;

import java.util.Scanner;

public class QuaderTest {
    public static void main(String[] args) {
        Quader tmp = new Quader(2.0, 2.0, 2.0);
        Scanner scan = new Scanner(System.in);
        System.out.println("Länge?");
        tmp.setLaenge(scan.nextDouble());
        System.out.println("Breite?");
        tmp.setBreite(scan.nextDouble());
        System.out.println("Höhe?");
        tmp.setHoehe(scan.nextDouble());
        tmp.flaecheBerechnenAusgeben();
        System.out.println("Volumen: " + tmp.volumenBerechnen());

    }
}
