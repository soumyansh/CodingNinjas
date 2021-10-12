package introtojava.test2;

public class MinimumLengthWord {
	public static void main(String[] args) {
		System.out.println(minLengthWord("abc de ghihjk a uvw h j"));;
	}

	public static String minLengthWord(String input) {

		String[] arr=input.split(" ");
		int min=Integer.MAX_VALUE;
		String temp="";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()<min) {
				min=arr[i].length();
				temp=arr[i];
			}
		}
		return temp;
	}
}
