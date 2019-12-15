package Week2;

public class ThreeAndSeven extends MiniJava {

    public static void main(String[] args){
        int n = readInt("Bitte Zahl eingeben:");
        int sum = 0;

        if(n<0){
            write("Fehler: n>=0 erwartet!");
        } else {
            while(n>2){
                if(n%3==0 || n%7==0){
                    sum += n;
                }
                n--;
            }
            write(sum);
        }
    }
}