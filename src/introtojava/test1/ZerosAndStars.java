package introtojava.test1;

import java.util.Scanner;

public class ZerosAndStars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = n; // middle fix
		int firstIndex = 0;
		int lastIndex = 2*n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n + 1; j++) {
				if(j==k) {
					System.out.print("*");
				}else if(j==firstIndex || j==lastIndex) {
					System.out.print("*"); 
				}
				else {
					System.out.print(0);	
				}
				
			}
			System.out.println();
			firstIndex++;
			lastIndex--;
		}
	}
}
