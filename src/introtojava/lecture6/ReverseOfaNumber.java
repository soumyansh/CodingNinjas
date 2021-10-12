package introtojava.lecture6;

import java.util.Scanner;

public class ReverseOfaNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int orig=n;
	int numberOfDigits=0;
	int rev=0;
	int remainder=0;
	while(n>0) {
		remainder=n%10;
		numberOfDigits=numberOfDigits+1;
		
		n=n/10;
	}
	//System.out.println(numberOfDigits);
	while(orig>0) {
		remainder=orig%10;
		
		rev=(int) (rev+(remainder*(Math.pow(10, numberOfDigits-1))));
		
		orig=orig/10;
		numberOfDigits--;
	}
	System.out.println(rev);
	
}
}
