package patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		while (i <= n) {
			int j = 1;
			while (j <= n) {
				if (i == j) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
				j = j + 1;
			}
			System.out.print("*");
			int k = 1;
			while (k <=n) {
			if(k==(n-(i-1))) {
				System.out.print("*");
			}else {
				System.out.print("0");
			}
				k = k + 1;
			}
			System.out.println();
			i++;
		}

		
		
	}

}
