package DSA;

import java.util.*;

public class ValidAnagram {

    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();

        // Test cases
        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        String s3 = "aacc";
        String t3 = "ccac";

        System.out.println(obj.isAnagram(s1, t1)); // expected: true
        System.out.println(obj.isAnagram(s2, t2)); // expected: false
        System.out.println(obj.isAnagram(s3, t3)); // expected: false
    }

    public boolean isAnagram(String s, String t) {
        // converting strings to char arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        // sort the arrays using Arrays.sort
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        //Array.equals to check equality
        return Arrays.equals(sArray,tArray);
    }
}
