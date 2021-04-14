package ExtraOfficeHours.day2;

import java.util.Map;

public class MapAB2 {

    public Map<String, String> mapAB2(Map<String, String> map){

        if((map.containsKey("a") && map.containsKey("b")) && map.get("a").equals(map.get("b"))){
            map.remove("a");
            map.remove("b");
        }

        return map;
    }

    public Map<String, String> mapAB3(Map<String, String> map){
        if(map.containsKey("a")&& map.containsKey("b")) return map;


        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }

        if(map.containsKey("b")){
            map.put("a", map.get("b"));
        }

        return map;
    }

    public Map<String, String> mapAB4(Map<String, String> map){
        if(map.get("a").length() != map.get("b").length()){
            if(map.get("a").length() >map.get("b").length()){
                map.put("c", map.get("a"));
            }else{
                map.put("c", map.get("b"));
            }

        }else if(map.get("a").length() == map.get("b").length()){
            map.put("a", "");
            map.put("b", "");
        }

        return map;
    }
}
