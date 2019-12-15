package Week4;

public class debug extends MiniJava {
    public static void print(int[] feld) {
        if (feld.length == 0) {
            write("{}");
            return;
        }
        writeConsole("{" + feld[0]);
        for (int i = 1; i < feld.length; i++) {
            writeConsole(", " + feld[i]);
        }
        writeConsole("}");
    }

    public static void minUndMax(int[] feld) {
        int min = feld[0];
        int max = feld[0];
        for (int i = 1; i < feld.length; i++) {
            if (feld[i] < min) {
                min = feld[i];
            } else if (feld[i]>max) {
                max = feld[i];
            }
        }
        write("Minimum = " + min + ", Maximum = " + max);
    }

    public static int[] invertieren(int[] feld) {
        for (int i = 0; i < feld.length / 2; i++) {
            int temp = feld[i];
            feld[i] = feld[feld.length - 1 - i];
            feld[feld.length - 1 - i] = temp;
        }
        return feld;
    }

    public static int[] schneiden(int[] feld, int laenge) {
        int[] arr = new int[laenge];
        boolean done = false;
        for (int i = 0; i < laenge; i++) {
            if (i == feld.length) {
                done = true;
            }
            if (done) {
                arr[i] = 0;
            } else {
                arr[i] = feld[i];
            }
        }
        return arr;
    }

    public static int[] linearisieren(int[][] feld) {
        int arrC = 0;
        int c = 0;
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                arrC++;
            }
        }
        int[] arr = new int[arrC];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                arr[c] = feld[i][j];
                c++;
            }
        }
        return arr;
    }
}