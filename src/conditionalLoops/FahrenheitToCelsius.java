package conditionalLoops;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int S=sc.nextInt();
	int E=sc.nextInt();
	int W=sc.nextInt();
	

		while(S<=E) {
			int C=((S-32)*(5))/9;
			System.out.println(S+"\t"+C);
			S=S+W;
		}
		
	}

}
