package Week9;

import java.util.*;

public class ImportantCollections {
    public static void main(String[] args) {
        Map<Integer, String> toWords = new HashMap<>();

        Set<String> continents = new HashSet<>();
        Set<Integer> numbers = new TreeSet<>();
        List<String> penguins = new ArrayList<>();
        List<String> weekdays = new LinkedList<>();

        // Maps are like a dictionary, and associate one Key-Object
        // with some other Value-Object
        toWords.put(1, "One");
        toWords.put(2, "Two");
        toWords.put(3, "Three");
        // Adding duplicate for key means the old one
        // will be overwritten
        toWords.put(3, "Drei");
        System.out.println(toWords);


        continents.add("Europe");
        continents.add("North America");
        continents.add("South America");
        // Duplicate vaulue will be ignored again
        continents.add("Europe");
        // Printed values will have no order whatsoever
        System.out.println(continents);


        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        // Numerical order will be kept, -1 before 1 in set
        numbers.add(-1);
        // Duplicate will be ignored
        numbers.add(3);
        System.out.println(numbers);


        penguins.add("Adelie");
        penguins.add("Emperor");
        penguins.add("Gentoo");
        penguins.add("Chinstrap");
        // Duplicates will be kept
        penguins.add("Emperor");
        // List will be unsorted (Order in which elements were inserted)
        System.out.println(penguins);

        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        // Duplicates will be kept (sorry Garfield)
        weekdays.add("Monday");
        // Order will be the order in which the elements were inserted
        // Differences to ArrayList are efficiency and available methods (ArrayList is faster,
        // LinkedList has more methods (implements Queue))
        System.out.println(weekdays);
    }
}
