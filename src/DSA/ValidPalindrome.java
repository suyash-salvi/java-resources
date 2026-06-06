package DSA;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length() -1;

        while (leftIndex< rightIndex) {

            while(leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(leftIndex))) {
                leftIndex++;
            }

            while(leftIndex < rightIndex && !Character.isLetterOrDigit(s.charAt(rightIndex))) {
                rightIndex--;
            }

            if (Character.toLowerCase(s.charAt(leftIndex)) != Character.toLowerCase(s.charAt(rightIndex))) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    public static void main(String[] args) {

        String[] testCases = {
                "A man, a plan, a canal: Panama",
                "racecar",
                "Was it a car or a cat I saw?",
                "hello",
                "0P",
                " ",
                "Madam",
                "No lemon, no melon"
        };

        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\"");
            System.out.println("Output: " + isPalindrome(testCase));
            System.out.println("--------------------------");
        }
    }
}