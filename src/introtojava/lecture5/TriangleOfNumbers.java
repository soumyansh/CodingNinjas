package introtojava.lecture5;

import java.util.Scanner;

public class TriangleOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int incNum = 1;
		int decNum = 0;
		for (int i = 1; i <= n; i++) {
			// Spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// Increasing Numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(incNum);
				incNum++;

			}

			// Decreasing Numbers
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(decNum);
				decNum--;
			}
			// Line change
			incNum = i + 1;
			decNum = 2 * i;
			System.out.println();
		}
	}
}
