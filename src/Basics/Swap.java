package Basics;

/*
 * Problem: Swap Two Numbers
 * Description: Swap values using temp variable and without temp.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * Difficulty: Easy
 */
public class Swap {

    public static void main(String[] args) {

        int a = 23, b = 7;

        // 1. Using temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Using temp: " + a + ", " + b);

        // Reset values
        a = 23;
        b = 7;

        // 2. Without using third variable
        a = (a + b) - (b = a);

        System.out.println("Without temp: " + a + ", " + b);
    }
}