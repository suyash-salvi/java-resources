package DSA;

import java.util.*;

public class Codec {

    public static void main(String[] args) {
        Codec codec = new Codec();

        // Test cases
        List<String> input1 = Arrays.asList("lint", "code", "love", "you");
        List<String> input2 = Arrays.asList("we", "say", ":", "yes");
        List<String> input3 = Arrays.asList("", "a", "");

        String encoded1 = codec.encode(input1);
        String encoded2 = codec.encode(input2);
        String encoded3 = codec.encode(input3);

        System.out.println(codec.decode(encoded1));
        // expected: ["lint","code","love","you"]

        System.out.println(codec.decode(encoded2));
        // expected: ["we","say",":","yes"]

        System.out.println(codec.decode(encoded3));
        // expected: ["","a",""]
    }

    public String encode(List<String> strs) {
        // Use stringbuilder to build a string for stringlength+'#'+string
        StringBuilder sb = new StringBuilder();
        for (String str: strs) {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        // initialize window
        int i = 0;
        while(i< s.length()) {
            //slide window head
            int j = i;
            // get to the delimiter
            while (s.charAt(j) != '#') {
                j++;
            }
            // Get the length from the first window to the delimiter
            int length = Integer.parseInt(s.substring(i, j));
            // get the word from the delimiter to the length
            String word = s.substring(j + 1, j + 1 + length);
            result.add(word);
            // slide window tail
            i = j+1+length;
        }
        return result;
    }

}