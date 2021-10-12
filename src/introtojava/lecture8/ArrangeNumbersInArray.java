package introtojava.lecture8;

public class ArrangeNumbersInArray {
	public static void main(String[] args) {
		arrange(new int[6], 6);
	}

	// 9 1,3,5,7,9,8,6,4,2
	public static void arrange(int[] arr, int n) {
		int start = 1;
		int end = 2;
		if (n % 2 == 0) {
			for (int i = 0; i < arr.length / 2; i = i + 1) {
				arr[i] = start;
				arr[arr.length - i - 1] = end;
				start = start + 2;
				end = end + 2;
			}
		} else {
			for (int i = 0; i < arr.length / 2 +1; i = i + 1) {
				arr[i] = start;
				if((arr.length/2)==i) {
					break;
				}else {
				arr[arr.length - i - 1] = end;
				start = start + 2;
				end = end + 2;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
