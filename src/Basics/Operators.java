package Basics;

/*
 * Program: Operators in Java
 * Description: Demonstrates Arithmetic, Increment/Decrement,
 * Relational, Logical, and Ternary operators.
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * Difficulty: Easy
 */
public class Operators {

    public static void main(String[] args) {
        Operators obj = new Operators();
        obj.arithmetic(10, 5);
        obj.conditional(10, 5);
    }

    public void arithmetic(int a, int b) {
        System.out.println(a + b); // addition
        System.out.println(a - b); // subtraction
        System.out.println(a * b); // multiplication
        System.out.println(a / b); // division
        System.out.println(a % b); // modulus

        a++;
        b++;
        System.out.println(a + " " + b);

        System.out.println(++a + " " + ++b); // pre-increment

        a--;
        b--;
        System.out.println(a + " " + b);

        System.out.println(--a + " " + --b); // pre-decrement
    }

    public void conditional(int a, int b) {
        System.out.println(a == 10);
        System.out.println(a != b);
        System.out.println(a > b);

        System.out.println(a == 10 && b == 5);
        System.out.println(a == 10 || b == 5);

        System.out.println((a % b == 0) ? "Divisible" : "Not Divisible");
    }
}