package InterviewCodingTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveAllZeroToTheEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,4}; //123400
        System.out.println(Arrays.toString(moveZerosToTheEnd(arr)));
        System.out.println(Arrays.toString(zeroToTheEnd(arr)));
    }

    public static int[] zeroToTheEnd(int[] arr){
        int[] arrFinal = new int[arr.length];
        ArrayList<Integer> zeros = new ArrayList<>();
        int index = 0;
        for(int each: arr){
            if(each==0){
                zeros.add(each);
            }else{
                arrFinal[index++] = each;
            }
        }

        for(int each: zeros){
            arrFinal[index++] = each;
        }
        return arrFinal;
    }

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each; //123
        }

        return result;

    }
}
