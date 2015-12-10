package find_median_1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static LinkedList<Integer> minHeap = new LinkedList<Integer>();
	static LinkedList<Integer> maxHeap = new LinkedList<Integer>();
	
    static void findMedian() {
    	int sizeMinHeap = minHeap.size();
    	int sizeMaxHeap = maxHeap.size();
    	float median;
    	if (sizeMinHeap == sizeMaxHeap ) {
    		median = ((float) minHeap.peek() + maxHeap.peek()) / 2;
    	} else if (sizeMinHeap > sizeMaxHeap) {
    		median = minHeap.peek();
    	} else
    		median = maxHeap.peek();
    	
    	System.out.format("%.1f%n", median);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        
        for (int i = 0; i < N; i++ ){
        	insert(Integer.parseInt(in.nextLine()));
        	findMedian();
        }
        
        in.close();
    }
    
    static void insert(int n) {
    	if (minHeap.isEmpty()) {
    		minHeap.add(n);
    		return;
    	} else if (maxHeap.isEmpty()) {
    		if (minHeap.peek() < n) {
    			maxHeap.add(minHeap.pop());
    			minHeap.add(n);
    		} else
    			maxHeap.add(n);
    		return;
    	}
    	
    	if (n > minHeap.get(0)) {
    		insertIntoMinHeap(n);
    	} else {
    		insertIntoMaxHeap(n);
    	}
    	
    	int sizeMinHeap = minHeap.size();
    	int sizeMaxHeap = maxHeap.size();
    	
    	if (Math.abs(sizeMinHeap - sizeMaxHeap) > 1) {
    		if (sizeMinHeap > sizeMaxHeap) {
    			maxHeap.add(0, minHeap.pop());
    		} else
    			minHeap.add(0, maxHeap.pop());
    	}
    }
    
    static void insertIntoMinHeap(int n) {
    	
    	boolean inserted = false;
    	int i = 0;
    	while (n < minHeap.size()) {
    		if (minHeap.get(i) > n) {
    			minHeap.add(i-1, n);
    			inserted = true;
    			break;
    		}
    		i++;
    	}
    	
    	if (!inserted) {
    		minHeap.add(n);
    	}
    }
    
    static void insertIntoMaxHeap(int n) {
    	boolean inserted = false;
    	int i = 0;
    	while(i < maxHeap.size()) {
    		if (maxHeap.get(i) < n) {
    			maxHeap.add(i, n);
    			inserted = true;
    			break;
    		}
    		i++;
    	}
    	
    	if (!inserted) {
    		maxHeap.add(n);
    	}
    }
    
}
