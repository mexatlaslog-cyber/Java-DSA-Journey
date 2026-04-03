package Arrays;

/*
 * Problem: Move Zeroes
 * Platform: LeetCode
 * Goal: Move all zeroes to the end while keeping the order of non-zero elements.
 */

public class MovesZeros {
    public static void main(String[] args) {
        MovesZeros obj = new MovesZeros();
        obj.moveZeroesOptimized(new int[]{1, 0, 1, 0, 2, 3});
        obj.moveZeroesBruteForce(new int[]{1, 0, 1, 0, 2, 3});
    }

    /*
     * Approach: Count zeroes, then repeatedly swap adjacent elements to push each zero
     *           toward the end of the array.
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public void moveZeroesBruteForce(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
            }
        }
        for (int i = 0; i <= count; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] == 0) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /*
     * Approach: Track the next position for a non-zero element and swap in-place.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public void moveZeroesOptimized(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
