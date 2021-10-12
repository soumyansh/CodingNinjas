package rough;

public class IndexesArray {
	public static void main(String[] args) {
		int[] arr = allIndexes(new int[] { 9, 8, 10, 8, 8 }, 8);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

	public static int[] allIndexes(int input[], int x) {
		int[] temp = new int[input.length];
		int count = -1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == x) {
				count++;
				temp[count] = i;
				
			}
		}
		int res[]=new int[count+1];
//		System.out.println("val of count is:"+count);
		for (int i = 0; i <=count; i++) {
			res[i]=(temp[i]);
		}
		return res;

	}
}
