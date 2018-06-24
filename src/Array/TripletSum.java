package Array;

import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Array Size input
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Triplet Sum number");
		//PairSum Number
		int pairSum=sc.nextInt();
		//Input the array
		System.out.println("Enter the array  ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
        for(int j=0;j<arr.length;j++) {
        	for(int k=j+1;k<arr.length;k++) {
        		for(int l=k+1;l<arr.length;l++) {
        		if(arr[j]+arr[k]+arr[l]==pairSum) {
        			if(arr[j]<=arr[k] && arr[j]<=arr[l]) {
        				if(arr[k]<=arr[l]) {
        			System.out.print(arr[j]+" "+arr[k]+" "+arr[l]);
        			System.out.println();
        				}else {
        					System.out.print(arr[j]+" "+arr[l]+" "+arr[k]);
                			System.out.println();
        					
        				}
        			}
        			
        			else if(arr[k]<=arr[j] && arr[k]<=arr[l]) {
        				if(arr[j]<=arr[l]) {
        			System.out.print(arr[k]+" "+arr[j]+" "+arr[l]);
        			System.out.println();
        				}else
        					System.out.print(arr[k]+" "+arr[l]+" "+arr[j]);
            			System.out.println();
        			}
        		
        			else if(arr[l]<=arr[j] && arr[l]<=arr[k]) {
        				if(arr[j]<=arr[k]) {
        			System.out.print(arr[l]+" "+arr[j]+" "+arr[k]);
        			System.out.println();}
        				else {
        					System.out.print(arr[l]+" "+arr[k]+" "+arr[j]);
                			System.out.println();}
                			
        				}
        			else if(arr[j]==arr[k] && arr[j]==arr[l]) {
        				System.out.print(arr[l]+" "+arr[j]+" "+arr[k]);
            			System.out.println();}
        			}

        		else
        			continue;
        	}}
        }
	}}

