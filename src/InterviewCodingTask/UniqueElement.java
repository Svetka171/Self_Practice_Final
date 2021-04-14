package InterviewCodingTask;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,5,5,7};
        System.out.println("firstUnique(arr) = " + firstUnique(arr));

    }


    public static int firstUnique(int[] arr){
        int unique = 0;

            for(int each: arr){ //2
                 int count =0;
                 for(int each2: arr) {
                    if (each == each2) {
                     count++;
                 }
             }
                if(count<2) {
                 unique = each;
                 break;
                }
            }


      return unique;
    }

}
