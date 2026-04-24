import java.util.HashSet;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC3   ");
        System.out.println("===========================================\n");

        // Create HashSet for unique bogie IDs
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates)
        System.out.println("Adding bogie IDs...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display final set (duplicates automatically removed)
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIds);

        // Optional: show size to confirm uniqueness
        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}