package InterviewCodingTask;

public class MaxMinNumInArray {
    public static void main(String[] args) {

        int[] nums = {8, 5, 6, 10, 12};
        int max = nums[0];
        int min = nums[0];

        for(int each: nums){
            if(each>max){
                max = each;
            }
            if(each<min){
                min = each;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
