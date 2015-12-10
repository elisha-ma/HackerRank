package quicksort2;

import java.util.*;
public class Solution {
       
          static void quickSort(int[] ar) {
              int length = ar.length;
              if (length == 0 || length == 1)
                  return;
              
              
              int pivot = ar[length/2];
              int i = 0;
              int j = length-1;
              
              while(i <= j) {
                  while(ar[i] < pivot) {
                      i++;
                  }
                  
                  while (ar[j] > pivot) {
                      j--;
                  }
                  
                  if (i <= j) {
                      int temp = ar[i];
                      ar[i] = ar[j];
                      ar[j] = temp;
                      i++;
                      j--;
                  }
                  
                  int[] left = Arrays.copyOfRange(ar, 0, i);
                  quickSort(left);
                  int[] right = Arrays.copyOfRange(ar, j, length - 1);
                  quickSort(right);
                  
                  
                  printArray(left);
                  printArray(right);
                      
              }
              
              
              
              
                  
                
                    
       }   
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar);
       }    
   }
