package introtojava.lecture8;

import java.util.Scanner;

public class ArraysSum {
	public static void main(String[] args) {
	
	}
	
	public static int sum(int[] arr) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
}
