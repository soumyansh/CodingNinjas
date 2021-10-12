package introtojava.test1;

import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int origNum=n;
		int finalNum=n;
		int numOfDigits = 0;
		int remainder = 0;
		int sumOfDigits=0;
		while(n>0) {
			remainder = n%10;
			n=n/10;
			numOfDigits++;
		}
		//System.out.println(numOfDigits);
		while(origNum>0) {
			remainder=origNum%10;
			sumOfDigits=(int) (sumOfDigits+(Math.pow(remainder, numOfDigits)));
			origNum=origNum/10;
			
		}
		if(sumOfDigits==finalNum) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
