package JaneTasks;

public class FINRA {
    public static void main(String[] args) {
        System.out.println(Finra(15));

    }

    public static String Finra(int num){
        String result = "";


            if(num%3==0 && num%5==0){
                result+="FINRA ";
            }else if(num%3==0){
                result+="FIN ";
            }else if(num%5==0){
                result+="RA ";
            }else{
                result= String.valueOf(num);
            }

       return  result;

    }
}
