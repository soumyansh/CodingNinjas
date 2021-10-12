package introtojava.lecture6;

import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n = sc.nextLong();
	long number=0;
	long rem=0;
	long i =0;
	while(n>0) {
		rem=n%2;
		number =  (long) (number + (rem*(Math.pow(10, i))));
		n=n/2;
		i++;
	}
	System.out.println(number);
}
}
