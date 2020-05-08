package Aufgaben_Noten_Datentypen_cast.Aufgabe_01;

class Noten {
    public static void main(String[] args) {
        int schul1, schul2, ex1, ex2, anzahl;
        double notenschnitt;
        schul1 = 2;
        schul2 = 3;
        ex1 = 4;
        ex2 = 2;
        anzahl = 6;
        notenschnitt = (schul1 * 2 + schul2 * 2 + ex1 + ex2) / (double) anzahl;
        notenschnitt = ((int) (notenschnitt * 100)) / 100.0;
        System.out.println("1.Schulaufgabe: " + schul1);
        System.out.println("2.Schulaufgabe: " + schul2);
        System.out.println("1.Ex: " + ex1);
        System.out.println("2.Ex: " + ex2);
        System.out.println("________________________");
        System.out.println("Notenschnitt = " + notenschnitt);
        int note;
        note = (int) (notenschnitt + 0.5);
        System.out.println("Zeugnisnote = " + note);
    }
}