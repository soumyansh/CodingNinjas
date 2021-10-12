package introtojava.lecture6;

import java.util.Scanner;

public class AllPrimeNumbers {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <=n; i++) {
			checkPrime(i);	
		}
		
		
	}
	public static void checkPrime(int n) {
		int count=0;
		for (int i = 2; i <n; i++) {
			if(n%i==0) {
				count=count+1;
				break;	
			}else {
				continue;
			}
		}
		if(count==0) {
			System.out.println(n);
		}
	}
	
	
}
