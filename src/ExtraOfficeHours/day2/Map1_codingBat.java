package ExtraOfficeHours.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map1_codingBat {
    public static void main(String[] args) {
        /*

Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the
empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
         */


    }

    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }


}
