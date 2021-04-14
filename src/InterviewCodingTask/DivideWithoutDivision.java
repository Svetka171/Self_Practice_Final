package InterviewCodingTask;

public class DivideWithoutDivision {
    public static void main(String[] args) {
        int num = 6;
        int num2 = 8;
    }

    public static void division(int num, int num2){

        if(num2==0){                                  //20   5  = 20-5-5-5-5 = 4
            System.out.println("Invalid");
        }

        int count = 0;

        while(num>num2){
            num-=num2;
            count++;
        }

    }
}
