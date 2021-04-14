package InterviewCodingTask;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(arr)));

    }

    public static int[] reverseArray(int[] arr){
        int[] arrReverse = new int[arr.length];
        int j = 0;
        for(int i=arr.length-1; i>=0; i--){
            arrReverse[j++] = arr[i];
        }

        return arrReverse;
    }
}
