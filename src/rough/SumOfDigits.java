package rough;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(9));
	}

	public static int sumOfDigits(int input) {
		int sum=0;
		
		while(input>0) {
			sum=sum+(input%10);
			input=input/10;
		}
		
		return sum;

	}
}
