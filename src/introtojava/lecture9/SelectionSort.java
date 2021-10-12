package introtojava.lecture9;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = new int[] { -1,22,-1,0,7, 2, 1, 5, 6, };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(int[] arr) {
		int min = 0;
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			 min = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					int temp = arr[i];
					min = arr[j];
					arr[i] = min;
					arr[j] = temp;
				}
			}
		}

		System.out.println(min);
	}
}
