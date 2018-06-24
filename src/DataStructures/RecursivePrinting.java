package DataStructures;

public class RecursivePrinting {

	public static void main(String[] args) {
		print(5);

	}

	
	public static void print(int n) {
		if(n>1) {
			print(n-1);
		}
	//n space print(n-1)
	System.out.print(n+" ");
	
		
	}
}
