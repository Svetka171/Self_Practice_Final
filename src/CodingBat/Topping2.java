package CodingBat;

import java.util.Map;

public class Topping2 {
/*

Modify and return the given map as follows: if the keys "a" and "b"
have values that have different lengths, then set "c" to have the longer value.
If the values exist and have the same length, change them both to the empty string in the map.


mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */

    public static Map<String, String> top2(Map<String, String> map) {
      if(map.containsKey("a") && map.containsKey("b")){
          if(map.get("a").length() != map.get("b").length()){
              int a = map.get("a").length();
              int b = map.get("b").length();
              if(a>b){
                  map.put("c", map.get("a"));
              }else {
                  map.put("c", map.get("b"));
              }
          }
      }
      return map;
    }
}
