package introtojava.lecture7;

import java.util.Scanner;

public class FibonacciOrNot {
	public static void main(String[] args) {
		System.out.println(checkMember(14));
	}

	public static boolean checkMember(int n) {

		int lowerBound = (5 * n * n) - 4;
		int upperBound = (5 * n * n) + 4;
		int introotLower = (int) Math.sqrt(lowerBound);
		double rootLower = Math.sqrt(lowerBound);
		int introotUpper = (int) Math.sqrt(upperBound);
		double rootUpper = Math.sqrt(upperBound);
		if ((rootLower * rootLower == lowerBound || rootUpper * rootUpper == upperBound)
				&& (introotLower == rootLower || (introotUpper == rootUpper))) {
			return true;
		} else {
			return false;
		}

	}
}
