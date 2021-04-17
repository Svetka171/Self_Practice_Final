package InterviewCodingTask;

public class fibonacci$$ {
    public static void main(String[] args) {
        //1 1 2 3 5 8..
        fib(8);
    }
    public static void fib(int num){   //8
       int result = 0;
       int j=0;
       int z=1;

        for(int i=1; i<=num; i++){
           result = j+z;    //result = 2       3      5
           j=z;              //j=1          =2
           z=result;         //z = 2        = 3
        }
        System.out.println(result);
    }
}
