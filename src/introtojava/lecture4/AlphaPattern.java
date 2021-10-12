package introtojava.lecture4;

import java.util.Scanner;

public class AlphaPattern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	char startChar='A';
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print((char)startChar);
			startChar++;
		}
		startChar=(char)(65+i);
		System.out.println();
	}
}
}
