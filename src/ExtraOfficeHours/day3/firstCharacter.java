package ExtraOfficeHours.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstCharacter {
    public static void main(String[] args) {
        /*

Given an array of non-empty strings, return a Map<String, String> with a key for every different first character
seen, with the value of all the strings starting with that character appended together
in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
         */
        String[] words = {"salt", "tea", "soda", "toast"};
        System.out.println("firstChar(words) = " + firstChar(words));
    }
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new LinkedHashMap<>();

        for(String each: strings) {                //salt          //tea         //soda
            String key = each.substring(0,1);      // s            //t           //s
            if(!map.containsKey(key)){             //
                map.put(key, each);                //put(s, salt)    put(t, tea)
            } else{
                map.put(key, map.get(each) + each);                              //put(s, get(salt) + soda
            }
        }


        return map;
    }
}
