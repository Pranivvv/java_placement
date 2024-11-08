
import java.util.*; 
import java.io.*;
class cc {
    public static String StringScramble(String str1, String str2) {
    // code goes here
    //    String bol = "true";
    //     char[] ar1 = str1.toCharArray();
    //     char[] ar2 = str2.toCharArray();

    //     for(int i=0; i<str2.length(); i++){
    //         for(int j=0; j<=str1.length(); j++){
    //             if()
    //         }
    //     }

    //     return bol;
        HashMap<Character, Integer> letters = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (!letters.containsKey(c) || letters.get(c) == 0) {
                return "false";
            } else {
                letters.put(c, letters.get(c) - 1);
            }
        }

        return "true";

    }
    public static void main (String[] args) { // keep this function call here
        Scanner s = new Scanner(System.in); 
        System.out.print(StringScramble("rkqodlw", "worfyld"));
    }
}