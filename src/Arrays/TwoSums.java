package Arrays;
/*
 * Problem: Two Sum
 * Description: Find indices of two elements whose sum equals target.
 * Approach: Use two nested loops to check all pairs.
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Difficulty: Easy
 */

import java.util.Arrays;

public class TwoSums {

    public static void main(String[] args) {
        TwoSums obj = new TwoSums();
        System.out.println(Arrays.toString(
                obj.sumArrays(new int[]{4, 6, 7, 1, 4}, 8)
        ));
    }

    public int[] sumArrays(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // if no solution
    }
}