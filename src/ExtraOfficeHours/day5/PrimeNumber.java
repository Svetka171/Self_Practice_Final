package ExtraOfficeHours.day5;

import java.util.ArrayList;

public class PrimeNumber {
    //number div by itself or one
    public static void main(String[] args) {
        int num = 7;
        System.out.println("prime(7) = " + prime(7));
        allPrimesUpTo(100);
    }
    public static boolean prime(int num){
        if(num<1) return false;

        for(int i =2; i<num; i++ ){
            if (num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void allPrimesUpTo(int num){
        ArrayList<Integer> primeNums = new ArrayList<>();

        for(int i=0; i<=num; i++){
            if (prime(i)) {
                primeNums.add(i);
            }else{
                continue;
            }
        }
        System.out.println("primeNums = " + primeNums);
    }
}
