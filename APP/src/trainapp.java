import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class trainapp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC10   ");
        System.out.println("===========================================\n");

        // List of bogies (reuse example from UC7-UC9)
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 54),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 54)
        );

        // Display bogie list
        System.out.println("Passenger Bogies:");
        bogies.forEach(System.out::println);

        // Calculate total seating capacity using stream, map, and reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // Extract capacity
                .reduce(0, Integer::sum);      // Sum capacities

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats + " seats");

        // Verify original list unchanged
        System.out.println("\nOriginal Bogie List (unchanged):");
        bogies.forEach(System.out::println);
    }
}