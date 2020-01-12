package Week11.Functions;

public class OddTest {
    public static void main(String... args) {

        // Concrete implementation of function has to be set before the actual function is called

        // System.out.println(Odd.isOdd(12)); - Throws NullPointerException as there is no implementation specified

        setImplementation();

        System.out.println(Odd.isOdd(13));
        System.out.println(Odd.isOdd(14));
        System.out.println(Odd.isOdd(15));
    }

    // setImplementation defines the function with a simple assignment to a Lambda
    static void setImplementation() {
        Odd.function = x -> !(x % 2 == 0);
    }

    // A different way to implement the function with a lambda
    private static void setAlternativeImpl() {
        Odd.function = x -> {
            if (x % 2 == 0) {
                return false;
            } else {
                return true;
            }
        };
    }
}
