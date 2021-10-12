package introtojava.lecture5;

import java.util.Scanner;

public class DiamondOfStars {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int n1=(n+1)/2;
		int n2=(n-1)/2;
		int decNum=2*n2-1;
		//Loop1
		for (int i = 1; i <=n1; i++) {
			//Spaces
			for (int j = 1; j <=n1-i; j++) {
				System.out.print(" ");
			}
			//Numbers
			for (int j = 1; j <=(2*i-1); j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		//Loop2
		for (int i = 1; i <=n2; i++) {
			//spaces
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			//numbers
			for (int j = 1; j <=decNum; j++) {
				System.out.print("*");
				
			}
			decNum=decNum-2;
			System.out.println();
		}
	}

}
