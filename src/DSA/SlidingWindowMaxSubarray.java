package DSA;

import java.util.*;

public class SlidingWindowMaxSubarray {

    public static void main(String[] args) {
        SlidingWindowMaxSubarray obj = new SlidingWindowMaxSubarray();

        // Test cases
        int[] nums1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;

        int[] nums2 = {2, 3, 4, 1, 5};
        int k2 = 2;

        int[] nums3 = {1, 1, 1, 1, 1};
        int k3 = 3;

        System.out.println(obj.maxSubarraySum(nums1, k1)); // expected: 9  (5+1+3)
        System.out.println(obj.maxSubarraySum(nums2, k2)); // expected: 7  (3+4)
        System.out.println(obj.maxSubarraySum(nums3, k3)); // expected: 3
    }

    public int maxSubarraySum(int[] nums, int k) {
        int sum =0;
        // get the window sum first
        for (int i = 0; i<k; i++) {
            sum = sum + nums[i];
        }
        int maxSum = sum;
        // subtract tail while adding the moving end
        for (int i = k; i< nums.length; i++) {
            sum =  sum+nums[i];
            sum = sum-nums[i-k];
            // compare for max
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
