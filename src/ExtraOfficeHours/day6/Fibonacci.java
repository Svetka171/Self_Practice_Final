package ExtraOfficeHours.day6;

public class Fibonacci {
    public static void main(String[] args) {
  fib(8);
    }

    public static void fib(int num){

        int a = 0;
        int b = 1;
        int result = 0;
        System.out.print(a);

        for(int i=1; i<num; i++){
            System.out.println(b);
            result = a+b;
            a=b;
            b=result;
        }

    }

    public static int fib2(int num){
        if(num==0) return 0;
        if(num==1) return 1;

         return fib2(num-1) + fib2(num-2);

    }
}
