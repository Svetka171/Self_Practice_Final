package JaneTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisible {
    public static void main(String[] args) {

        int[] numbers = new int[100];// size of 100;


        for(int i=1, j=0; i<101; i++, j++){
            numbers[j] = i;
        }
       // System.out.println(Arrays.toString(numbers));

        String div3 = "";
        String div5 = "";
        String div15="";

        for(int each: numbers){
            if(each%15==0 && each%5==0 && each%3==0 ) {
                div15 += each + " ";
            }
            if(each%3==0 && each%15!=0){
                div3+=each + " ";
            }

            if(each%5==0 && each%15!=0){
                div5+=each + " ";
            }

        }

        System.out.println(div3);
        System.out.println(div5);
        System.out.println(div15);





    }
}
