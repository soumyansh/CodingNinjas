import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long remainder;
		int divisor;
		StringBuilder s=new StringBuilder();
		while(n>0) {
			remainder=n%2;
			s=s.append(remainder);
			
			n=n/2;
		}
System.out.println(s.reverse());
	}

}
