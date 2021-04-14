package JaneTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        String str = "Hello world B21 ";  // ["b21", "world", "hello]
        String result = "";

        // i = 0, i=l i=l, i=e, i=h

        for(int i =str.length()-1; i>=0; i--){
            result+= str.charAt(i); // character at index i
        }

        System.out.println(result);


        String str2 = "Hello world B21";
         String[] str4 = str2.split(" ");   //[hello, world, 21]
        String[] reverse = new String[str4.length];


        for(int i = str4.length-1, j=0; i>=0; i-- , j++){
            //  0    =  21
            //  1    = world
            //  2   = hello
           reverse[j] = str4[i];

        }
        System.out.println(Arrays.asList(reverse));


    }
}
