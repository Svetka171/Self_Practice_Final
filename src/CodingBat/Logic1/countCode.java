package CodingBat.Logic1;

public class countCode {
    /*

Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.


countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */
    public static void main(String[] args) {
        String str = "cozexxcope";
        System.out.println(countCode(str));

    }

    public static int countCode(String str) { //code
                                              //0123
       int count = 0;
       for(int i=0; i<str.length()-1; i++){
           if(str.substring(i,i+2).equals("co")&&str.charAt(i+3)=='e') count++;
       }
        return count;

    }

}
