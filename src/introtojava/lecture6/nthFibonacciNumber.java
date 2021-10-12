package introtojava.lecture6;

import java.util.Scanner;

public class nthFibonacciNumber {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int n1=1;
	int n2=1;
	int n3=n1+n2;
	if(n<=2) {
		System.out.println(n1);
	}else {
	int i=1;
	while(i<n-2) {
		n1=n2;
		n2=n3;
		n3=n1+n2;
		i++;
	}
	
	System.out.println(n3);
}}

}
