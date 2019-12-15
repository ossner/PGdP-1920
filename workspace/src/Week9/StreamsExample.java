package Week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            numbers.add(i);
        }

        // List of numbers from 0-25 in random order
        Collections.shuffle(numbers);
        System.out.println(numbers);

        // Select even number with the highest square from collection
        Optional<Integer> highestSquare = numbers
                .stream() // open the stream on the collection
                .filter(x -> x % 2 == 0) // remove values that don't match this lambda
                .map(x -> x * x) // map every value in list to its square
                .reduce((x, y) -> x > y ? x : y); // reduce list to only the highest number

        highestSquare.ifPresent(System.out::println); // print the highest number
    }
}
