package rough;

public class LastIndex {
	public static void main(String[] args) {
		System.out.println(lastIndex(new int[] {9,8,10,8}, 8));
	}

	public static int lastIndex(int input[], int x) {
		int lastIndex = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == x) {
				lastIndex = i;
				

			}

		}

		if(lastIndex==Integer.MIN_VALUE) {
			return -1;
		}else {
			return lastIndex;
		}

	}
}
