package Week2;

public class Sum extends MiniJava {

    public static void main(String[] args){
        int sum = 0;
        int n = -1;

        while(n!=0){
            n = readInt("Bitte Zahl eingeben:");
            sum = sum + n;
        }

        write("Summe:");
        write(sum);
    }
}