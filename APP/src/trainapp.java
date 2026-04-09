import java.util.LinkedList;

public class trainapp{

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC4   ");
        System.out.println("===========================================\n");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies (initial formation)
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index 1)
        System.out.println("\nInserting Pantry Car at position 2...");
        train.add(1, "Pantry Car");

        System.out.println("After Insertion:");
        System.out.println(train);

        // Remove first and last bogie
        System.out.println("\nRemoving first and last bogie...");
        train.removeFirst();
        train.removeLast();

        // Final train consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(train);
    }
}