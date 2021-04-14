package InterviewCodingTask;

public class FinRa {
    public static void main(String[] args) {
        finra();
    }

    public static void finra(){

        for(int i =0; i<=30; i++){
            if(i%3==0 && i%5==0){
                System.out.print("FINRA ");
            }else if(i%5==0){
                System.out.print("RA ");
            }else if(i%3==0){
                System.out.print("FIN ");
            }
        }
    }
}
