package JaneTasks;

import java.util.Arrays;

public class Concat2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};

        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1){
            arr3[i]+=each;
            i++;
        }
        for(int each: arr2){
            arr3[i]+=each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));

    }
}
