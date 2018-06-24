import java.util.Scanner;

public class PrimeBetweenTwo {

	public static void main(String[] args) {

		int s1, s2, flag = 1, i, j;
		Scanner s = new Scanner(System.in);

		s1 = s.nextInt();
		
		for (i = 2; i <= s1 && s1 <= 100 && s1 >= 1; i++) {
			for (j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {

				System.out.println(i);
			}
		}
	}

}
