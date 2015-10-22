package game_of_thrones;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String canBePalindrome(String string) {
      /* Complete this function */
    	HashMap<String, Integer> counts = new HashMap<String, Integer>();
    	for (int i = 0; i < string.length(); i++) {
    		String letter = string.substring(i, i+1);
    		if (counts.get(letter) == null) {
    			counts.put(letter, new Integer(0));
    		}
    		
    		counts.put(letter, counts.get(letter) + 1);
    	}
    	
    	int odds = 0;
    	for (Integer i : counts.values()) {
    		if (i % 2 == 1) {
    			if (odds >= 1) {
    				return "NO";
    			}
    			odds++;
    		}
    	}
    	
    	return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        
        System.out.println(canBePalindrome(string));
        
        in.close();
    }
}
