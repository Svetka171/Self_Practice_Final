package ExtraOfficeHours.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class Palindrome {
    //find largest Palindrome String in ArrayList
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("dad", "abcba", "racecar"));
    }

    public static String largestPalindrome(ArrayList<String> words){
        String largestStr = "";

            for(String each: words){

                if(each.length()>largestStr.length()) {
                    if (isPalindrome(each)) {
                        largestStr = each;

                    }
                }

            }

        return largestStr;
    }

    private static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){ //level
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;

    }
}
