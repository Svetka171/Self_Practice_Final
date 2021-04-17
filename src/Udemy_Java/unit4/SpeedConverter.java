package Udemy_Java.unit4;

public class SpeedConverter {
    public static void main(String[] args) {
        System.out.println("toMilesPerHour(10) = " + toMilesPerHour(10));

    }
    public static long toMilesPerHour(double kilometersPerHour ){

        if(kilometersPerHour<0){
            return -1;
        }
       return (long) (0.6*kilometersPerHour);


    }
}
