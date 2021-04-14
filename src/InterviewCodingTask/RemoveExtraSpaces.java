package InterviewCodingTask;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "Java is     cool";
        System.out.println("removeSpace(str) = " + removeSpace(str));
        System.out.println(Arrays.toString(str.split(" ")));


    }

    public static String removeSpace(String str){
       //remove Extra spaces
        str = str.trim();
        String result = "";

        for(String each: str.split(" ")){
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }

            return result;
    }

    public static String removeSpace2(String str){

        return str = str.replaceAll(" +", " ");
    }
}
