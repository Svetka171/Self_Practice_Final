package InterviewCodingTask;

import java.security.acl.Owner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Intersection$$$ {
    public static void main(String[] args) {
         /*
        return a Set equal to the intersection of the parameter Sets
     */
        Set<Integer> primeNumbers = new HashSet<>(Arrays.asList(2,3,8));


        Set<Integer> evenNumbers = new HashSet<>(Arrays.asList(2,4,8));


        System.out.println(getIntersection(primeNumbers, evenNumbers));


    }

    public static Set<Integer> getIntersection(Set<Integer> a, Set<Integer> b){
        if (a.size() > b.size()) {
            a.retainAll(b);
            return a;
        } else {
            b.retainAll(a);
            return b;
        }
    }


}
