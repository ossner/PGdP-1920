package Week3;

public class Palindrome extends MiniJava {
    public static void main(String[] args) {
        int n = read("Geben Sie eine Zahl n >= 0 ein.");
        while (n < 0) {
            n = read("Geben Sie eine Zahl n >= 0 ein.");
        }

        // Wir zählen zunächst die Anzahl der Ziffern der Zahl n, indem wir die Zahl
        // durch 10 dividieren, bis diese den Wert 0 hat. Die Anzahl der Divisionen
        // entspricht der Anzahl der Ziffern.
        int numberOfDigits = 0;
        int t = n;
        while (t != 0) {
            numberOfDigits++;
            t = t / 10;
        }

        int[] digits = new int[numberOfDigits];

        // Wir lesen nun die Ziffern in ein Array ein. Eine Ziffer erhalten wir als
        // Divisionsrest durch 10. Die Reihenfolge, in der wir die Zahl im Feld
        // ablegen, spielt für den Palindrom-Test keine Rolle.
        int i = 0;
        while (n != 0) {
            int digit = n % 10;
            digits[i] = digit;
            n = n / 10;
            i++;
        }

        // Schließlich testen wir die Palindrom-Eigenschaft, indem wir Ziffern
        // zählen, die sich von vorne bzw. hinten gelesen unterscheiden. Gibt es
        // keine derartigen Ziffern, handelt es sich um ein Palindrom.
        int notMatching = 0;
        i = 0;
        while (i < numberOfDigits / 2) {
            if (digits[i] != digits[numberOfDigits - i - 1])
                notMatching++;
            i++;
        }

        if (notMatching == 0)
            write("Palindrom");
        else
            write("Kein Palindrom");
    }
}
