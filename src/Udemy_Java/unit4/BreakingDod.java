package Udemy_Java.unit4;

public class BreakingDod {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(false,2));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay>23) return false;

        if(isBarking && hourOfDay<8 || hourOfDay>22){
            return true;

        }
        return false;
    }
}
