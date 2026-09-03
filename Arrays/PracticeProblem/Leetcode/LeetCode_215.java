package Arrays.PracticeProblem.Leetcode;

import java.util.PriorityQueue;

class LeetCode_215 {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


        return minHeap.peek();
    }

    public static void main(String[] args) {
        LeetCode_215 sol = new LeetCode_215();

        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("Output: " + sol.findKthLargest(nums1, k1));

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("Output: " + sol.findKthLargest(nums2, k2));
    }
}