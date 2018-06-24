package Array;

import java.util.Scanner;

public class Sort012_2 {

	public static void sort012(int[] arr) {
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
count0=count0+1;
			}else if(arr[j]==1) {
				count1=count1+1;				
			}else if(arr[j]==2) {
				count2=count2+1;
			}else
					continue;
		
		}
		
		for(int i=0;i<=count0-1;i++) {
			arr[i]=0;
		}
		for(int j=count0;j<=count1+count2-1;j++) {
			arr[j]=1;
		}
		for(int k=count2;k<=arr.length-1;k++) {
			arr[k]=2;
		}
		
	}

}
