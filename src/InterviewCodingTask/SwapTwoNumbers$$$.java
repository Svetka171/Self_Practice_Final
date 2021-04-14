package InterviewCodingTask;

public class SwapTwoNumbers$$$ {
    public static void main(String[] args) {
        int num =5; //6
        int num2 =6;//5

        swap2num(5,6);
    }

    public static void swap2num(int a, int b){
       a = a+b;    //a=11
       b = a-b;    // 11-6 = b = 5
       a = a-b;    //11-5 = 6

        System.out.println(a);
        System.out.println(b);
    }

}
