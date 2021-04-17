package Udemy_Java.unit4;

public class MegaBytesConvert {
    public static void main(String[] args) {
       printMegaBytesAndKiloBytes(2500);


    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if(kiloBytes <0){
            System.out.println("Invalid Value");
        }else{
            int convertBytes = kiloBytes;
            int megaByte = (convertBytes / 1024);
            int remainingkiloByte = (convertBytes % 1024);
            System.out.println(convertBytes + " KB = " + megaByte + " MB and " + remainingkiloByte + " KB");
        }
    }
}
