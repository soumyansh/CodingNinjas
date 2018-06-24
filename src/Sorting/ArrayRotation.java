package Sorting;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size of Array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter array elements");
for(int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
System.out.println("Enter places for rotation");
int m=sc.nextInt();
//Rotation
for(int i=1;i<=m;i++) {
	int temp=arr[0];
	for(int j=0;j<arr.length-1;j++) {
	
	arr[j]=arr[j+1];
	
}
	arr[arr.length-1]=temp;	
}
System.out.println("Printing the rotated array");

for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
	
}
	}

}
