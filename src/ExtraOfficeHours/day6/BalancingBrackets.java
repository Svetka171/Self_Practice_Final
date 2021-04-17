package ExtraOfficeHours.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancingBrackets {
    public static void main(String[] args) {
        String str = "{([])}";  //"{([})}" incorrect;
    }

    public static boolean isBalances(String str){
        String open = "{[(";

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');

        for(int i=0; i<str.length(); i++){
            if(open.contains("" + str.charAt(i))){
                //means opening bracket
                stack.push(str.charAt(i));  //Stuck LIFO { ( [

            }else{
                //means closing bracket               //{
                if( stack.isEmpty() || str.charAt(i)   != map.get(   stack.pop()  )) {   //  ]  ==  ]
                    return false;
                }//  )  ==)
            }
        }
            return true;
    }

}
