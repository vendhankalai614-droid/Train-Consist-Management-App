import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Binary Search with Defensive Check
    public static int searchBogie(String[] bogieIds, String key) {

        // 🔴 UC20: Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return mid;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of bogie IDs: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] bogieIds = new String[n];

        if (n > 0) {
            System.out.println("Enter bogie IDs:");
            for (int i = 0; i < n; i++) {
                bogieIds[i] = scanner.nextLine();
            }
        }

        try {
            // Sorting before search (precondition)
            Arrays.sort(bogieIds);

            System.out.println("Sorted Bogie IDs:");
            System.out.println(Arrays.toString(bogieIds));

            System.out.print("Enter bogie ID to search: ");
            String key = scanner.nextLine();

            int result = searchBogie(bogieIds, key);

            if (result != -1) {
                System.out.println("Bogie ID found at index: " + result);
            } else {
                System.out.println("Bogie ID not found.");
            }

        } catch (IllegalStateException e) {
            // Meaningful error message
            System.out.println("Error: " + e.getMessage());
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

    public static void assertException(String testName, Runnable action) {
        try {
            action.run();
            System.out.println(testName + " FAILED (Exception not thrown)");
        } catch (IllegalStateException e) {
            System.out.println(testName + " PASSED (" + e.getMessage() + ")");
        }
    }

    public static void runTests() {
        System.out.println("\nRunning Test Cases...\n");

        testSearch_EmptyArray();
        testSearch_NullArray();
        testSearch_NormalCase();
    }

    // Test Cases

    // ✅ UC20 Main Test: Empty array should throw exception
    public static void testSearch_EmptyArray() {
        String[] input = {};
        assertException("testSearch_EmptyArray", () -> searchBogie(input, "A1"));
    }

    // ✅ Null array should also throw exception
    public static void testSearch_NullArray() {
        assertException("testSearch_NullArray", () -> searchBogie(null, "A1"));
    }

    // ✅ Normal working case
    public static void testSearch_NormalCase() {
        String[] input = {"B2", "A1", "C3"};
        Arrays.sort(input);
        int result = searchBogie(input, "B2");
        assertEqual("testSearch_NormalCase", result, Arrays.asList(input).indexOf("B2"));
    }
}
