package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Enter size of Array
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		// input array
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		// Enter element to be searched
		System.out.println("Enter element to be searched");
		int number = sc.nextInt();
		// Binary Search
		int first = 0;
		int last = arr.length - 1;
		
		while (first <= last) {
			int mid = (first + last) / 2;
			if (arr[mid] < number) {
				first=mid+1;
			}else if(arr[mid]>number) {
				last=mid-1;
			}else if(arr[mid]==number) {
				System.out.println("Element is found at index number "+mid);
				break;
			}
			}
		if(first>last)
		System.out.println("Element not found");
		}
	}


