package Aufgabe_Schleife_Arrays.Aufgabe_03;

import Aufgabe_Schleife_Arrays.Aufgabe_02.ArrayInput;

/**
 * Dies ist die Dokumentation der Klasse BubbleSort. BubbleSort sortiert ein Array mit dem BubbleSort.
 *
 * @author Daniel Halik
 * @version 1.0
 */
public class BubbleSort {
    /**
     * Attribute
     */
    private static ArrayInput arrayInput;

    /**
     * Constructor
     */
    public BubbleSort() {
        arrayInput = new ArrayInput();
    }

    public BubbleSort(int[] arr) {
        arrayInput = new ArrayInput(arr);
    }

    /**
     * Getter
     */
    public static int[] getSortedArray() {
        fkt_BubbleSort(arrayInput.getArr());
        return arrayInput.getArr();
    }

    /**
     * Sortieren des Arrays durch BubbleSort
     */
    private static void fkt_BubbleSort(int[] x) {
        /*
         * Variable
         */
        int tmp;

        for (int i = x.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j] > x[j + 1]) {
                    tmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = tmp;
                }
            }
        }
        arrayInput.setArr(x);
    }

    /**
     * Main
     */
    public static void main(String[] args) {
        arrayInput = new ArrayInput();
        arrayInput.fkt_Output();
        fkt_BubbleSort(arrayInput.getArr());
        arrayInput.fkt_Output();
    }
}