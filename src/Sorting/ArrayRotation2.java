package Sorting;

import java.util.Scanner;

public class ArrayRotation2 {

	public static void rotate(int[] arr,int d) {
//Rotation
for(int i=1;i<=d;i++) {
	int temp=arr[0];
	for(int j=0;j<arr.length-1;j++) {
	
	arr[j]=arr[j+1];
	
}
	arr[arr.length-1]=temp;	
}
	}

}
