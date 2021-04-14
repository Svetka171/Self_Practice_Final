package InterviewCodingTask;

import java.util.Arrays;

public class SumOfLeftEqualTotheSumOfRight$$$$$$$$$$$$ {
    public static void main(String[] args) {
        /*
           Given an array of integers, write a function to return the item in the array,
    where the sum of all items on its left is equal to the sum of the ones on the right.
    For example :
            Given [4, 9, 1, 3, 6, 4]
            your function should give item 1, because 4+9 = 3+6+4
     */
        int[] arr = {10,3, 5, 2, 9, 9};
        System.out.println("equal(arr) = " + equilibrium1(arr));
        System.out.println(arr.length);
    }

    public static int equilibrium1(int[] array) {
        int result = 0;                                  //{4, 9, 1, 3, 6, 4}    length = 6

        for (int i = 1; i < array.length; i++) {        //1   i= 2

            int sumOfLeft = 0;
            int sumOfRight = 0;

            for (int j = 0; j < i; j++) {           //j=0  j<1           j=0 j<2
                sumOfLeft += array[j];               // sumOnLeft = 4    4 + 9 =13
            }

            for (int k = i + 1; k < array.length; k++) {   //k = 2; 2<6         k = 3   3<6
                sumOfRight += array[k];                   // sumOfRight =  9    3+6+4 =13
            }

            if (sumOfLeft == sumOfRight) {
                result = array[i];
            }

        }
        return result;
    }



}
