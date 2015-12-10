package anagram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int findAnagram(String string) {
      /* Complete this function */
    	int length = string.length();
    	
    	String s1 = string.substring(0, length/2);
    	String s2 = string.substring(length/2, length);
    	
    	int L = s1.length();
    	
    	if (L != s2.length()) {
    		return -1;
    	}

    	int[] counts = new int[26];
    	
    	for(int i = 0; i < L; i++) {
    		counts[s1.charAt(i) - 'a']++;
    	}
    	
    	for(int i = 0; i < L; i++) {
    		counts[s2.charAt(i) - 'a']--;
    	}
    	
    	int count = 0;
    	
    	for(int i = 0; i < 26; i++) {
    		count += Math.abs(counts[i]);
    	}
    	
    	return count/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        
        
        for (int i = 0; i < T; i++ ){
        	System.out.println(findAnagram(in.nextLine()));
        }
        
        
        in.close();
    }
}
