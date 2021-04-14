package InterviewCodingTask;

public class IndexOfFirstUnique {

    public static void main(String[] args) {
        String str = "aaaabbcdddf";
        System.out.println(indexOf(str));
    }

    public static int indexOf(String str){

        for(String each: str.split("")){
            int count = 0;
            for(String each2: str.split("")){
                if(each.equals(each2)){
                    count++;
                }
            }
            if(count<2){
                 return  str.indexOf(each);
            }
        }
        return -1;
    }
}
