package neetcode.Easy;

import java.util.Arrays;

public class Anagram {

   public static boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }


    public static void main(String[] args){

        Anagram ana = new Anagram();
        System.out.println(ana.isAnagram("racecar", "carrace"));

    }
    
}
