package LS_04_ObjektOrientierung.Aufgabe_03;

public class Patient {
    private String name;
    private double gewicht;
    private double groesse;
    private Geschlecht geschlecht;

    public Patient(String name, double gewicht, double groesse, Geschlecht geschlecht) {
        this.name = name;
        this.gewicht = gewicht;
        this.groesse = groesse;
        this.geschlecht = geschlecht;
    }

    enum Geschlecht {
        Mann, FRAU;
    }

    public double fkt_BMI_Berechnen() {
        return (gewicht / Math.pow(groesse, 2));
    }

    public double fkt_IdealBerechnen() {
        if (geschlecht == Geschlecht.Mann) {
            return 22 * Math.pow(groesse, 2);
        } else if (geschlecht == Geschlecht.FRAU) {
            return 21 * Math.pow(groesse, 2);
        }
        return 0;
    }

    public String fkt_ZustandBestimmen(double bmi) {
        if (bmi < 20) {
            return "Untergewicht";
        } else if (bmi >= 20 && bmi < 25) {
            return "Normalgewicht";
        } else if (bmi >= 25 && bmi < 30) {
            return "Übergewicht";
        } else if (bmi >= 30 && bmi < 40) {
            return "Starkes Übergewicht";
        } else {
            return "Extremes Übergewicht";
        }
    }

    public double fkt_IdealBorca() {
        return (this.groesse * 100) - 100;
    }

}
