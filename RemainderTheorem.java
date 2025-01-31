public class Main {
    public static void main(String[] args) {

        // Define polynomial P(x) = 2x^3 - 3x^2 + 4x - 5
        int a = 2; // Value at which remainder is calculated

        // Compute P(a) = 2(2)^3 - 3(2)^2 + 4(2) - 5
        int remainder = (2 * a * a * a) - (3 * a * a) + (4 * a) - 5;
        
        System.out.println("Remainder when P(x) is divided by (x - " + a + ") is: " + remainder);

    }
}