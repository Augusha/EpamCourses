import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "software";
        String str2 = "swear oft";

        // Remove whitespace and punctuation
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Sort the characters in both strings
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        // Compare the sorted strings
        boolean isAnagram = Arrays.equals(arr1, arr2);

        if (isAnagram) {
            System.out.println(str2 + " is an anagram of " + str1);
        } else {
            System.out.println(str2 + " is not an anagram of " + str1);
        }
    }
}