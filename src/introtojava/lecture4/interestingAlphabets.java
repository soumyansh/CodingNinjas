package introtojava.lecture4;

import java.util.Scanner;

public class interestingAlphabets {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int k=2;
	char StartChar=(char)(64+n);
	for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(StartChar);
			StartChar++;
		}
		System.out.println();
		k=k+2;
		StartChar=(char)(66+i+n-k);
		//System.out.println("Start char is "+StartChar);
	}
}
}
