package Aufgabe_Schleife_Arrays.Aufgabe_04;

import Aufgabe_Schleife_Arrays.Aufgabe_03.BubbleSort;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Dies ist die Dokumentation der Klasse Lotto. Lotto generiert Zufallszahlen für ein Lottospiel.
 * Der Benutzer gibt 6 Zhalen plus Zusatzzahl ein.
 * Die Eingabe wird mit den Lottozahlen vergliechen und der Gewinn wird ausgegeben.
 *
 * @author Daniel Halik
 * @version 1.0
 */
public class Lotto {
    /**
     * Attribute
     */
    private static int[] arr_LottoZahl = new int[6];
    private static int[] arr_TippZahl = new int[6];
    private static int superZahlTipp, superZahlLotto, hits;
    private static boolean matchSuperZahl = false;

    /**
     * Generiert Zufallszahlen für die Lottozahlen
     */
    private static void fkt_LottoZahlen() {
        int tmp;

        for (int i = 0; i < arr_LottoZahl.length; i++) {
            while (true) {
                tmp = (int) (Math.random() * 49) + 1;
                if (!fkt_NumberInArray(tmp, arr_LottoZahl)) {
                    arr_LottoZahl[i] = tmp;
                    break;
                }
            }
        }
        superZahlLotto = (int) (Math.random() * 9);
    }

    /**
     * Eingabe der Tippzahlen vom Benutzer
     */
    private static void fkt_TippZahlen() {
        int tmp;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr_TippZahl.length; i++) {
            while (true) {
                System.out.print("Zahl " + (i + 1) + ": ");
                tmp = scan.nextInt();
                if ((tmp >= 1 && tmp <= 49) && !fkt_NumberInArray(tmp, arr_TippZahl)) {
                    arr_TippZahl[i] = tmp;
                    break;
                }
            }
        }
        while (true) {
            System.out.println("Superzahl (zwischen 0 und 9):");
            superZahlTipp = scan.nextInt();
            if (superZahlTipp >= 0 && superZahlTipp <= 9)
                break;
        }
    }

    /**
     * Überprüft ob die neue Zufallszahl bereits im Array ist
     *
     * @param x   generierte Zufallszahl
     * @param arr Array der bereits gespeicherten Zahlen
     * @return Ture = bereits enthalten, False = nicht enthalten
     */
    private static boolean fkt_NumberInArray(int x, int[] arr) {
        for (int number : arr) {
            if (number == x) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gibt das Array sortiert aus und hängt die Superzahl hinten an
     *
     * @param arr       Das Array was ausgegeben werden soll
     * @param superZahl Superzahl die bei der Ausgabe hinten angehangen wird
     */
    private static void fkt_Ausgabe(int[] arr, int superZahl) {
        BubbleSort sort = new BubbleSort(arr);
        for (int number : sort.getSortedArray()) {
            System.out.print(number + "\t");
        }
        System.out.println("| " + superZahl);
    }

    /**
     * Überprüft wie viele Tipss richtig sind.
     * Und ob die Superzahlt übereinstimmt
     */
    private static void fkt_Match() {
        hits = 0;
        for (int numberTipp : arr_TippZahl) {
            for (int numberLotto : arr_LottoZahl) {
                if (numberLotto == numberTipp) {
                    hits++;
                    break;
                }
            }
        }
        if (superZahlLotto == superZahlTipp) {
            System.out.println("Superzahl Richtig");
            matchSuperZahl = true;
        }
    }

    /**
     * Gibt den gewonnen Gewinn formatiert aus
     */
    private static void fkt_Gewinn() {
        double value = 0;
        DecimalFormat pattern = new DecimalFormat("###,###,###.00");
        switch (hits) {

            case 6:
                if (matchSuperZahl)
                    value = 8949642.20;
                else
                    value = 574596.50;
                break;
            case 5:
                if (matchSuperZahl)
                    value = 10022.00;
                else
                    value = 3340.60;
                break;
            case 4:
                if (matchSuperZahl)
                    value = 190.80;
                else
                    value = 42.40;
                break;
            case 3:
                if (matchSuperZahl)
                    value = 20.90;
                else
                    value = 10.40;
                break;
            case 2:
                if (matchSuperZahl)
                    value = 5.00;
                else
                    value = 0.00;
                break;
            default:
                value = 00.00;
                break;
        }
        System.out.println("Gewinn: " + pattern.format(value));
    }

    /**
     * Main
     */
    public static void main(String[] args) {
        int tmp;
        fkt_LottoZahlen();

        System.out.println("Lotto Spielen\n" +
                "*************\n");
        System.out.println("Tipp abgeben (wähle 6 Zahlen zwischen 1 und 49):");

        fkt_Ausgabe(arr_LottoZahl, superZahlLotto);
        fkt_TippZahlen();

        System.out.println("Dein Tipp:");
        fkt_Ausgabe(arr_TippZahl, superZahlTipp);
        System.out.println("Lottozahlen heute:");
        fkt_Ausgabe(arr_LottoZahl, superZahlLotto);
        fkt_Match();
        System.out.println("Anzahl Richtige: " + hits + "!");
        fkt_Gewinn();
    }
}