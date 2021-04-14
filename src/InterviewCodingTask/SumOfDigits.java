package InterviewCodingTask;

public class SumOfDigits {
    public static void main(String[] args) {
        //75 = 7+5 = 12
        System.out.println("sum(75) = " + sum(75));
    }

    public static int sum(int num){
        int result = 0;

        while(num>1){

            result += num%10 ;       //num%10 = 5+7
            num = num/10;
        }

     return result;
    }

}
