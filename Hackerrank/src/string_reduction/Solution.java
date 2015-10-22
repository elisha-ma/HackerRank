package string_reduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void stringReduction(String a) {
      /* Complete this function */
    	StringBuilder aString = new StringBuilder(a);
    	HashMap<String, String> mapping = new HashMap<String, String>();
    	mapping.put("ab", "c");
    	mapping.put("ba", "c");
    	mapping.put("ac", "b");
    	mapping.put("ca", "b");
    	mapping.put("bc", "a");
    	mapping.put("cb", "a");
    	
    	boolean replaced = true;
    	
    	while (replaced) {
    		System.out.println("ASTRING: " + aString.toString());
	    	int i = 0;
	    	replaced = false;
			while(i < aString.length() - 1) {
	    		if (aString.charAt(i) != aString.charAt(i+1)) {
	    			aString.replace(i, i+2, mapping.get(aString.substring(i, i+2)));
	    			replaced = true;	
	    			break;
	    		} else {
	    			i++;
	    		}
	    		
			}
    	}
    	
    	
    	System.out.println(aString.length());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        
        for (int a = 0; a < T; a++) {
	        stringReduction(in.nextLine());
        }
        
        in.close();
    }
}
