package Array;

import java.util.Scanner;

public class UniqueInArray2 {

	public static int findUnique(int[] arr) {
		int finalNumber = 0;
		for(int j=0;j<arr.length;j++) {
			int counter=0;
			for(int k=0;k<arr.length;k++) {
				
				if(arr[j]==arr[k]) {
					counter=counter+1;
					
				}else
					continue;
				
				
			}
			
			if(counter==1) {
		finalNumber=arr[j];
			}
		}
		return finalNumber;
		

	}

}
