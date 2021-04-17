package ExtraOfficeHours.day5;

import java.util.ArrayList;

public class TotalSumInTheString {
    public static void main(String[] args) {
        //input = "jav45ai15sgre1at82"
        //output = 45+15+1+82 = 143;
        System.out.println(getSumOfNumbers("jav45ai15sgre1at82"));
    }

    public static int getSumOfNumbers(String str) {

        // "abc120sd400sa9dhd83"

        int sum = 0; //
        String num = ""; //

        for(int i=0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))) {    //
                num += str.charAt(i);

                if(i == str.length()-1 || !Character.isDigit(str.charAt(i + 1))){
                    sum += Integer.parseInt(num);     //if its the end of the string or character not num
                    num = "";                                 //then add num to sum and make num empty to count again

                }

            }

        }

        return sum;
    }

}
