package Week2;

public class RabbitPopulation extends MiniJava {
    public static void main(String[] args) {
        int n = readInt("Bitte Zahl eingeben:");

        int[] rabbits = new int[3];
        rabbits[0] = 1;

        int month = 1;
        while (month < n) {
            int sum = 0;
            int i = 0;
            while (i < 3) {
                sum += rabbits[i];
                i++;
            }

            rabbits[2] = rabbits[1];
            rabbits[1] = rabbits[0];
            rabbits[0] = sum;
            month++;
        }
        write(rabbits[0] + rabbits[1] + rabbits[2]);
    }
}