package Array;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		// Finding Second Largest
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>largest) {
			secondLargest=largest;
			largest=arr[j];
			}else if(arr[j]==largest) {
				continue;
			}else if(arr[j]<largest) {
				if(arr[j]>secondLargest) {
					secondLargest=arr[j];
				}
			}
		}
		System.out.println("Second largest is "+secondLargest);
	}

}
