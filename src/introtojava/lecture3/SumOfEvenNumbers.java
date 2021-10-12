package introtojava.lecture3;

import java.util.Scanner;

public class SumOfEvenNumbers {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			if(i%2==0) {
			sum=sum+i;
			}
			i++;
					
		}
		System.out.println(sum);
}
}
