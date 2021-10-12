package introtojava.lecture3;

import java.util.Scanner;

public class FarenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int step = sc.nextInt();
		while(start<=end) {
			System.out.print(start+" "+(5)*(start-32)/9);
			System.out.println();
			
			start=start+step;
		}
	}

}
