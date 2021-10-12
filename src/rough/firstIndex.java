package rough;

public class firstIndex {
public static void main(String[] args) {
	
}
public static int firstIndex(int input[], int x) {
	for (int i = 0; i < input.length; i++) {
		if(input[i]==x) {
			return i;
		}
	}
	return -1;
}

}
