package DSA;

public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
      int i = 0, j = 0, k = 0;
      //initialize an array to accommodate both arrays
      int[] result = new int[a.length + b.length];
      // while both indices in both arrays don't exceed the array
      while (i < a.length && j < b.length) {
          // if an element in b is smaller than b
          if(a[i] < b[j]) {
              // increment the result array index and a and insert a[i]
              result[k++] = a[i++];
          } else {
              // increment the result array index and b and insert b[j]
              result[k++] = b[j++];
          }
      }

      // if a is still left
      while (i < a.length) {
          // keep inserting
          result[k++] = a[i++];
      }
      while (j < b.length) {
          result[k++] = b[j++];
      }

      return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] result = merge(a, b);

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}