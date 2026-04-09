import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class trainapp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC11   ");
        System.out.println("===========================================\n");

        // Prompt for Train ID
        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainID = scanner.nextLine();

        // Prompt for Cargo Code
        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        String trainIDPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern patternTrainID = Pattern.compile(trainIDPattern);
        Pattern patternCargoCode = Pattern.compile(cargoCodePattern);

        // Create matcher objects
        Matcher matcherTrainID = patternTrainID.matcher(trainID);
        Matcher matcherCargoCode = patternCargoCode.matcher(cargoCode);

        // Validate Train ID
        if (matcherTrainID.matches()) {
            System.out.println("Train ID is VALID.");
        } else {
            System.out.println("Train ID is INVALID!");
        }

        // Validate Cargo Code
        if (matcherCargoCode.matches()) {
            System.out.println("Cargo Code is VALID.");
        } else {
            System.out.println("Cargo Code is INVALID!");
        }

        scanner.close();
    }
}