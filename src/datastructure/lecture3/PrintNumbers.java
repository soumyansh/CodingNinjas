package datastructure.lecture3;

public class PrintNumbers {
	public static void main(String[] args) {
		print(3);

	}

	public static void print(int n) {
		if (n == 0) {
			return;
		}

		print(n - 1);
		System.out.println(n);

	}

}
