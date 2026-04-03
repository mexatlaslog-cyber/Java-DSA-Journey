package Basics;

public class Palidrome {
    public static void main(String[] args) {
        Palidrome obj = new Palidrome();
        System.out.println(obj.isPalidrome1(121));
        System.out.println(obj.isPalidrome2(121));
    }

    /*Problem: Palindrome Number
     * Description: Check whether the given integer is a palindrome using string conversion
     * Approach: Convert the number to a string, reverse it with StringBuilder, and compare both values
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     * Difficulty: Easy
     * Execution Speed: 8 ms */
    public boolean isPalidrome1(int x) {
        String str = Integer.toString(x);
        StringBuilder str1 = new StringBuilder(str);
        return str.contentEquals(str1.reverse());
    }

    /*Problem: Palindrome Number
     * Description: Check whether the given integer is a palindrome using arithmetic operations
     * Approach: Reverse the digits of the number mathematically and compare the reversed value with the original number
     * Time Complexity: O(log10 n)
     * Space Complexity: O(1)
     * Difficulty: Easy
     * Execution Speed: 5 ms */
    public boolean isPalidrome2(int x) {
        if (x >= 0) {
            int rev = 0, org = x, k = 10;
            while (x > 0) {
                rev = x % k + rev * 10;
                x = x / 10;
            }
            return org == rev;
        } else {
            return false;
        }
    }
}
