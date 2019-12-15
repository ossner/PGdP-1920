package Week2;

public class PrimeFactors extends MiniJava {

    public static void main(String[] args){
        int n = readInt("Bitte Zahl eingeben:");

        if( n <= 1) {
            writeConsole("Fehler: n>1 erwartet!");
        }

        int divisor = 2;
        while(n>1){
            if(n % divisor == 0){
                writeConsole(divisor);
                n = n / divisor;
                if(n!=1){
                    writeConsole(" ");
                }
            } else {
                divisor++;
            }
        }
        writeLineConsole();
    }
}