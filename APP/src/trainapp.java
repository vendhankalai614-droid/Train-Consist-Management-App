import java.util.LinkedHashSet;

public class trainapp {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC5   ");
        System.out.println("===========================================\n");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies (insertion order maintained)
        System.out.println("Adding bogies to train...");
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate insertion
        System.out.println("\nAttempting to add duplicate bogie 'Sleeper'...");
        train.add("Sleeper"); // duplicate (ignored automatically)

        // Display final formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(train);

        // Show total bogies
        System.out.println("\nTotal bogies in train: " + train.size());
    }
}