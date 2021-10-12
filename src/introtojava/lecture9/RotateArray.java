package introtojava.lecture9;

public class RotateArray {
	public static void main(String[] args) {
		// {1,2,3,4,5,6,7} -->2
		// {3,4,5,6,7,1,2}
		int[] arr=new int[] {1,2,3,4,5,6,7};
		rotate(arr, 2);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void rotate(int[] arr, int d) {
		int[] temp = new int[arr.length];
		int k=0;
		for (int i = d; i < arr.length; i++) {
			temp[k]=arr[i];
			k++;
		}
		int l=0;
		for (int i = k; i < temp.length; i++) {
			temp[i]=arr[l];
			l++;
		}
		
		
		for (int i = 0; i < temp.length; i++) {
			arr[i]=temp[i];
		}
		
	}

}
