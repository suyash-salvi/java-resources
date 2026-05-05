package DSA;

import java.util.*;

public class AlternatePositiveNegative {

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, -1, 4};

        rearrange(arr);

        System.out.println(Arrays.toString(arr));
    }

    // TODO: implement this
    public static void rearrange(int[] arr) {
        int[] array = new int[arr.length];
        int i=0,j=1;
        for(int number: arr) {
            if (number <= 0) {
                array[i] = number;
                i+=2;
            } else {
                array[j] = number;
                j+=2;
            }
        }
        System.arraycopy(array, 0, arr, 0, arr.length);
    }
}
