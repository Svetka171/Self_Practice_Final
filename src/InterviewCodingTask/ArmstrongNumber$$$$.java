package InterviewCodingTask;

public class ArmstrongNumber$$$$ {
    public static void main(String[] args) {
        int num = 153;
        System.out.println("armNum(num) = " + armNum(num));

    }

    public static boolean armNum(int num){
        int a = 0;
        int b = 0;
        int c = num;     //153    15

        while(num>0){
            a = num%10;             //  a=3       a = 5     1
            num /= 10;              //  15.3      num = 1   0
            b = b + (a * a * a);    // b = 0+(3*3*3) = 27    b = 27+ (5*5*5)   b= 152+(1*1*1)
        }
        return (c==b)? true:false;   // true
    }


}
