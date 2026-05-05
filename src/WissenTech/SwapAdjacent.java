package WissenTech;

import java.util.*;

public class SwapAdjacent {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        alternateLowHigh(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    // TODO: implement this
    public static void alternateLowHigh(int[] a, int n) {
       for(int i=0;i<n-1; i+=2) {
           int temp = a[i];
           a[i] = a[i+1];
           a[i+1] =temp;
       }
    }
}
