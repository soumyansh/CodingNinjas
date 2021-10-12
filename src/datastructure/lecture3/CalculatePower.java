package datastructure.lecture3;

public class CalculatePower {
public static void main(String[] args) {
	System.out.println(power(3, 4));
}
public static int power(int x, int n) {
	if(n==0) {
		return 1;
	}
	
	return x*power(x,n-1);
	
}
}
