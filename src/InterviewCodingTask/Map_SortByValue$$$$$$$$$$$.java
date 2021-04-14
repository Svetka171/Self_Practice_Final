package InterviewCodingTask;

import java.util.*;

public class Map_SortByValue$$$$$$$$$$$ {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("table",4 );
        map.put("lamp", 3);

        System.out.println("sortByValue(map) = " + sortByValue(map));


    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }
}
