package InterviewCodingTask;

public class ArmstrongNumber$$$$ {
    public static void main(String[] args) {
        int num = 153;
        System.out.println("armNum(num) = " + armNum(num));

    }

    public static boolean armNum(int num){
        int power = (int)(Math.log10(num) +1);
        int a = 0;
        int b = 0;
        int c = num;

        while (num>0){

            a = num%10; //3
            num /= 10;
            b +=  Math.pow(a, power );
        }
        return c==b;
    }


}
