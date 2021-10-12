package introtojava.lecture9;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		System.out.println(secondLargestElement(new int[] { 90,8,90,5 }));
	}

	public static int secondLargestElement(int[] arr) {
		if (arr.length <= 1) {
			return -2147483648;
		}
		int min = (int) Double.POSITIVE_INFINITY;
		Arrays.sort(arr);
	
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < min) {
				min = arr[i];
	
				count++;
			}
			if (count == 2) {
				return min;
			}

		}
		if (count == 1) {
			return -2147483648;
		}
		return -2147483648;

	}

}
