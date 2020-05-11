package LS_04_ObjektOrientierung.Aufgabe_01;

public class Quader {
    private double laenge;
    private double breite;
    private double hoehe;

    public Quader() {
    }

    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public void flaecheBerechnenAusgeben() {
        System.out.println("Fläche :" + umfangBerechnen());
    }

    public double umfangBerechnen() {
        return ((2 * laenge * breite) + (2 * laenge * hoehe) + (2 * breite * hoehe));
    }

    public double volumenBerechnen() {
        return laenge * breite * hoehe;
    }
}
