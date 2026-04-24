import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Built-in sorting
        Arrays.sort(bogieNames);

        System.out.println("After Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));

        sc.close();
    }
}
