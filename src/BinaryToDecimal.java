import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		int i=1;
		int Sum=0;
		while(n>0 && i>0) {
			r=n%10;
			Sum=Sum+(r*i);
			//System.out.println(r);
			n=n/10;
			i=i*2;
		}
System.out.println(Sum);
	}

}
