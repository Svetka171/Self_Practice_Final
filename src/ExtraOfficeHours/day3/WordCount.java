package ExtraOfficeHours.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        /*

The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
         */
    }
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String each: strings){
            int count = 0;
            for(String each2: strings){
                if (each.equals(each2)) {
                    count++;
                }
            }
            map.put(each,count );
        }

        return map;
    }

    public static Map<String, Integer> wordCount2(String[] strings) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String each: strings) {
            if(!map.containsKey(each)){
                map.put(each, 0);
            }
            map.put(each,map.get(each) +1);
        }

        return map;
    }
}
