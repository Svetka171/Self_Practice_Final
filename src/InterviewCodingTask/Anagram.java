package InterviewCodingTask;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println("anagram(str1,str2) = " + anagram(str1, str2));
    }

    public static boolean anagram(String str1, String str2){

        Set<String> set1  = new TreeSet<String>(Arrays.asList(str1.split("")));
        Set<String> set2  = new TreeSet<String>(Arrays.asList(str2.split("")));

       return set1.equals(set2);
    }
}
