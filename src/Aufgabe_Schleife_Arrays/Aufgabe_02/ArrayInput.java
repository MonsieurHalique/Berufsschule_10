package Aufgabe_Schleife_Arrays.Aufgabe_02;

import java.util.Scanner;

/**
 * Dies ist die Dokumentation der Klasse ArrayInput. ArrayInput erstellt ein Array und kann dieses Ausgeben.
 * Die Länge kann vom Benutzer eingegeben werden.
 * Der Inhalt vom Array wird vom Benutzer eingegeben.
 * Es kann zudem ein Vorhandenen Array übergeben werden.
 *
 * @author Daniel Halik
 * @version 1.0
 */
public class ArrayInput {
    /**
     * Attribute
     */
    private static int[] arr;
    private static Scanner scan = new Scanner(System.in);

    /**
     * Constructor
     */
    public ArrayInput() {
        fkt_Length();
        fkt_Input();
    }

    public ArrayInput(int[] arr) {
        setArr(arr);
    }

    /**
     * Getter
     */
    public static int[] getArr() {
        return arr;
    }

    /**
     * Setter
     */
    public static void setArr(int[] arr) {
        ArrayInput.arr = arr;
    }

    /**
     * Bestimmung der Länge vom Benutzer
     */
    public static void fkt_Length() {
        System.out.println("Wie lang soll das Array werden?");
        arr = new int[scan.nextInt()];
    }

    /**
     * Einagebe der Werte für das Array vom Benutzer
     */
    public static void fkt_Input() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Bitte Zahl für Stelle " + (i + 1) + " von " + (arr.length) + " eingeben");
            arr[i] = scan.nextInt();
        }
    }

    /**
     * Ausgabe des Arrays
     */
    public static void fkt_Output() {
        for (int zahl : arr)
            System.out.print(zahl + "\t-\t");
        System.out.println();
    }

    /**
     * Main
     */
    public static void main(String[] args) {
        fkt_Length();

        fkt_Input();

        fkt_Output();
    }

}