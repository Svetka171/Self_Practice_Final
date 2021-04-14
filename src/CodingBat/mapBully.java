package CodingBat;

import java.util.Map;
import java.util.TreeMap;

public class mapBully {
    /*

Modify and return the given map as follows:
if the key "a" has a value, set the key "b" to have that value,
 and set the key "a" to have the value "". Basically "b" is a bully,
  taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("a","aaa");
        map.put("b", "aaa");
        map.put("c", "cake");
        //System.out.println(Bully(map));
        System.out.println(Bully1(map));

    }

    public static Map<String, String> Bully(Map<String, String> map){
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.replace("a","");

        }
        return map;
    }
    /*

Modify and return the given map as follows: if the keys "a" and "b"
 are both in the map and have equal values,remove them both.


mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */
    public static Map<String, String> Bully1(Map<String, String> map){
        if(map.containsKey("a")|| map.containsKey("b")){
            if(map.get("a").equals(map.get("b"))){
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
