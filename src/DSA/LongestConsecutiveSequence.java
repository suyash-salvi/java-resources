package DSA;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
       // make a hashset
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        // add the numbers in the set
        for(int num:nums) {
            set.add(num);
        }

        // iterate through the set
        for(int num: set) {
            // set not contains a number-1(previous exists)
            if(!set.contains(num-1)) {
                int length=1;
                int curr = num;
                while(set.contains(curr+1)) {
                    length++;
                    curr++;
                }
                longest =Math.max(length, longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}