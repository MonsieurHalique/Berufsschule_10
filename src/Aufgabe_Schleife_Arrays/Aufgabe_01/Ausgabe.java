package Aufgabe_Schleife_Arrays.Aufgabe_01;

/**
 * Dies ist die Dokumentation der Klasse Ausgabe. Ausgabe dient zur Ausgabe
 * zweier Zahlen
 *
 * @author Daniel Halik
 * @version 1.0
 */
public class Ausgabe {
    /**
     * Constructor
     */
    public Ausgabe() {
    }

    /**
     * Ausgabe der variable1 und variable2
     */
    protected static void fkt_Print(int variable1, int variable2) {
        System.out.println("\nZahl 1: " + variable1);
        System.out.println("Zahl 2: " + variable2 + "\n");
    }
}