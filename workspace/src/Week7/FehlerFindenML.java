package Week7;

public class FehlerFindenML {
    // vorher Integerdivision mit Rundungsfehlern
    public static float calculateLinearFunction(int a, int b, int x, int t) {
        float m = ((float) a) / b;
        float y = m * x + t;

        return y;
    }

    // Stringvergleich mit ==
    public static String respond(String phrase) {
        if ("Hello".equals(phrase)) {
            return "World!";
        } else if ("PGdP ist".equals(phrase)) {
            return "toll!";
        } else {
            return "Keine Ahnung, aber Pinguine sind die Besten!";
        }
    }

    // Start bei length, nicht length - 1
    public static String reverse(String s) {
        String returnString = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            returnString += s.charAt(i);
        }

        return returnString;
    }

    // Absturz, wenn keine 42 vorkommt
    public static int findFirst42(int[] array) {
        int i = 0;
        while (i < array.length && array[i] != 42) {
            i++;
        }

        return i;
    }

    // Index in Schleife initialisiert
    // Nur positive Zahlen kopiert
    public static int[] copyNonZeros(int[] array) {
        int lengthOfOriginal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                lengthOfOriginal++;
            }
        }

        int[] returnArray = new int[lengthOfOriginal];

        int indexToCopyTo = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                returnArray[indexToCopyTo] = array[i];
                indexToCopyTo++;
            }
        }

        return returnArray;
    }

    // < statt <=, Wurzel nicht betrachtet
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return n > 1;
    }

    // Nicht getestet, ob Intervall gültig
    public static int[] copyArrayFromTo(int[] array, int start, int stop) {
        if (start >= stop)
            return new int[0];
        if (stop > array.length)
            stop = array.length - 1;
        if (start < 0)
            start = 0;

        int length = stop - start;
        int[] returnArray = new int[length];

        for (int i = 0; i < length; i++) {
            returnArray[i] = array[start + i % array.length];
        }

        return returnArray;
    }

    // Erst Zugegriffen, dann geprüft
    public static int findFirst42Again(int[] array) {
        int i = 0;
        while (i < array.length && array[i] != 42) {
            i++;
        }

        return i;
    }

    // Wir nehmen an, dass mindestens sein Treffer vorkommt
    // || statt &&
    public static int findFirst42Or1337(int[] array) {
        int i = 0;
        while (array[i] != 42 && array[i] != 1337) {
            i++;
        }

        return i;
    }

    // i++ statt i--
    public static String reverseAgain(String s) {
        String returnString = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            returnString += s.charAt(i);
        }

        return returnString;
    }
}