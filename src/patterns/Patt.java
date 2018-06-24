package patterns;

import java.util.Scanner;

public class Patt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
int n2=n;
int n3=n;
int digitCount=0;
int newNumber=0;
	while(n>0) {

		int rem=n%10;
		
		digitCount=digitCount+1;
		
		n=n/10;
	}


while(n2>0) {
int rem=n2%10;
newNumber=newNumber+(int) Math.pow(rem, digitCount);
n2=n2/10;
}
if(newNumber==n3) {
System.out.println("true");
}else
	System.out.println("false");

}

}
