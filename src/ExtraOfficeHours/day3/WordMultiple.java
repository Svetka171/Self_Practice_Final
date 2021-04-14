package ExtraOfficeHours.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordMultiple {
    /*

Given an array of strings, return a Map<String, Boolean> where each different string is a key
and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */
    public static void main(String[] args) {

    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new LinkedHashMap<>();

        for(String each: strings){
            String key = each.substring(0,1);
            if(!map.containsKey(each)){
                map.put(each,false);
            }else{
                map.put(each, true);
            }
        }

        return map;
    }
}
