package Week6;

public class Caesar extends MiniJava {
    public static void main(String[] args) {
        String inputText = readString("Bitte Text eingeben:");
        int key = readInt("Bitte Schlüssel eingeben:");
        write(encrypt(toArray(inputText), key));
    }

    public static char[] toArray(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < result.length; i++)
            result[i] = input.charAt(i);
        return result;
    }

    public static String encrypt(char[] input, int key) {
        // Die Zahl liegt danach in [-25;25]
        key = key % 26;
        // Die Zahl liegt danach in [0;51]
        key = key + 26;
        // Und jetzt in [0;26]
        key = key % 26;

        char[] encrypted = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            char current = input[i];
            if (current >= 'a' && current <= 'z')
                encrypted[i] = (char) (((current - 'a' + key) % 26) + 'a');
            else if (current >= 'A' && current <= 'Z')
                encrypted[i] = (char) (((current - 'A' + key) % 26) + 'A');
            else
                encrypted[i] = current;
        }

        return new String(encrypted);
    }
}