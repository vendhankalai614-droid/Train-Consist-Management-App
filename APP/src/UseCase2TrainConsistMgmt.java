import java.util.ArrayList;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC2   ");
        System.out.println("===========================================\n");

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies (CREATE)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after insertion (READ)
        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (DELETE)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // Check existence (SEARCH)
        System.out.println("\nChecking if 'Sleeper' exists:");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Final state
        System.out.println("\nFinal train consist:");
        System.out.println(passengerBogies);
    }
}