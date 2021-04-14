package InterviewCodingTask;

public class BinaryRepresentation {
    public static void main(String[] args) {
        int num= 15;    //  6/2 = 0    3/2=1   1/2 = 1    in reverse order is the answer

        System.out.println("binary(num) = " + binary(num));
    }

    public static int binary(int num){
        String s = "";

        while(num!=0){
            s += ((num % 2) == 0 ? "0" : "1");
            num = num/2;
        }

        int count = 0;
        for (char each : s.toCharArray()) {
            if (each == '1') {
                count++;
            }
        }

        return count;
    }
}
