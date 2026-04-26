package DSA;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        GroupAnagrams obj = new GroupAnagrams();

        // Test cases
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};

        System.out.println(obj.groupAnagrams(strs1));
        // expected: [["eat","tea","ate"],["tan","nat"],["bat"]]

        System.out.println(obj.groupAnagrams(strs2));
        // expected: [[""]]

        System.out.println(obj.groupAnagrams(strs3));
        // expected: [["a"]]
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        // Get a map for listing the ordered string and its combinations
       HashMap<String, List<String>> anagramMap = new HashMap<>();
       for(String str: strs) {
           // convert the string to char array
           char[] charArr = str.toCharArray();
           // sort the array
           Arrays.sort(charArr);
           // if it doesn't contain key, insert with a blank arraylist
           if (!anagramMap.containsKey(new String(charArr))) {
               anagramMap.put(new String(charArr), new ArrayList<>());
           }
           // get the arraylist and add the current string
           anagramMap.get(new String(charArr)).add(str);
       }
       return new ArrayList<>(anagramMap.values());
    }
}