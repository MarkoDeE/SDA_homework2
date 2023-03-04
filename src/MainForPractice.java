import java.util.List;
import java.util.stream.Collectors;

public class MainForPractice {
    public static void main(String[] args) {

        List<Ship> ships = List.of(
                new Ship("Ship1", "orange", "engine1", 5),
                new Ship("Ship2", "red", "engine2", 3),
                new Ship("Ship3", "orange", "engine3", 8),
                new Ship("Ship4", "green", "engine1", 2),
                new Ship("Ship5", "orange", "engine2", 10)
        );

        // Sort ships by name
        List<Ship> sortedShips = ships.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());
        System.out.println("Ships sorted by name: " + sortedShips);

        // Print only ships of orange color
        List<Ship> orangeShips = ships.stream()
                .filter(s -> s.getColor().equals("orange"))
                .collect(Collectors.toList());
        System.out.println("Orange ships: " + orangeShips);

        // Print all ship names
        List<String> shipNames = ships.stream()
                .map(Ship::getName)
                .collect(Collectors.toList());
        System.out.println("Ship names: " + shipNames);
    }
}

