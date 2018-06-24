import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		int EvenSum=0;
		int OddSum=0;
		while(n>0) {
			i=n%10;
		if(i%2==0) {
			EvenSum=EvenSum+i;
		}else {
			OddSum=OddSum+i;
		}
			n=n/10;
		
		}
System.out.println(EvenSum+" "+OddSum);
	}

}
