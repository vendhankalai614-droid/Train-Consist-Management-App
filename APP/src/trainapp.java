class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class trainapp {
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC14    ");
        System.out.println("===========================================\n");

        // Test creation of bogies
        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            PassengerBogie acChair = new PassengerBogie("AC Chair", 0); // Invalid
            PassengerBogie firstClass = new PassengerBogie("First Class", 50);

            System.out.println("Bogies created successfully:");
            System.out.println(sleeper);
            System.out.println(acChair);
            System.out.println(firstClass);

        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        // Multiple valid bogies
        try {
            PassengerBogie sleeper1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie acChair1 = new PassengerBogie("AC Chair", 56);
            PassengerBogie firstClass1 = new PassengerBogie("First Class", 48);

            System.out.println("\nMultiple valid bogies created:");
            System.out.println(sleeper1);
            System.out.println(acChair1);
            System.out.println(firstClass1);

        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }
    }
}