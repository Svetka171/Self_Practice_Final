package CodingBat.Logic1;

public class doubleChar {
    /*

Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public static void main(String[] args) {
        String str = "Hello";
        String result = "";

        for(String each: str.split("")){
            result+=each + each;
        }

        System.out.println(result);

    }
}
