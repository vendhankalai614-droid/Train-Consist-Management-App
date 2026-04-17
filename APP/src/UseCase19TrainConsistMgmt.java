import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search Method
    public static int binarySearch(String[] bogieIds, String key) {
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return mid; // Found
            } else if (comparison > 0) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bogie IDs
        System.out.print("Enter number of bogie IDs: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieIds = new String[n];

        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        // Ensure sorting (important precondition)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // Search key input
        System.out.print("Enter bogie ID to search: ");
        String key = scanner.nextLine();

        // Perform Binary Search
        int result = binarySearch(bogieIds, key);

        // Display result
        if (result != -1) {
            System.out.println("Bogie ID found at index: " + result);
        } else {
            System.out.println("Bogie ID not found.");
        }

        scanner.close();

        // Run test cases
        runTests();
    }

    // -----------------------------
    // Simple Test Framework
    // -----------------------------
    public static void assertEqual(String testName, int actual, int expected) {
        if (actual == expected) {
            System.out.println(testName + " PASSED");
        } else {
            System.out.println(testName + " FAILED (Expected: " + expected + ", Actual: " + actual + ")");
        }
    }

    public static void runTests() {
        System.out.println("\nRunning Test Cases...\n");

        testSearch_Found();
        testSearch_NotFound();
        testSearch_FirstElement();
        testSearch_LastElement();
        testSearch_SingleElement();
    }

    // Test Cases

    public static void testSearch_Found() {
        String[] input = {"B1","A1","C1","D1"};
        Arrays.sort(input);
        int result = binarySearch(input, "C1");
        assertEqual("testSearch_Found", result, Arrays.asList(input).indexOf("C1"));
    }

    public static void testSearch_NotFound() {
        String[] input = {"A1","B1","C1"};
        Arrays.sort(input);
        int result = binarySearch(input, "X1");
        assertEqual("testSearch_NotFound", result, -1);
    }

    public static void testSearch_FirstElement() {
        String[] input = {"C1","A1","B1"};
        Arrays.sort(input);
        int result = binarySearch(input, "A1");
        assertEqual("testSearch_FirstElement", result, 0);
    }

    public static void testSearch_LastElement() {
        String[] input = {"A1","B1","C1"};
        Arrays.sort(input);
        int result = binarySearch(input, "C1");
        assertEqual("testSearch_LastElement", result, 2);
    }

    public static void testSearch_SingleElement() {
        String[] input = {"A1"};
        Arrays.sort(input);
        int result = binarySearch(input, "A1");
        assertEqual("testSearch_SingleElement", result, 0);
    }
}
