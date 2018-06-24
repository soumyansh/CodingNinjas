package Sorting;

import java.util.Scanner;

public class InsertionSort {  
    public static void insertionSort(int arr[]) {  
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int arr1[]=new int[n];
    	for(int i=0;i<a.length;i++) {
    		arr1[i]=sc.nextInt();
    	}
             
            
        insertionSort(arr1);//sorting array using insertion sort    
           
            
    }    
}    