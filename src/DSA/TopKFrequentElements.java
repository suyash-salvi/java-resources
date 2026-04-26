package DSA;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        TopKFrequentElements obj = new TopKFrequentElements();

        // Test cases
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;

        int[] nums2 = {1};
        int k2 = 1;

        int[] nums3 = {4, 4, 4, 6, 6, 7, 7, 7, 7};
        int k3 = 2;

        System.out.println(Arrays.toString(obj.topKFrequent(nums1, k1)));
        // expected: [1, 2]

        System.out.println(Arrays.toString(obj.topKFrequent(nums2, k2)));
        // expected: [1]

        System.out.println(Arrays.toString(obj.topKFrequent(nums3, k3)));
        // expected: [7, 4] (order may vary)
    }

    public int[] topKFrequent(int[] nums, int k) {
        // make a frequency counter
        HashMap<Integer, Integer> frequencyCounter = new HashMap<>();
        for (int num: nums) {
            frequencyCounter.put(num, frequencyCounter.getOrDefault(num, 0)+1);
        }

        // Prepare Priority Queue to prioritize frequency priority
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> frequencyCounter.get(a) - frequencyCounter.get(b));

        for (int num: frequencyCounter.keySet()) {
            // add element
            minHeap.offer(num);
            if (minHeap.size() > k) {
                // pop any element that goes above the set limit
                minHeap.poll();
            }
        }
        // create an array to store the result
        int[] result = new int[k];
        int i=0;
        // populate the array using poll method
        while (minHeap.size()!=0) {
            result[i++] = minHeap.poll();
        }
        return result;
    }
}
