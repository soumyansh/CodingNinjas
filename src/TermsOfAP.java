import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;int count=0;
		while(count<n) {
			int ap_term=(3*i)+2;
			if(ap_term%4==0) {
				i=i+1;
				continue;
			}else {
			
			System.out.print(((3*i)+2)+" ");
			count=count+1;
			}
			i=i+1;
		}
	}

}
