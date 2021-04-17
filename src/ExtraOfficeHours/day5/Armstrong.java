package ExtraOfficeHours.day5;

public class Armstrong {
    public static void main(String[] args) {
        //153 = 1^3 + 5^3 + 3^3
        //153 = 1   +125  + 27
        int num = 1634;
        System.out.println("armNum(num) = " + armstrong(num));
    }

    public static boolean armstrong(int num){
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

    //by using string
    public static boolean armstrongString(int num){
        String number= String.valueOf(num);
        int power = number.length();
        int sum = 0;

        for(int i=0; i<number.length(); i++){
            int digit = Integer.parseInt("" + number.charAt(i));
            sum += Math.pow(digit, power);
        }
        return num==sum;
    }


}
