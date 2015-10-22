package mark_and_toys;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void getToys(int[] toys, int N, int K) {
      /* Complete this function */
    	Arrays.sort(toys);
    	
    	int sum = 0;
    	int i;
    	for (i = 0; i < N && sum < K; i++) {
    		sum += toys[i];
    	}
    	
    	System.out.println(i-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] n_k = in.nextLine().split(" ");
        int N = Integer.parseInt(n_k[0]);
        int K = Integer.parseInt(n_k[1]);
        
        String[] toysString = in.nextLine().split(" " );
        int[] toys = new int[N];
        for (int i = 0; i < N; i++ ) {
        	toys[i] = Integer.parseInt(toysString[i]);
        }
        
        getToys(toys, N, K);
        
        in.close();
    }
}
