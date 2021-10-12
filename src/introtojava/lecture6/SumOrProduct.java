package introtojava.lecture6;

import java.util.Scanner;

public class SumOrProduct {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
	int choice = sc.nextInt();
	int sum=0;
	int prod=1;
	if(choice==1) {
		for (int i = 1; i <=n; i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}else if(choice==2) {
		for (int i = 1; i <=n; i++) {
			prod=prod*i;
			
		}
		System.out.println(prod);
	}else {
		System.out.println(-1);
	}
}
}
