package introtojava.lecture6;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long n = sc.nextLong();
	long remainder = 0;
	ArrayList<Long>li=new ArrayList<Long>();
	while(n>0) {
		remainder=n%2;
		li.add(remainder);
		n=n/2;
	}
	for (int i = li.size()-1; i >=0 ; i--) {
		System.out.print(li.get(i));
	}
}

}
