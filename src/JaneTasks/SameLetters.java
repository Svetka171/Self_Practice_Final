package JaneTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameLetters {
    public static void main(String[] args) {
        String str = "phila";
        String str2 = "piahl";

        System.out.println(same(str, str2));


    }

    public static boolean same(String str, String str1){

        char[] ch = str.toCharArray();
        char[] ch1 = str.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        String first = "";
        String second = "";

        for(char each: ch){
            first+= each;
        }

        for(char each: ch1){
           second+= each;
        }

       return first.equals(second);
    }

}
