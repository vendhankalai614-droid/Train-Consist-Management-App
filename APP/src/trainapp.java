import java.util.*;
import java.util.stream.Collectors;

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
        System.out.println("   Train Consist Management App - UC8   ");
        System.out.println("===========================================\n");

        // Reuse Bogie list (from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Display original list
        System.out.println("Original Bogie List:");
        System.out.println(bogies);

        // Stream filtering: capacity > 60
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        System.out.println(highCapacityBogies);

        // Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (unchanged):");
        System.out.println(bogies);
    }
}