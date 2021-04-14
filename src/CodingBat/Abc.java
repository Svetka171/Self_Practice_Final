package CodingBat;

public class Abc {
    public static void main(String[] args) {
        /*

Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
         */
        System.out.println(countAbc("abcxxabc"));

    }

    public static int countAbc(String str) {
        if(str.length()<3) return 0;
        if(str.substring(0,3).equals("aba")||str.substring(0,3).equals("abc")) return 1 + countAbc(str.substring(3));
        else
            return 0+ countAbc(str.substring(1));

    }
}
