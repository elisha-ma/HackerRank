package string_similarity;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void stringSimilarity(String a) {
      /* Complete this function */
    	int N = a.length();
    	int[] z = new int[N];
    	z[0] = N;
    	int L = 0;
    	int R = 0;
    	
    	for(int i = 1; i < N; i++) {
    		if (i <= R) {
    			z[i] = Math.min(z[i - L], R - i + 1);
    		} 
    		while (z[i] + i < N && a.charAt(z[i]) == a.charAt(z[i] + i)) {
    			z[i]++;
    		}
    		
    		
    		if (i + z[i] - 1 > R) {
    			L = i;
    			R = i + z[i] - 1;
    		}
    	}
    	
    	//printArray(z);
    	
    	long sum = 0;
    	for (int i = 0; i < N; i++) {
    		sum += z[i];
    	}
    	
    	System.out.println(sum);
    }

    static void printArray(int[] array) {
    	StringBuffer string = new StringBuffer();
    	for (int i = 0; i < array.length; i++) {
    		string.append(array[i] + " ");
    	}
    	
    	System.out.println(string);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        
        for (int a = 0; a < T; a++) {
	        stringSimilarity(in.nextLine());
        }
        
        in.close();
    }
}
