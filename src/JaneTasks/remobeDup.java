package JaneTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class remobeDup {
    public static void main(String[] args) {
        String str = "aacccbd";

        String nonDup = "";

        for(Character each: str.toCharArray()) { // characters a a c c c c b d
            if (!nonDup.contains(each + "")) {
                nonDup+= each+"";

            }

            System.out.println(nonDup);

        }


        Set<String> nonDupSet = new LinkedHashSet<>(Arrays.asList(str.split("")));

        System.out.println(nonDupSet);

        String nonDup1 = "";

        for(String each: nonDupSet){
            nonDup1+=each;
        }

        System.out.println(nonDup1);









    }
}
