package runningtime;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void insertionSort(int[] nums, int N) {
      /* Complete this function */
    	int count = 0;
    	
    	int insert_index = N-1;
		for(int i = 0; i < N; i++) {
			int to_insert = nums[insert_index];
			boolean inserted = false;
			for(int j = 0; j < N-1; j++) {
				if (to_insert < nums[j]) {
					count++;
					for(int k = insert_index; k > j; k--) {
						nums[k] = nums[k-1];
					}
					nums[j] = to_insert;
					inserted = true;
					break;
				}
			}
			if (!inserted) {
				insert_index--;
			}
		}
		
		printArray(nums);
		System.out.println(count);
    	
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
        int N = Integer.parseInt(in.nextLine());
        
        String[] numString = in.nextLine().split(" " );
        int[] nums = new int[N];
        for (int i = 0; i < N; i++ ) {
        	nums[i] = Integer.parseInt(numString[i]);
        }
        
        insertionSort(nums, N);
        
        in.close();
    }
}
