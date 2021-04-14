package RuslanaPractice;

public class ReverseTheString {
    public static void main(String[] args) {
        String str = "abc";
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);


    }
}
