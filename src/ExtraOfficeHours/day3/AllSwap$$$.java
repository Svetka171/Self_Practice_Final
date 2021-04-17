package ExtraOfficeHours.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class AllSwap$$$ {
    public static void main(String[] args) {

    }
    /*

We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows:
if a string matches an earlier string in the array, swap the 2 strings in the array.
 When a position in the array has been swapped, it no longer matches anything.
 Using a map, this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
     */

    public String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new LinkedHashMap<>(); //helps to keep track of each
            //  a        1

        for(int i = 0; i<strings.length; i++){
            char key = strings[i].charAt(0);
            if(!map.containsKey(key)){
                map.put(key, i); //i = position to remember    put(a, ab)
            }else{

                String temp = strings[i];               // temp = ac
                strings[i] = strings[map.get(key)];      //i = ac
                strings[map.get(key)] = temp;            // ab
                map.remove(key);                        //remove because 2 switched
            }
        }

       return strings;
    }
}
