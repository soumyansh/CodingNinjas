package introtojava.lecture6;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int number=0;
		int i=0;
		int remainder = 0;
		while(n>0) {
			remainder= n%10;
			number = (int) (number+remainder*(Math.pow(2, i)));
			n=n/10;
			i++;
		}
		System.out.println(number);
	}
}
