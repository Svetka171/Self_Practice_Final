package InterviewCodingTask;

public class factorialNumber {
    public static void main(String[] args) {
        /*
    Write a return method that returns the factorial number of any given number
        Ex:
                Input: 5
                outPut: 120
                because 5 * 4 * 3 * 2 * 1 = 120
     */
        factorial(5);

    }
    public static void factorial(int num) {
        int result = 1;

        while (num > 0) {    //5
            result *= num;  //result = 1*5
            num = num - 1;   //num= 5-1
        }
        System.out.println(result);

    }
}
