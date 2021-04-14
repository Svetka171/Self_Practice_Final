package ExtraOfficeHours.day2;

import java.util.Map;

public class topping1 {

    public Map<String, String> topping1(Map<String, String> map){

        map.put("bread", "butter");
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public Map<String, String> topping2(Map<String, String> map){

        if(map.containsKey("ice cream") && map.get("ice cream") !=null){
            map.put("yogurt", map.get("ice cream"));
        }

        if(map.containsKey("spanish") && map.get("spanish")!=null){
            map.put("spanish", "nuts");
        }
        return map;
    }

    public Map<String, String> topping3(Map<String, String> map){

        if(map.containsKey("potato") && map.get("potato") !=null){
            map.put("fries", map.get("potato"));
        }

        if(map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }

        return map;
    }
}
