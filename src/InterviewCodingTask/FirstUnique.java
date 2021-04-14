package InterviewCodingTask;

public class FirstUnique {
    public static void main(String[] args) {
        String str = "aaaabbcddd";
        System.out.println("unique(str) = " + unique(str));
    }

    public static String unique(String str){
        String unique="";
        for(String each: str.split("")){
            int count = 0;
            for(String each2: str.split("")){
                if(each.equals(each2)){
                    count++;
                }
            }
            if(count<2){
                unique+=each;
                break;
            }
        }



        return unique;
    }
}
