package Array;

import java.util.Scanner;

public class ArrayPrinting {

	public static void main(String[] args) {
int arr[]=takeInput();
printArray(arr);
System.out.println("Largest is "+printLargest(arr));

	}

	public static int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
					
		}
		return arr;
	}
	
	public static void printArray(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int printLargest(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}else {
				continue;
			}
		}
		
		return max;
	}
}
