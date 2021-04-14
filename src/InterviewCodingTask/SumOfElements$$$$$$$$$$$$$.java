package InterviewCodingTask;

public class SumOfElements$$$$$$$$$$$$$ {
    public static void main(String[] args) {
/*
Input: A[] = [-5,-5,-8], Output = -5 and -5
Explanation: Sum close to zero in the given array is -10 which is the sum of two elements -5 and -5.
 */
        int[] arr = {-3,10,8};
        System.out.println("getSumOfTwoClosestToZeroElements(arr) = " + getSumOfTwoClosestToZeroElements(arr));

    }


    public static int getSumOfTwoClosestToZeroElements(int[] a) {
        /*
        If there are two elements equally close to zero like -2 and 2,
        consider the positive element to be "closer" to zero than the negative one.
        */
        int b[] = new int[2];                     // int [] = [,]   -3 10 8
        int z = 0;                                         //    z=0             z=2                z=2
        for (int i = 0; i < a.length; i++)
                                                           //  i =2             i=0               i=2
            for (int j = i + 1; j < a.length; j++) {       // j=2               j= 2                j = 3
                int sum = a[i] + a[j];                     // sum = 8 + 8   sum = -3+8  sum = 8 + 0
                if (z == 0)                               //
                    z = sum;                             // z = 7
                if (Math.abs(sum) > 0 && Math.abs(sum) < Math.abs(z)) {     //16>0 && 16<5
                    z = sum;       // z=5;
                    b[0] = a[i];   //
                    b[1] = a[j];
                }
            }
        return z;
    }


}
