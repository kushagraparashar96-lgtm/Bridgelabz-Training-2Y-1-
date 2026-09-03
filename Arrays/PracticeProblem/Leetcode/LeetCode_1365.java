package Arrays.PracticeProblem.Leetcode;

import java.util.Arrays;

class LeetCode_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];

        // Step 1: Count frequency of each number
        for (int num : nums) {
            count[num + 1]++;
        }

        // Step 2: Compute running sum (prefix sum)
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Map results to output array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        // Sample inputs (no manual input required in console)
        int[] nums = {8, 1, 2, 2, 3};

        int[] result = smallerNumbersThanCurrent(nums);

        // Output should be: [4, 0, 1, 1, 3]
        System.out.println(Arrays.toString(result));
    }
}