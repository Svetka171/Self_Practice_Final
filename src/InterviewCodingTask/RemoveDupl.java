package InterviewCodingTask;

public class RemoveDupl {
    public static void main(String[] args) {
        String str = "abbcd";
        System.out.println(remove2(str));
    }


    public static String remove2(String str){
        String result = "";

        for(String each: str.split("")){
            if (!result.contains(each)) {
                result+=each;
            }
        }

        return result;
    }


}
