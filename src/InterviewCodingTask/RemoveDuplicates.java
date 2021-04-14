package InterviewCodingTask;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,8,7};

        System.out.println("removeDupl(arr) = " + Arrays.toString(removeDupl(arr)));
        System.out.println(Arrays.toString(noDupl(arr)));
    }

    public static int[] removeDupl(int[] arr){
      List<Integer> noDupl = new ArrayList<>();

      for(int each: arr){
          if(!noDupl.contains(each)){
              noDupl.add(each);
          }
      }

      int[] newArray = new int[noDupl.size()];
      int j=0;
      for(int each: noDupl){
          newArray[j++] = each;
      }
        return newArray;
    }

    public static int[] noDupl(int [] arr){
        return Arrays.stream(arr).distinct().toArray();
    }
}
