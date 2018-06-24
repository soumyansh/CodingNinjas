package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = n;
		while (i <= n && i>=0) {
			int j = 1;
			while (j <= i) {
				System.out.print(j);
				j = j + 1;
			}
			System.out.println();
			i = i - 1;
		}
	}

}
