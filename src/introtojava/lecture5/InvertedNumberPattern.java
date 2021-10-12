package introtojava.lecture5;

import java.util.Scanner;

public class InvertedNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k =n;
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(k);
			}
			System.out.println();
			k--;
		}
	}
}
