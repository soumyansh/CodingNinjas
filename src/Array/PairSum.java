package Array;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Array Size input
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the pair Sum number");
		//PairSum Number
		int pairSum=sc.nextInt();
		//Input the array
		System.out.println("Enter the array  ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
        for(int j=0;j<arr.length;j++) {
        	for(int k=j+1;k<arr.length;k++) {
        		if(arr[j]+arr[k]==pairSum) {
        			if(arr[j]>arr[k]) {
        			System.out.print(arr[k]+" "+arr[j]);
        			System.out.println();
        			}
        			else if(arr[j]<arr[k]) {
        			System.out.print(arr[j]+" "+arr[k]);
        			System.out.println();
        			}
        		}else if(arr[j]==arr[k]) {
        			System.out.print(arr[j]+" "+arr[k]);
        			System.out.println();
        		}
        		else
        			continue;
        	}
        }
	}

}
