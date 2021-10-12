package introtojava.lecture8;

public class SwapAlternate {
	public static void main(String[] args) {
		swapAlternate(new int[] { 1, 2, 3, 4, 5,6,7,8,9 });

	}

	public static void swapAlternate(int arr[]) {
		if (arr.length % 2 == 0) {
			for (int i = 0; i < arr.length; i = i + 2) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		} else {
			for (int i = 0; i < arr.length-1; i=i+2) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		
	}
}
