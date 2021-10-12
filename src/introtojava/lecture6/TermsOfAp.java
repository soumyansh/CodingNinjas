package introtojava.lecture6;

import java.util.Scanner;

public class TermsOfAp {
	public static void main(String[] args) {
		int numberOfTerms = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		while(true) {
			if((3*i+2)%4==0) {
				i++;
				continue;
			}else {
				numberOfTerms++;
				
				System.out.print((3*i+2));
				System.out.print(" ");
				i++;
			}
			if(numberOfTerms==n) {
				break;
			}
		}

	}

}
