package arrays_dsdfdf;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        
        String[] arrayString = in.nextLine().split(" ");
        System.out.print(arrayString[N-1]);
        for (int i = N-2; i >= 0; i--) {
        	System.out.print(" " + arrayString[i]);
        }
        
        
        
        in.close();
    }
}
