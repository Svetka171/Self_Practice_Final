package RuslanaPractice;

public class MethodBoolean {
    public static void main(String[] args) {

        String str = "masha";

        System.out.println(isTrue(str));


    }

    public static boolean isTrue(String str){
        String result="";

        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);

            if(result.equalsIgnoreCase(str)){
                return true;
            }
        }
       return false;
    }


}
