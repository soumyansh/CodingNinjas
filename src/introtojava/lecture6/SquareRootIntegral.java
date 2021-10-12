package introtojava.lecture6;

import java.util.Scanner;

	public class SquareRootIntegral {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int ans=0;
		for (int i = 1; i <n; i++) {
			if(i*i>n) {
				ans=i-1;
				break;
			}
		}
		System.out.println(ans);
	}
}
