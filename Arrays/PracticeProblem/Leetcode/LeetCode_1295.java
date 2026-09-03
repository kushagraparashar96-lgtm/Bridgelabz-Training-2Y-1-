package Arrays.PracticeProblem.Leetcode;

import java.util.Scanner;

class LeetCode_1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = (int) Math.log10(num) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findNumbers(nums);

        System.out.println(result);

        sc.close();
    }
}