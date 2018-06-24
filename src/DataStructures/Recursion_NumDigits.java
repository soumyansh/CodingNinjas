package DataStructures;

public class Recursion_NumDigits {

	public static void main(String[] args) {
		System.out.println("Final "+count(8977));
		
	}

	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		int smallAns=count(n/10);
		System.out.println(smallAns+1);
		return smallAns+1;
		
	}
}
