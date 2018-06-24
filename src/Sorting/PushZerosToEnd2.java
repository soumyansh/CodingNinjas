package Sorting;

import java.util.Scanner;

public class PushZerosToEnd2 {

	public static void pushZerosAtEnd(int[] arr) {
		//Pushing zero's to end
		int k = 0,l=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[k]==0 && k<arr.length) {
				
				k++;
			}else
				{
			arr[l]=arr[k];
			l++;
			k++;
			}
		}
for(int i=l;i<arr.length;i++) {
	arr[i]=0;
}		
		
		
	}

}
