package w3resourse;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
       boolean[][] arr = {{true, false, true}, {false, true, false}};

       int arr1 = arr.length; //1
       int arr1andArr2 = arr[1].length;//2

        for(int i = 0; i<arr1; i++){
            for(int y = 0; y<arr1andArr2; y++){
                if(arr[i][y]){
                    System.out.println("t");
                }else{
                    System.out.println("f");
                }
            }
        }

    }
}
