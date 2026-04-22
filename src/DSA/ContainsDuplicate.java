package DSA;

import java.util.*;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();

        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(obj.containsDuplicate(nums1)); // expected: true
        System.out.println(obj.containsDuplicate(nums2)); // expected: false
        System.out.println(obj.containsDuplicate(nums3)); // expected: true
    }

    public boolean containsDuplicate(int[] nums) {
        // HashSet so that only unique elements are inserted
        HashSet<Integer> setOfArray = new HashSet<>();
        for (int num: nums) {
            setOfArray.add(num);
        }
        // return true only there is a mismatch in length(contains duplcates)
        return setOfArray.size() != nums.length;

    }
}