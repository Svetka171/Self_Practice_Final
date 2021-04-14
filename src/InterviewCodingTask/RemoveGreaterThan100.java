package InterviewCodingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveGreaterThan100 {
    public static void main(String[] args) {
         /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,80,120,89,256));

        System.out.println("remove(arr) = " + remove(arr));
    }
    public static List<Integer> remove(List<Integer> arr){
        Iterator<Integer> num = arr.iterator();

        while(num.hasNext()){
            if(num.next()>100){
                num.remove();
            }
        }

       return arr;
    }


}
