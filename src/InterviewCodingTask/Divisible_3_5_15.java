package InterviewCodingTask;

public class Divisible_3_5_15 {
    public static void main(String[] args) {
       div(100);
    }

    public static void div(int num){
        String divBy15 = "";
        String divBy5 = "";
        String divBy3 = "";

        if(num>0){
            for(int i=1; i<=num; i++){
                if(i%3==0 && i%5==0 && i%15==0){
                    divBy15+=i+ " ";
                } else if(i%3==0 && i%15!=0){
                    divBy3+=i+ " ";
                }else if(i%5==0 && i%15!=0){
                    divBy5+=i+ " ";
                }
            }
        }

        System.out.println(divBy15);
        System.out.println(divBy5);
        System.out.println(divBy3);
    }
}
