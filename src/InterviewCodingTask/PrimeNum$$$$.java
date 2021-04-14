package InterviewCodingTask;

public class PrimeNum$$$$ {
    //2 3 5 11
    public static void main(String[] args) {

    }

    public static boolean primeNum(int num){   //11
        if(num<2){
            return false;
        }

        for(int i = 2; i<num; i++){         //every number can be divisible by 1
            if(num%i==0){           //num%2  num%3   num%4 num%   ---->11
               return false ;
            }
        }
        return true;
    }
}
