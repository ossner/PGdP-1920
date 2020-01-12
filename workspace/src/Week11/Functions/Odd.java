package Week11.Functions;

import java.util.function.Function;

// Odd only offers the function and a very simple use for the function, that's it
public class Odd {
    public static Function<Integer, Boolean> function;

    public static boolean isOdd(int x) {
        return function.apply(x);
    }
}
