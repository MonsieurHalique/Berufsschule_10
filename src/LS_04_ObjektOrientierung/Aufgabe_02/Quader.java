package LS_04_ObjektOrientierung.Aufgabe_02;

public class Quader {
    private double laenge;
    private double breite;
    private double hoehe;

    public Quader() {
        this.laenge = 0.0;
        this.breite = 0.0;
        this.hoehe = 0.0;
    }

    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public void flaecheBerechnenAusgeben(){
        System.out.println("Die Fläche ist: " + this.umfangBerechnen());
    }

    public double umfangBerechnen(){
        return 2*(laenge*breite + laenge*hoehe + hoehe*breite);
    }

    public double volumenBerechnen(){
        return laenge*breite*hoehe;
    }
}
