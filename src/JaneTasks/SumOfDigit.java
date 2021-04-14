package JaneTasks;

import java.util.Locale;

public class SumOfDigit {
    public static void main(String[] args) {

        String str = "12589";

        System.out.println(sumOfNum(str));

    }

    public static int sumOfNum(String str){
        int result = 0;

        for(Character each: str.toCharArray()){
           if(Character.isDigit(each)){
               result+= Integer.valueOf(each +"");
           }
        }
        return result;
    }

}
