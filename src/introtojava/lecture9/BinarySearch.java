package introtojava.lecture9;

public class BinarySearch {
	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7}, -2));
	}

	public static int binarySearch(int[] arr, int x) {
		int midIndex = ((arr.length + 1) / 2);
		if (arr[midIndex] == x) {
			return midIndex;
		} else if (x > arr[midIndex]) {
			for (int i = midIndex + 1; i < arr.length; i++) {
				if (arr[i] == x) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < midIndex; i++) {
				if (arr[i] == x) {
					return i;
				}
			}
		}
		return -1;

	}
}
