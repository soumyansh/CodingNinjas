package introtojava.lecture10;

import java.util.Scanner;

public class rowWiseSum {
	public static void main(String[] args) {

	}

	public static void rowWiseSum(int[][] mat) {
		// 1,2,3
		// 4,5,6
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			int rowSum = 0;
			for (int j = 0; j < cols; j++) {
				rowSum=rowSum+arr[i][j];
			}
			System.out.print(rowSum+"");
		}

	}
}
