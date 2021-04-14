package InterviewCodingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListMoveAllZeroToTheEnd {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,0,5,0,6,8));
        zeroToTheEnd(arr);
        zeroToTheEnd2(arr);
    }

    public static void zeroToTheEnd(ArrayList<Integer> arr){
        ArrayList<Integer> result = new ArrayList<>();

        for(int each: arr){
            if(each!=0){
                result.add(each);
            }
        }

        for(int each: arr){
            if(each==0){
                result.add(each);
            }
        }
        System.out.println(result);
    }

    public static void zeroToTheEnd2(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(arr);
        for(int i=arr.size()-1; i>=0; i--){
            result.add(arr.get(i));
        }
        System.out.println(result);
    }
}
