package Array;

import java.util.Scanner;

public class SecondLargest2 {

	public static int secondLargestElement(int[] arr) {
		if((arr.length<=1)||(arr[0]==arr[arr.length-1])) {
			return -2147483648;
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
		return secondLargest;
	}

}
