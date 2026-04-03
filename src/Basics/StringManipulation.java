package Basics;

public class StringManipulation {
    public static void main(String[] args) {
        /*Problem: String and StringBuilder Manipulation
         * Description: Demonstrate common properties and functions of String and StringBuilder in Java
         * Approach: Call each method and print labeled output
         * Time Complexity: O(1) per direct operation (varies for some methods like reverse/replace)
         * Space Complexity: O(1) extra (excluding returned/new strings)
         * Difficulty: Easy
         * Note: AI help was taken for comments and text */

        String str1 = "Hello World!";
        String str2 = "hello world!";
        String str3 = "Hello World!";
        String strWithSpaces = "  Java DSA  ";

        // 1. String (immutable)
        System.out.println("equals: " + str1.equals(str3)); // Output: true
        System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str2)); // Output: true
        System.out.println("== (reference): " + (str1 == str3)); // Output: true (string pool)
        System.out.println("compareTo: " + str1.compareTo(str2)); // Output: -32
        System.out.println("length: " + str1.length()); // Output: 12
        System.out.println("charAt(1): " + str1.charAt(1)); // Output: e
        System.out.println("toUpperCase: " + str1.toUpperCase()); // Output: HELLO WORLD!
        System.out.println("toLowerCase: " + str1.toLowerCase()); // Output: hello world!
        System.out.println("concat: " + str1.concat(" Mexatlas")); // Output: Hello World! Mexatlas
        System.out.println("contains(\"World\"): " + str1.contains("World")); // Output: true
        System.out.println("startsWith(\"Hello\"): " + str1.startsWith("Hello")); // Output: true
        System.out.println("endsWith(\"!\"): " + str1.endsWith("!")); // Output: true
        System.out.println("indexOf('!'): " + str1.indexOf("!")); // Output: 11
        System.out.println("lastIndexOf('o'): " + str1.lastIndexOf("o")); // Output: 7
        System.out.println("substring(6, 11): " + str1.substring(6, 11)); // Output: World
        System.out.println("replace(\"World\", \"Java\"): " + str1.replace("World", "Java")); // Output: Hello Java!
        System.out.println("trim: [" + strWithSpaces.trim() + "]"); // Output: [Java DSA]
        System.out.println("isEmpty(\"\"): " + "".isEmpty()); // Output: true
        System.out.println("String.valueOf(123): " + 123); // Output: 123
        System.out.println("split(\" \")[0]: " + str1.split(" ")[0]); // Output: Hello

        // 2. StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("\nInitial StringBuilder: " + sb); // Output: Hello
        System.out.println("length: " + sb.length()); // Output: 5
        System.out.println("capacity: " + sb.capacity()); // Output: 21

        sb.append(" World");
        System.out.println("append(\" World\"): " + sb); // Output: Hello World

        sb.append('!');
        System.out.println("append('!'): " + sb); // Output: Hello World!

        sb.insert(6, "Java ");
        System.out.println("insert(6, \"Java \"): " + sb); // Output: Hello Java World!

        sb.delete(5, 10);
        System.out.println("delete(5, 10): " + sb); // Output: Hello World!

        sb.replace(6, 11, "DSA");
        System.out.println("replace(6, 11, \"DSA\"): " + sb); // Output: Hello DSA!

        System.out.println("charAt(0): " + sb.charAt(0)); // Output: H

        sb.setCharAt(6, 'd');
        System.out.println("setCharAt(6, 'd'): " + sb); // Output: Hello dSA!

        System.out.println("indexOf(\"SA\"): " + sb.indexOf("SA")); // Output: 7
        System.out.println("lastIndexOf(\"!\"): " + sb.lastIndexOf("!")); // Output: 9
        System.out.println("substring(6, 9): " + sb.substring(6, 9)); // Output: dSA

        sb.reverse();
        System.out.println("reverse: " + sb); // Output: !ASd olleH
    }
}
