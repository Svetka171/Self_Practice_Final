package InterviewCodingTask;

public class StringToInteger$$$ {
    public static void main(String[] args) {
        String str = "126";
        System.out.println("conv(str) = " + conv(str));
    }

    public static int conv(String str){//126
        int result = 0;//6+20+100
        int factorTo10=100;

        for(int i = str.length()-1; str.startsWith("-") ? i > 0 : i >= 0; i--){  // i=1
            char each = str.charAt(i);    //each = 1
            result+=(each-'0')*factorTo10; //result+=100
            factorTo10 *= 10;
        }
        return result;
    }
}
