package introtojava.lecture9;

public class CheckArrayRotation {
	public static void main(String[] args) {
System.out.println(arrayRotateCheck(new int[]{1,2,4,5,-1}));
	}

	public static int arrayRotateCheck(int[] arr) {
		// return index of smallest element
		int min = (int) Double.POSITIVE_INFINITY;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
				temp = i;
				
			}
		}
		return temp;
	}
}
