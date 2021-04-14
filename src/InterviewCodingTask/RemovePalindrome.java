package InterviewCodingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("level","shop", "house", "civic"));
        System.out.println("removePalindrome(arr) = " + removePalindrome(arr));
    }

    public static List<String> removePalindrome(List<String> arr){
        Iterator<String> str = arr.iterator();

        while(str.hasNext()){

            String word = str.next(); //level
            String reverse = "";

        for(int i=word.length()-1; i>=0; i--){
            reverse+=word.charAt(i);
        }

            if (word.equalsIgnoreCase(reverse)) {
                str.remove();
            }

        }

       return arr;
    }


}
