package ExtraOfficeHours.day5;

import java.util.Arrays;
import java.util.Locale;

public class Anagram$$$ {
    public static void main(String[] args) {
        String str1 = "sveta";
        String str2 = "vstae";
        System.out.println("isAnagram2(str1,str2) = " + isAnagram2(str1, str2));

    }
    //first option to use TreeSet and check

    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] counter = new int[26];     //   26 because 26 letters  a=0 z=26

        for(int i=0; i<str1.length(); i++){                              //aple    elpa
            char oneLetter = str1.charAt(i);                             //a
            char twoLetter = str2.charAt(i);                             //e

            //counter[0] = counter[0]+1;  ascii value  a->97   b->98
            counter[oneLetter-97] = counter[oneLetter-97]+1;
            counter[twoLetter-97] = counter[twoLetter-97]-1; //0-1
        }
        return Arrays.equals(counter, new int[26]);
    }

    public static boolean isAnagram2(String str1, String str2){
        int count = 0;
        for(String each: str1.split("")){
            for(String each2: str2.split("")){
                if(each.equals(each2)){
                    count++;
                }
            }

        }
        return (count==str1.length())? true:false;
    }
}
