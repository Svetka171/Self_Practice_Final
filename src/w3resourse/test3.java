package w3resourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class test3 {
    //binary 0,1
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};

     Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = arr.length-1; i>= 0; i--){
            System.out.print(arr[i]);
        }


    }

}
