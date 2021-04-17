package Udemy_Java.unit4;

public class DecimalComparator{
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
       int  num100 =(int) (num1 *1000);
       int  num200 =(int) (num2 *1000);

        System.out.println(num100 );
        System.out.println(num200);

        if(num100 == num200){
            return true;
        }

        return false;
    }
}
