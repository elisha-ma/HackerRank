package sherlock_and_array;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String findPivot(int[] nums, int N) {
      /* Complete this function */
    	int leftSum = 0;
    	int rightSum = 0;
    	
    	if (N == 1) {
    		return "YES";
    	}
    	
    	for (int i = 1; i < N; i++)
    	{
    		rightSum += nums[i];
    	}
    	
    	for(int i = 0; i < N-1; i++) {
    		if (leftSum == rightSum) {
    			return "YES";
    		}
    		
    		leftSum += nums[i];
    		rightSum -= nums[i+1];
    		
    	}
    	
    	return "NO";
    	
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
        
        for (int i = 0; i < T; i++) {
        	int N = Integer.parseInt(in.nextLine());
        	String[] numString = in.nextLine().split(" ");
        	int[] nums = new int[N];
        	for (int j = 0; j < N; j++ ){
        		nums[j] = Integer.parseInt(numString[j]);
        	}
        	
        	System.out.println(findPivot(nums, N));
        }
        
        in.close();
    }
}
