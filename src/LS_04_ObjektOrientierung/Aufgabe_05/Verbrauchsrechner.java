package LS_04_ObjektOrientierung.Aufgabe_05;

public class Verbrauchsrechner {
    public static void main(String[] args) {
        Verbrauch tmp = new Verbrauch(100,7,1.09);
        System.out.println(tmp.kostenPro1Km());
        System.out.println(tmp.kostenPro100Km());
        System.out.println(tmp.steckeMit1Liter());
        System.out.println(tmp.verbracuhPro100Km());
    }
}
