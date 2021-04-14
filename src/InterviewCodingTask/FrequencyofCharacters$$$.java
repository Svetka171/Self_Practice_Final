package InterviewCodingTask;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyofCharacters$$$ {
    public static void main(String[] args) {
        String str = "aaabbccccccd";
        System.out.println("unique(str) = " + unique(str));

        Map<Integer, String> map = new HashMap<Integer, String>();

        // Mapping string values to int keys
        map.put(10, "Geeks");
        map.put(15, "4");
        map.put(20, "Geeks");
        map.put(25, "Welcomes");
        map.put(30, "You");
        System.out.println(map);
        System.out.println(map.entrySet());
    }

    public static String unique(String str){
        String result = "";

        for(String each: str.split("")){
            int count =0;
            for(String each2: str.split("")){
                if(each.equals(each2)){
                    count++;
                }
            }
            if(!result.contains(each)){
                result+=each + count;
            }
        }

        return result;
    }

    public static String uniqueSorted(String str){
       Map<String, Integer> map = new TreeMap<>();
      // map.put(a,2);
        //map.put(b,1)

       for(String each: str.split("")){
           if(map.containsKey(each)){
               map.put(each,map.get(each) +1 );
           }else{
               map.put(each,1);
           }
       }
       str="";
       // Initial Mappings are: {20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4}
       // The set is: [20=Geeks, 25=Welcomes, 10=Geeks, 30=You, 15=4]

       for(Map.Entry<String,Integer> each: map.entrySet()){ //entry set is set map to list
           str += each.getKey()+each.getValue();
       }
       return str;
    }
}
