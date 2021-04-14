package InterviewCodingTask;

import java.util.Arrays;

public class SumUpToZero$$$$$$$$$$$ {
    public static void main(String[] args) {
    /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.              1     -1         -1+1=0
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */
        System.out.println("sumUpToZero(3) = " + Arrays.toString(sumUpToZero(5 )));
                                                             //1 2 3 4  -
    }
                                        //4
    public static int[] sumUpToZero(int num){
        int[] arr = new int[num];      //new int[4] =={0,1, 2 } .....
        int sum = 0; //0+1+2           //sum=0
        for(int i =0; i<num-1; i++){   // i=0; 0<4-1 0++     i=1; 1<3 1++   i=2; 2<3; 2++
            arr[i] = i; //0    0       //  arr[0] = 0        arr[1] = 1     arr[2] = 2
            sum+=i;                    //sum =0              sum = 1       sum = 2
        }

        arr[num-1] = -sum;             //  arr[num-1] =   -3


        return arr;
    }


}
