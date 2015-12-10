package two_strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String hasSubstring(String s1, String s2) {
      /* Complete this function */
    	HashSet<String> set = new HashSet<String>();
    	
    	for (int i = 0; i < s1.length(); i++) {
    		set.add(s1.substring(i, i+1));
    	}
    	
    	for(int i = 0; i < s2.length(); i++) {
    		if (set.contains(s2.substring(i, i+1))) {
    			return "YES";
    		}
    	}
    	
    	return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        
        for (int a = 0; a < T; a++) {
	        
        	String s1 = in.nextLine();
        	String s2 = in.nextLine();
        	
        	System.out.println(hasSubstring(s1, s2));
        }
        
        in.close();
    }
}
