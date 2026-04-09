import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class trainapp {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC13    ");
        System.out.println("===========================================\n");

        // Prepare a large collection of bogies for benchmarking
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 48));
        }

        // -------------------------
        // Loop-based filtering
        // -------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        System.out.println("Loop-based filtering results count: " + loopFiltered.size());
        System.out.println("Loop-based execution time: " + loopDuration + " ns");

        // -------------------------
        // Stream-based filtering
        // -------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        System.out.println("\nStream-based filtering results count: " + streamFiltered.size());
        System.out.println("Stream-based execution time: " + streamDuration + " ns");

        // -------------------------
        // Consistency check
        // -------------------------
        boolean sameResults = loopFiltered.size() == streamFiltered.size();
        System.out.println("\nDo both methods produce the same results? " + (sameResults ? "✅ Yes" : "❌ No"));
    }
}