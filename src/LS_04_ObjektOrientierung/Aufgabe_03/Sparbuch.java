package LS_04_ObjektOrientierung.Aufgabe_03;

public class Sparbuch {
    private double kontostand;
    private String name;
    private double zinssatz;

    public Sparbuch(double kontostand, String name, double zinssatz) {
        this.kontostand = kontostand;
        this.name = name;
        this.zinssatz = zinssatz;
    }

    public Sparbuch() {
        this.kontostand = 1000.0;
        this.name = "";
        this.zinssatz = 0.55;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getName() {
        return name;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public void buchen(double betrag) {
        if ((kontostand + betrag) > 0) {
            kontostand = kontostand + betrag;
        } else
            System.out.println("Konto nicht aussreichend gedeckt");
    }


    public double zinsenBerechnen() {
        return kontostand + zinssatz / 100 * kontostand;
    }
}
