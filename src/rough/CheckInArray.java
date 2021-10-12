package rough;

public class CheckInArray {
public static void main(String[] args) {
	
}
public static boolean checkNumber(int input[], int x) {

	for (int i = 0; i < input.length; i++) {
		if(input[i]==x) {
			return true;
			
		}
		
	}
	return false;
	
}
}
