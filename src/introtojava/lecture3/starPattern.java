package introtojava.lecture3;

import java.util.Scanner;

public class starPattern {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n - 1;
		int l = 1;
		// spaces
		int rowNum = 0;
		for (int i = n - 1; i >= 0; i--) {
			rowNum++;
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			// code for numbers
			//k first val is 3
			for (int j = 1; j <= n - k; j++) {

				System.out.print("*");
				l++;

			}

			k=k-2;
			l = rowNum + 1;
			System.out.println();
		}

	}
}
