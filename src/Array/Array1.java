package Array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int arr[] = inputArray();
		System.out.println(SumOfArrayElements(arr));
	}

	public static int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static int SumOfArrayElements(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
