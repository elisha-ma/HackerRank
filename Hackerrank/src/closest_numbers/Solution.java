package closest_numbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void findPair(int[] nums, int N) {
      /* Complete this function */
    	Arrays.sort(nums);
    	ArrayList<Integer> pairs = new ArrayList<Integer>();
    	int min = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < N-1; i++) {
    		int diff = Math.abs(nums[i] - nums[i+1]);
    		if (diff < min) {
    			min = diff;
    			pairs = new ArrayList<Integer>();
    			pairs.add(nums[i]);
    			pairs.add(nums[i+1]);
    		} else if(diff == min) {
    			pairs.add(nums[i]);
    			pairs.add(nums[i+1]);
    		}
    	}
    	
    	StringBuffer out = new StringBuffer();
    	for(int i = 0; i < pairs.size() -1; i++) {
    		out.append(pairs.get(i) +" ");
    	}
    	
    	out.append(pairs.get(pairs.size()-1));
    	
    	System.out.println(out);
    	
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        String[] numString = in.nextLine().split(" ");
        int[] nums = new int[N];
        
        for(int i = 0; i < N; i++) {
        	nums[i] = Integer.parseInt(numString[i]);
        }
        
        findPair(nums, N);
        
        in.close();
    }
}
