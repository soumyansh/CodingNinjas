package introtojava.lecture9;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = new int[] { -1, 22, -1, 0, 7, 2, 1, 5, 6, };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		Arrays.sort(arr);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j+1 < arr.length; j++) {
				if(arr[j+1]<arr[j]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}else {
					continue;
				}
			}
		}
	}
}