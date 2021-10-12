package introtojava.lecture9;

public class pushZeros {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 0, 0, 1, 3, 0, 0 };
		pushZerosAtEnd(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void pushZerosAtEnd(int[] arr) {
		int temp[] = new int[arr.length];
		int tempIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				temp[tempIndex] = arr[i];
				tempIndex++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=temp[i];
		}
		
		
		
	}
}
