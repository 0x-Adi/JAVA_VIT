public class Main {
    public static void main(String[] args) {

        int trees = 1;  // Total number of trees
        int redApplesInWest = 1;  // At least 1 red apple in the west
        int redApplesInOtherDirections = 0; // No red apples in North, South, and East

        // Total guaranteed red apples
        int totalRedApples = trees * redApplesInWest;

        // Required minimum red apples
        int M = 2; // Example: If M > 1, condition fails

        System.out.println("Guaranteed Red Apples: " + totalRedApples);
        System.out.println("Is total red apples ≥ M? " + (totalRedApples >= M));

    }
}
