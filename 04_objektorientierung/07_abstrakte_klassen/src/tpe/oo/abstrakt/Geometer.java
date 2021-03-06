package tpe.oo.abstrakt;

/**
 * Flächenberechnung.
 */
public final class Geometer {

    /** Keine Instanzen. */
    private Geometer() {
        // keine Objekte
    }

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args) {
        Figur[] figur = new Figur[10];
//        Figur[] dreiecke = new Dreieck[5];

        figur[0] = new Kreis(10.0);
        figur[1] = new Kreis(5.5);
        figur[2] = new Kreis(3.3);
        figur[3] = new Kreis(7.2);
        figur[4] = new Kreis(8.0);
        figur[5] = new Dreieck(4.0, 3.0);
        figur[6] = new Dreieck(2.0, 1.0);
        figur[7] = new Dreieck(5.0, 8.0);
        figur[8] = new Dreieck(2.0, 7.2);
        figur[9] = new Dreieck(14.0, 3.8);

        double gesamtflaeche = 0.0;

        for (Figur f : figur) {
            gesamtflaeche += f.flaeche();
        }



        System.out.printf("Die Fläche beträgt: %.2f", gesamtflaeche);
    }
}
