package patterns;

import java.util.Scanner;

public class Pattern4 {
public static void main(String[] args) {
	int i=1;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(i<=n) {
		
		int k=i;
		int j=1;
		while(j<=i) {
			System.out.print(k);
			j=j+1;
			k=k+1;
		}
		System.out.println();
		i=i+1;
	}
}
}
