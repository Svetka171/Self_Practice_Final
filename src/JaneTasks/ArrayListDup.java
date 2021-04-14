package JaneTasks;

import java.util.*;

public class ArrayListDup {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,4,5));
        System.out.println(list);

        System.out.println("list.stream().distinct().count() = " + list.stream().distinct().count());


    }
}
