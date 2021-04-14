package ExtraOfficeHours.day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class frequencyOfDuplicates_Amazon {

    //indentify the frequency of dupl words in a String
    // -> "java is java language is useful java"  =>  java=3 is=2 language = 1 useful= 1 ;
    public static void main(String[] args) {
        String str = "java is java language is useful java";
        countDupl(str);
        countDupl2(str);
    }

    public static void countDupl(String str){
        //converted string to ArraList

        String checked = "";
        ArrayList<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));
        for(String each: words) {

            if (!checked.contains(each)) {
                int frequencyOfEach = Collections.frequency(words, each);

                checked += each + frequencyOfEach;
            }
        }
        System.out.println(checked);
    }

    public static void countDupl2(String str){
        String result = "";

        for(String each: str.split(" ")){
            int count =0;
            for(String each2: str.split(" ")){
                if (each.equals(each2)) {
                    count++;
                }
            }
            if(!result.contains(each)) {
                result += each + count;
            }
        }
        System.out.println(result);

    }
}
