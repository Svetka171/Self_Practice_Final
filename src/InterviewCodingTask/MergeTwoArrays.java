package InterviewCodingTask;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};
        System.out.println("mergeArrays(arr1, arr2) = " + Arrays.toString(mergeArrays(arr1, arr2)));

    }
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;

        for(int i = 0; i<arr1.length; i++){
            arr3[j] = arr1[i];
            j++;
        }

        for(int each: arr2){
            arr3[j++] = each;
        }

        return arr3;
    }

}
