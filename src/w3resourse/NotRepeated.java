package w3resourse;

import java.util.Arrays;

public class NotRepeated {
    public static void main(String[] args) {
        String str = "aaccdd"; //b
        System.out.println("nonDupl(str) = " + nonDupl(str));

        int[] arr =  {8,7,2,9,5,3};
        int[] arr1 =  {8,7,2,9,5,3};
        System.out.println("arr = " + smallest(arr));

        System.out.println("twoArr(arr, arr1) = " + twoArr(arr, arr1));
    }

    public static Character nonDupl(String str){
        for(Character each: str.toCharArray()){
            int count = 0;
            for(Character each2: str.toCharArray()){
                if(each==each2){
                   count++;
                }
            }
            if(count<2){
                return each;
            }
        }


       return null;
    }

    public static int smallest(int[] arr){
        int result = 0;
        Arrays.sort(arr);
        return arr[0];
    }

    public static String twoArr(int[] arr1, int[] arr2){
        String twoArrays = "" ;
        int[] arr3 = new int[arr1.length+arr2.length];
        int j=0;
        for(int each:arr1){
           arr3[j++]=each;
        }

        for(int each:arr2){
            arr3[j++]=each;
        }

        Arrays.sort(arr3);
        for(int each: arr3){
            twoArrays += each;
        }

        return twoArrays;
    }
}
