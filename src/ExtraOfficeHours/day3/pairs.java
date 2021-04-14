package ExtraOfficeHours.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class pairs {
    public static void main(String[] args) {

        /*

Given an array of non-empty strings, create and return a Map<String, String> as follows:
 for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
         */
        String[] words = {"man", "moon", "main"};
        System.out.println(pairs(words));
    }
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new LinkedHashMap<>();

        for(String each: strings){
            result.put(each.substring(0,1), each.substring(each.length()-1));
        }

        return result;
    }

}
