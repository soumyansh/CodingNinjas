package introtojava.lecture4;

import java.util.Scanner;

public class TriangleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(k);
				k--;
				
			}
			k=i+1;
			System.out.println();
		}
	}
}
