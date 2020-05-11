package LS_04_ObjektOrientierung.Aufgabe_01;

/**
 * Dies ist die Dokumentation der Klasse Rechteck.
 * Die Klasse erstellt ein Rechteck und gibt die Fläche aus.
 *
 * @author Daniel Halik
 * @version 1.0
 */
public class Rechteck {
    private double laenge;
    private double breite;

    /**
     * Constructor
     */
    public Rechteck() {
        this.laenge = 0.0;
        this.breite = 0.0;
    }

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    /**
     * Getter
     */
    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    /**
     * Setter
     */
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void flaecheBerechnenAusgeben() {
        System.out.println("Die Fläche beträgt: " + (this.laenge * this.breite));
    }

    public double umfangBerechnen() {
        return (this.laenge * 2 + this.breite * 2);
    }
}
