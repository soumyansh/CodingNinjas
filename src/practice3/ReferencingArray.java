package practice3;

public class ReferencingArray {

	public static void main(String[] args) {
		int[] myArray= {1,2,3};
		increment(myArray);
		for(int j=0;j<myArray.length;j++) {
			System.out.print(myArray[j]+" ");
		}

	}
	public static int[] increment(int[] arr) {
		arr=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
		return arr;
	}
}
