package InterviewCodingTask;

public class SumOfIntegers$$$ {
    public static void main(String[] args) {
        String str = "3a    bd 7";  //37
        System.out.println("sum(str) = " + sum(str));
    }

    public static int sum(String str){

        int sum = 0;
                                                //non digit
        String[] numbers = str.replaceAll("[\\D]+"," ").split(" ");

        for(String each : numbers){ //"3","7"
            sum+=Integer.parseInt(each);//37
        }

        return sum;

    }
}
