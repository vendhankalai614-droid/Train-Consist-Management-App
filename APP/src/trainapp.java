import java.util.HashMap;
import java.util.Map;

public class trainapp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC6   ");
        System.out.println("===========================================\n");

        // Create HashMap (Bogie -> Capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity mapping using put()
        System.out.println("Adding bogie capacities...\n");

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // Display all entries using entrySet()
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Example: Fast lookup
        System.out.println("\nChecking capacity of Sleeper...");
        System.out.println("Sleeper Capacity: " + bogieCapacity.get("Sleeper"));
    }
}