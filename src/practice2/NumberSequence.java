package practice2;

import java.util.Scanner;

public class NumberSequence {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int prev=sc.nextInt();
	int count=2;
	int current;
	boolean isDec=true;
	while(count<=n) {
		current=sc.nextInt();
		count++;
		if(current==prev) {
			System.out.println("false");
			return;
		}
		else if(current<prev) {
			if(isDec==false) {
				System.out.println("false");
				return;
			}
		}else {
			if(isDec==true) {
				isDec=false;
			}
		}
		prev=current;
	}
System.out.println("true");
	}

}
