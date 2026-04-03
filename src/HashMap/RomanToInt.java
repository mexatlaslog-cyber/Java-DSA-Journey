package HashMap;

import java.util.HashMap;

/*
 * Problem: Roman to Integer
 * Platform: LeetCode
 * Goal: Convert a Roman numeral string into its integer value.
 */

public class RomanToInt {
    public static void main(String[] args) {
        RomanToInt obj = new RomanToInt();
        System.out.println(obj.romanToIntCaseBased("MCMXCIV"));
        System.out.println(obj.romanToIntOptimized("MCMXCIV"));

    }

    /*
     * Approach: Check valid subtractive pairs explicitly, otherwise add the current value.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int romanToIntCaseBased(String s) {
        HashMap<Character, Integer> data = new HashMap<>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);
        int sum = 0;
        if (s.length() > 1) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (data.get(s.charAt(i)) == 1 && data.get(s.charAt(i + 1)) == 5 ||
                        data.get(s.charAt(i)) == 1 && data.get(s.charAt(i + 1)) == 10) {
                    sum -= 1;
                    continue;
                }
                if (data.get(s.charAt(i)) == 10 && data.get(s.charAt(i + 1)) == 100 ||
                        data.get(s.charAt(i)) == 10 && data.get(s.charAt(i + 1)) == 50) {
                    sum -= 10;
                    continue;
                }
                if (data.get(s.charAt(i)) == 100 && data.get(s.charAt(i + 1)) == 1000 ||
                        data.get(s.charAt(i)) == 100 && data.get(s.charAt(i + 1)) == 500) {
                    sum -= 100;
                    continue;
                }
                sum += data.get(s.charAt(i));
            }
            sum = sum + data.get(s.charAt(s.length() - 1));
        } else {
            sum += data.get(s.charAt(0));
        }
        return sum;
    }

    /*
     * Approach: Compare the current symbol with the next one. Subtract when the next
     *           value is larger, otherwise add the current value.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public int romanToIntOptimized(String s) {
        HashMap<Character, Integer> data = new HashMap<>();
        data.put('I', 1);
        data.put('V', 5);
        data.put('X', 10);
        data.put('L', 50);
        data.put('C', 100);
        data.put('D', 500);
        data.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int curr = data.get(s.charAt(i));
            int next = data.get(s.charAt(i + 1));

            if (curr < next) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }

        // Add the last symbol separately.
        sum += data.get(s.charAt(s.length() - 1));

        return sum;
    }
}
