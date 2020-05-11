package LS_04_ObjektOrientierung.Aufgabe_05;

public class Verbrauch {
    private double strecke;
    private double spritMenge;
    private double spritPreis;

    public Verbrauch(double strecke, double spritMenge, double spritPreis) {
        this.strecke = strecke;
        this.spritMenge = spritMenge;
        this.spritPreis = spritPreis;
    }

    public double verbracuhPro100Km() {
        return (this.spritMenge / this.strecke) * 100;
    }

    public double kostenPro100Km() {
        return this.verbracuhPro100Km() * this.spritPreis;
    }

    public double kostenPro1Km() {
        return this.kostenPro100Km() / 100;
    }

    public double steckeMit1Liter() {
        return 100 / this.verbracuhPro100Km();
    }
}
