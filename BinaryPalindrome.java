public class Main {
    public static void main(String[] args) {

        int num = 9; // Example number (Binary: 1001)
        String binaryStr = Integer.toBinaryString(num); // Convert number to binary

        // Check if binary representation is a palindrome
        boolean isPalindrome = isBinaryPalindrome(binaryStr);

        System.out.println("Binary Representation: " + binaryStr);
        System.out.println("Is Palindrome? " + isPalindrome);
    }

    // Method to check if a string is a palindrome
    public static boolean isBinaryPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
