package ExtraOfficeHours.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        /*

Loop over the given array of strings to build a result string like this:
 when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
 Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
         */
    }
    public String wordAppend(String[] strings) {
        String result = "";

        Map<String, Integer> map = new LinkedHashMap<>();
        for(String each: strings){
            if(!map.containsKey(each)){
                map.put(each, 1);
            }else {
                result+=each; //remove every second time
                map.remove(each);
            }
        }

        return result;
    }
}
