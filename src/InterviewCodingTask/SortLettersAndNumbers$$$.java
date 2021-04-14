package InterviewCodingTask;

import java.util.Arrays;

public class SortLettersAndNumbers$$$ {
    public static void main(String[] args) {
      /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together
        Ex:
            Input: "DC 501 GCCCA 098911"
            Output: "CD 015 ACCCG 0 1 1  8 9 9"
     */           // 01 234 56789 101112 131415
        String str = "DC501GCCCA098911";
        System.out.println(sortLettersAndNumbers(str));
    }
    public static String sortLettersAndNumbers(String str){
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp += "" + str.charAt(i);                   //when i is the last index cant enter inside loop for +1
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    temp += ",";
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    temp += ",";
                }
            }
        }


        String[] arr = temp.split(",");
        str = "";

        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }

        return str;
    }


}
