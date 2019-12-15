package Week3;

public class Pascal extends MiniJava {
    // Funktion zur Berechnung der ersten n Zeilen des Pascalschen Dreiecks.
    public static int[][] pascalDreieck(int n) {
        // Deklarieren des Ergebnisfeldes.
        int[][] dreieck = new int[n][];
        // Schleife zur Berechnung der einzelnen Zeilen.
        for (int m = 0; m < n; m++) {
            dreieck[m] = new int[m + 1];
            dreieck[m][0] = 1;
            dreieck[m][m] = 1;
            // Schleife zur Berechnung der Elemente der jeweiligen Zeile.
            for (int i = 1; i < m; i++)
                dreieck[m][i] = dreieck[m - 1][i - 1] + dreieck[m - 1][i];
        }
        return dreieck;
    }

    public static void main(String[] args) {
        // Wir gehen von n >= 0 aus.
        int zeilenzahl = read("Gib die Zeilenzahl an:");
        int[][] dreieck = pascalDreieck(zeilenzahl);
        // Schleife zur Ausgabe der einzelnen Zeilen.
        for (int i = 0; i < zeilenzahl; i++) {
            writeConsole("n=" + i);
            // Schleife zur Ausgabe der Elemente der Zeile.
            for (int j = 0; j < dreieck[i].length; j++) {
                writeConsole("\t");
                writeConsole(dreieck[i][j]);
            }
            writeLineConsole();
        }
    }
}