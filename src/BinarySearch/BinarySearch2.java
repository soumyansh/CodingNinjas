package BinarySearch;

import java.util.Scanner;

public class BinarySearch2 {

	public static int binarySearch(int[] arr,int num) {
				int first = 0;
		int last = arr.length - 1;
		
		while (first <= last) {
			int mid = (first + last) / 2;
			if (arr[mid] < num) {
				first=mid+1;
				if(first>last)
					return -1;
			}else if(arr[mid]>num) {
				last=mid-1;
				if(first>last)
					return -1;
			}else if(arr[mid]==num) {
				return mid;
			
			}
			}
		return -1;
		
		
		}
	
	}


