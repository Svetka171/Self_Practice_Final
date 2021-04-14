package ExtraOfficeHours.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class removeDuplicates {
    //method that except int of ArrayList and removes dupl;
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,4,4,5,6,6));

        System.out.println("removeDupl(nums) = " + removeDupl(nums));
        System.out.println(removeDupl2(nums));

    }

    public static ArrayList<Integer> removeDupl(ArrayList<Integer> num){
        ArrayList<Integer> unique = new ArrayList<>();

        for(int each: num){
            if(unique.contains(each)) continue;
            else unique.add(each);
        }
        return unique;
    }


    public static ArrayList<Integer> removeDupl2(ArrayList<Integer> num){
       return new ArrayList<>(new LinkedHashSet<>(num)); //have to create ArrayList since we want to return ArrayList
    }
}
