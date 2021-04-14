package JaneTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {

        String str = "abccdd";
        String unique = "";


        for(String each: str.split("")){ //array
            int feq =  Collections.frequency(Arrays.asList(str.split("")), each);

            if(feq==1){
                unique+=each;
            }


        }



        System.out.println(unique);

        String str1 = "abccdd";
        String w = "";

        for(String each : str1.split("")){ //a
            int count = 0;

            for(String each1: str1.split("")){ //a
                if(each.equals(each1)){
                    count++; //
                }
            }
            if(count==1){
                w+= each;
            }
        }
        System.out.println(w);









    }
}
