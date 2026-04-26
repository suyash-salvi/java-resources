package DSA;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();

        // Test cases
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        int[] nums3 = {3, 3};
        int target3 = 6;

        System.out.println(Arrays.toString(obj.twoSum(nums1, target1))); // expected: [0, 1]
        System.out.println(Arrays.toString(obj.twoSum(nums2, target2))); // expected: [1, 2]
        System.out.println(Arrays.toString(obj.twoSum(nums3, target3))); // expected: [0, 1]
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int i=0; i<nums.length;i++) {
            // if current element is found in map
            if(complementMap.containsKey(nums[i])) {
                // return the index of complemented element and current element
                return new int[]{complementMap.get(nums[i]), i};
            }
            // put the complement and index in the map
            complementMap.put(target- nums[i],i);
        }
        return new int[0];
    }
}