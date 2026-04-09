import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;    // e.g., "Cylindrical", "Rectangular", "Box"
    String cargo;   // e.g., "Petroleum", "Coal", "Grain"

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "GoodsBogie{" +
                "type='" + type + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

public class trainapp {

    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("   Train Consist Management App - UC12    ");
        System.out.println("===========================================\n");

        // Prepare goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));

        // Print all goods bogies
        System.out.println("Goods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety compliance check: Cylindrical bogies must carry only Petroleum
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.type.equalsIgnoreCase("Cylindrical") || bogie.cargo.equalsIgnoreCase("Petroleum")
                );

        // Display result
        System.out.println("\nSafety Compliance Check:");
        if (isSafe) {
            System.out.println("✅ Train formation is SAFE.");
        } else {
            System.out.println("❌ Train formation is UNSAFE!");
        }
    }
}