package Array;

import java.util.Scanner;

public class ArrayQ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input Array
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	    //printing array	
for(int j=0;j<arr.length;j++) {
	System.out.print(arr[j]+" ");
}
System.out.println();
//Swapping
for(int k=0;k<arr.length;k=k+2) {
	
	int w=arr[k];
	if(k==arr.length-1) {
		continue;
	}
	else
	arr[k]=arr[k+1];
	arr[k+1]=w;
}

for(int l=0;l<arr.length;l++) {
	System.out.print(arr[l]+" ");
}
		
	}
	}
