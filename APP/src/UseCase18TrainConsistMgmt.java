import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method for Linear Search
    public static boolean linearSearch(String[] bogieIds, String key) {

        // Traverse array sequentially
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Match found (early termination)
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Call search method
        boolean found = linearSearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID " + key + " FOUND in the consist.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND in the consist.");
        }

        sc.close();
    }
}

