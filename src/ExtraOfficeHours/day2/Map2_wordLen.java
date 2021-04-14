package ExtraOfficeHours.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map2_wordLen {
    public Map<String, Integer> wordLen(String [] strings ){
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each: strings){
            int len = each.length();
            result.put(each, len);
        }

        return result;
    }
}
