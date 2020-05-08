package Aufgabe_Schleife_Arrays.Aufgabe_06;

public class NotenRechner {
    /**
     * Attribute
     */
    private int[] sa = new int[2];
    private int[] mdl = new int[4];

    /**
     * Rechnet die Zeugnisnote aus
     */
    private void fkt_NotenRechner() {
        int counter = 0;
        double note = 0;
        int zeugnisNote;

        for (int sa : sa) {
            if (sa > 0) {
                counter += 2;
                note += sa + sa;
            }
        }

        for (int mdl : mdl) {
            if (mdl > 0) {
                counter++;
                note += mdl;
            }
        }
        note = note / counter;
        Math.round(note);
        System.out.println(note);
        zeugnisNote = (int) (note + 0.5);
        System.out.println(zeugnisNote);
    }

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {
        NotenRechner tmp = new NotenRechner();
        tmp.sa[0] = 2;
        tmp.sa[1] = 1;

        tmp.mdl[0] = 3;
        tmp.mdl[1] = 1;
        tmp.mdl[2] = 2;
        tmp.mdl[3] = 2;

        tmp.fkt_NotenRechner();
    }
}
