package InterviewCodingTask;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String word = " Java fun language";


    }

    public static String reverse2Word(String str){
        String reversedWord = "";
        String[] arr = str.split(" ");
        String result = "";

        for(int i=arr[1].length()-1; i>=0; i--){
            reversedWord +=arr[1].charAt(i);
        }

        arr[1] = reversedWord;

        for(String each: arr){
            result+=each;
        }

        return  result;
    }
}
