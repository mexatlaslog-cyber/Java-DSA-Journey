package Basics;
/*
 * Problem: Check Even or Odd
 * Description: Determine whether a number is even or odd.
 * Approach: Use modulus operator (%) with if-else and ternary.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * Difficulty: Easy
 */

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        // 1. Using if-else
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // 2. Using ternary operator
        System.out.println((num % 2 == 0) ? "Even Number" : "Odd Number");

        sc.close();
    }
}