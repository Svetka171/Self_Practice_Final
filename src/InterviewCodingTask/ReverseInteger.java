package InterviewCodingTask;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 71;
        System.out.println("reverseNum(num) = " + reverseNum(num));
        System.out.println("reverse(71) = " + reverse(71));
    }

    public static int reverseNum(int num){
        String str = "" + num;
        String reverse = "";


        for(int i=str.length()-1; i>=0; i--){
            reverse+= str.charAt(i);
        }

        return Integer.valueOf(reverse);
    }

    public static int reverse(int number){
        if(number < 10 && number >= 0){
            return number;
        }

        int result = 0;                                       //12
        while (number !=0) {
            result = result * 10 + number % 10;           //result =0+2       =20+12
            number /= 10;                                  // num = 1.2     = 0.12
        }

        return result;
    }
}
