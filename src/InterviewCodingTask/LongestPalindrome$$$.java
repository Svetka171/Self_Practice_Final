package InterviewCodingTask;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindrome$$$ {
    public static void main(String[] args) {
        String str = "java is anna and civic marctcram";
        System.out.println("longestPal(str) = " + largestPalindrome(str));
    }

    public static String largestPalindrome(String str){
        String largestStr = "";

        for(String each: str.split(" ")){

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
