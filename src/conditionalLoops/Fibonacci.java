package conditionalLoops;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int n1 = 1, n2 = 1, n3 = 0, i;

		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
		
	}
}