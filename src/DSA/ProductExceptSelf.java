package DSA;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        // make a result array
        int[] result = new int[size];

        // initialize left prod as 1
        int leftprod = 1;
        for (int i=0; i< size; i++) {
            // add the left prod
            result[i] = leftprod;
            // update the left prod by current element under iteration
            leftprod *= nums[i];
        }

        // initialize right prod as 1
        int rightprod = 1;
        for(int i = size-1; i>=0; i--) {
            // multiply result with prod
            result[i] *= rightprod;
            // update the right prod by current element under iteration
            rightprod *= nums[i];
        }
        // return result
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,6};

        int[] answer = productExceptSelf(nums);

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
