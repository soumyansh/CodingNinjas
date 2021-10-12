package introtojava.lecture8;

public class Sort_01 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 0, 0, 1, 0, 1 };
		sortZeroesAndOne(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sortZeroesAndOne(int[] arr) {
		
		int nextZero=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				int temp=arr[nextZero];
				arr[nextZero]=arr[i];
				arr[i]=temp;
				nextZero++;
			}
		}
	}

}
