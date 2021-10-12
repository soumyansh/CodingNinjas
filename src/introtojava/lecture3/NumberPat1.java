package introtojava.lecture3;

import java.util.Scanner;


public class NumberPat1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int k=1;
		while (i <= n) {
			int j = 1;
			k=i;
			while (j <= i) {
				System.out.print(k);
				j++;
				
				k++;
			}
			System.out.println();
			i++;
			
		}

	}
}
