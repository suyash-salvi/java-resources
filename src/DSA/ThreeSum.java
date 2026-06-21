package DSA;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i< nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = nums.length-1;

            while(left<right) {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum ==0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left<right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }

    private static void runTest(int[] nums) {
        System.out.println("Input:  " + Arrays.toString(nums));
        System.out.println("Output: " + threeSum(nums));
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {

        // Test Case 1
        runTest(new int[]{-1, 0, 1, 2, -1, -4});

        // Test Case 2
        runTest(new int[]{0, 1, 1});

        // Test Case 3
        runTest(new int[]{0, 0, 0});

        // Test Case 4
        runTest(new int[]{-2, 0, 1, 1, 2});

        // Test Case 5
        runTest(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4});
    }
}