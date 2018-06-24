package practice3;

public class ReferencingInteger {

	public static void main(String[] args) {
		int a=100;
		increment(a);
System.out.println(a);
	}

	public static int increment(int num) {
		return num++;
	}
}
