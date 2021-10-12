package introtojava.lecture8;

public class LinearSearch {
	public static void main(String[] args) {

	}

	public static int linearSearch(int arr[], int x) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}else {
				continue;
			}
		}
		return -1;
	}
}
