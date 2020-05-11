package LS_04_ObjektOrientierung.Aufgabe_01;

import java.util.Scanner;

public class RechteckTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rechteck tmp = new Rechteck();
        System.out.println("Länge?");
        tmp.setLaenge(scan.nextDouble());
        System.out.println("Breite?");
        tmp.setBreite(scan.nextDouble());
        tmp.flaecheBerechnenAusgeben();
        System.out.println(tmp.umfangBerechnen());
    }
}
