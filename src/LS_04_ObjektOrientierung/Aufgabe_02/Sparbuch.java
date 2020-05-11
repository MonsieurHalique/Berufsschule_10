package LS_04_ObjektOrientierung.Aufgabe_02;

public class Sparbuch {
    private double kontostand = 0.0;
    private String namen;
    private double zinssatz = 0.55;

    public Sparbuch() {
        this.namen = null;
    }

    public Sparbuch(String namen) {
        this.namen = namen;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getNamen() {
        return namen;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public void buchen(double betrag) {
        if (betrag < 0 && kontostand >= betrag * -1) {
            this.kontostand += betrag;
            System.out.println("erfolgreich");
        } else if (betrag > 0) {
            this.kontostand += betrag;
        } else {
            System.out.println("Nicht möglich");
        }


    }

    public double zinsenBerechnen() {
        return (((int) (((kontostand * 0.0055) * 100) + 0.5)) / 100.0);
    }
}
