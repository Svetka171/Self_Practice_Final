package ExtraOfficeHours.day5;

import java.util.Arrays;

public class SecondMaxNum {
    public static void main(String[] args) {
        int[] nums = {8,2,5,9};
        System.out.println("secondMax(nums) = " + secondMax(nums));
        System.out.println("secondMax2(nums) = " + secondMax2(nums));
        System.out.println("secondMax2(nums) = " + secondMax2(nums));
    }

    public static int secondMax(int[] nums){
        int secondMax = 0; //but doesnt work with dupl

        Arrays.sort(nums);


        return nums[nums.length-2];

    }

    public static int secondMax2(int[] arr){
        int max = arr[0];   //  or we can use Integer.MIN_VALUE
        int second = arr[0];

        for(int each:arr){    //3>max true 5>3 true but first store 1st number to second
            if(each>max){
                second=max;
                max = each;
            }
            if(each>second && each<max){
                second=each;
            }

        }
        return second;
    }
}
