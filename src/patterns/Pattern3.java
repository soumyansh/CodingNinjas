package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int val=1;
		while(i<=n) {
			int j=n-i;
			int k=1;
			while(k<=j) {
				
				System.out.print(" ");
				k=k+1;
			}
			int l=1;
			while(l<=i) {
				
				System.out.print(val);
				val=val+1;
				l=l+1;
			}
			System.out.println();
			i=i+1;
		}

	}

}
