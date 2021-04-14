package RuslanaPractice;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int max = arr[0];
        for(int each:arr){
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);
    }
}
