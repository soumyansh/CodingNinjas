package lecture3;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useDelimiter("\\s");
		int x = sc.nextInt();
		int n = sc.nextInt();
		int z = 1;
		int i = 1;
		while (i <= n) {
			z = z * x;
			i = i + 1;
		}
		System.out.println(z);
	}

}
