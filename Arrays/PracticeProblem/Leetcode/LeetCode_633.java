package Arrays.PracticeProblem.Leetcode;
import java.util.Scanner;

public class LeetCode_633 {
        public static boolean judgeSquareSum(int c) {
            long left = 0;
            long right = (long) Math.sqrt(c);

            while (left <= right) {
                long sum = left * left + right * right;

                if (sum == c) {
                    return true;
                } else if (sum < c) {
                    left++;
                } else {
                    right--;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int c = sc.nextInt();
            boolean result = judgeSquareSum(c);

            System.out.println(result);

            sc.close();
        }
    }



