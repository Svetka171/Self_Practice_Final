package ExtraOfficeHours.day2;

import java.util.Map;

public class mapAB {
    public static void main(String[] args) {

    }

    public Map<String, String> mapAB(Map<String, String> map){
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
