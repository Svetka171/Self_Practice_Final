package InterviewCodingTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Remove_Ahmed {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(Arrays.asList("Ahmed", "Sasha", "Dima", "Ahmed", "Jane"));
        removeAhmed(arr);
        System.out.println("removeAhmed2(arr) = " + removeAhmed2(arr));

    }

    public static void removeAhmed(List<String> arr){

        arr.removeIf(name-> name.equals("Ahmed"));
        System.out.println("arr = " + arr);
    }

    public static List<String> removeAhmed2(List<String> arr){
        Iterator<String> names = arr.iterator();
        while(names.hasNext()){
            if(names.next().equals("Ahmed")){
                names.remove();
            }
        }
        return arr;
    }


}
