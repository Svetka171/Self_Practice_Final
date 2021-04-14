package ExtraOfficeHours.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map2_word0 {

    public Map<String, Integer> word0(String [] strings ){
        Map<String, Integer> result = new LinkedHashMap<>();

        for(String each: strings){
            result.put(each, 0);
        }

        return result;
    }
}
