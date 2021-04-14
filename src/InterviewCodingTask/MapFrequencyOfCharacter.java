package InterviewCodingTask;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapFrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabbbbccccdddd";
        System.out.println("frequency(str) = " + frequency(str));

    }

    public static Map<Character, Integer> frequency(String str) {
        Map<Character, Integer> freq = new LinkedHashMap<>(); //a=1

        for (Character each : str.toCharArray()) {
            if (freq.containsKey(each)) { //1
                freq.put(each, freq.get(each) + 1);     //a =2
            } else {
                freq.put(each, 1);
            }
        }

        return freq;
    }

}
