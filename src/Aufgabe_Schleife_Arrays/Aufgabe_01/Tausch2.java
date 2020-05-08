package Aufgabe_Schleife_Arrays.Aufgabe_01;
/**
 * Dies ist die Dokumentation der Klasse Tausch2. Tausch2 erstellt ein Array
 * und tauscht in dem Array zwei Zahlen
 * @author  Daniel Halik
 * @version 1.0
 */
public class Tausch2 {
    /**
     * Main
     */
    public static void main(String[] args) {
        /**
         * Attribute
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int merker;
        Ausgabe aus = new Ausgabe();

        /**
         * Function
         */
        aus.fkt_Print(arr[4], arr[6]);

        System.out.println("Zahlen werden getauscht");
        merker = arr[4];
        arr[4] = arr[6];
        arr[6] = merker;

        aus.fkt_Print(arr[4], arr[6]);
    }
}