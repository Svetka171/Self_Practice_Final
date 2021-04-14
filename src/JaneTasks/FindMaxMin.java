package JaneTasks;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr1 = {7,2,8,6,3};

        int max = arr1[0]; //9
        int min = arr1[0]; //9


        for(int each: arr1){
            if(each>max){
                max=each;
            }

            if(each<min){
                min = each;
            }
        }

        System.out.println(max);
        System.out.println(min);

    }
}
