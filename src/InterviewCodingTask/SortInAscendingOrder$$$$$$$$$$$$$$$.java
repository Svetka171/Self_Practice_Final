package InterviewCodingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortInAscendingOrder$$$$$$$$$$$$$$$ {
    public static void main(String[] args) {
        int[] arr = {2,8,6,3,4,5,7};
        String[] str= {"Sveta", "Jane", "Dima"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        Collections.sort(list);
        System.out.println(list);
        ascending(arr);

        //descending
        descending(arr);
    }

    public static void ascending(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: arr){
            list.add(each);
        }

        Collections.sort(list);
        System.out.println(list);
    }


    public static void descending(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each: arr){
            list.add(each);
        }

        Collections.sort(list);
        int[] arrDescending = new int[arr.length];

        for(int i= list.size()-1, j=0; i>=0; i--, j++){
            arrDescending[j++] = list.get(i);
        }
        System.out.println(Arrays.toString(arrDescending));

    }


    /*
        Write a return method that can sort an int array in descending order without using the sort method
     */

    public int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);  //result = 2,6,5,9

        for (int i = 0; i < result.length; i++) {   //    5

            for (int j = 0; j < result.length; j++) { //    j=0   i = 1(6) > result[j] (2)    6>2
                if (result[i] > result[j]) {
                    Integer temp = result[i];         // Integer temp =6
                    result[i] = result[j];            // result[1]   = 2
                    result[j] = temp;                 // reult[0] =6
                }
            }

        }

        return result;

    }
}
