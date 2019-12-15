package Week4;

import Week2.MiniJava;

public class NumberProperties extends MiniJava {
    /**
     * Bestimmt, ob die übergebene Zahl eine Primzahl ist.
     *
     * @param n eine Zahl >= 0
     * @return true, wenn n eine Primzahl ist, sonst false
     */
    public static boolean isPrime(int n) {
        for (int t = 2; t * t <= n; t++)
            if (n % t == 0)
                return false;
        return n > 1;
    }

    /**
     * Berechnet die Quersumme des Parameters
     *
     * @param n eine Zahl >= 0
     * @return die Quersumme von n
     */
    public static int crossSum(int n) {
        int crossSum = 0;
        while (n > 0) {
            crossSum += n % 10;
            n /= 10;
        }
        return crossSum;
    }

    /**
     * Bestimmt, ob n eine Quadratzahl ist, und gibt dann die Wurzel zurück
     *
     * @param n eine Zahl >= 0
     * @return x, falls es ein x gibt mit x*x = n, -1 sonst
     */
    public static int squareOf(int n) {
        int root = 0;
        while (root * root < n)
            root++;
        if (root * root == n)
            return root;
        else
            return -1;
        // Kürzere Version
        // return root * root == n ? root : -1;
    }

    /**
     * Gibt den Betrag von n zurück
     *
     * @param n eine Zahl
     * @return |n|
     */
    public static int abs(int n) {
        if (n >= 0)
            return n;
        else
            return -n;
        // Kürzere Version
        // return n >= 0 ? n : -n;
    }

    public static void main(String[] args) {
        int n = readInt();
        if (n < 0) {
            n = abs(n);
            write("Zahl < 0, Eigenschaften von " + n + ":");
        }
        if (isPrime(n))
            write("Primzahl");
        else
            write("Keine Primzahl");
        // Kürzere Version
        // write((isPrime(n) ? "" : "Keine ") + "Primzahl");
        write("Quersumme: " + crossSum(n));

        int root = squareOf(n);
        if (root == -1)
            write("Keine Quadratzahl");
        else
            write("Quadrat von " + root);
        // Kürzere Version
        // write(squareOf(n) == -1 ? "Keine Quadratzahl" : "Quadrat von " +
        // squareOf(n));
    }
}