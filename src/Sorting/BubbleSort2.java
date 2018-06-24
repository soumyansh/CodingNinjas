package Sorting;

import java.util.Scanner;

public class BubbleSort2 {

public	static int secondLargestElement(int[] arr) {  
        int n = arr.length;  
        if(n<=1) {
        	return -2147483648;
        }
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                          }}}  
         if(arr[0]==arr[arr.length-1]) {
        	 return -2147483648;
         }else
                          return arr[arr.length-2];
                 }  
         public static void main(String[] args) {
			int[] arr= {9,3,6,2,9};
			System.out.println(secondLargestElement(arr));
		}
	
		}


