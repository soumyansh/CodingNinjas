package introtojava.lecture8;

public class FindUnique {
	public static void main(String[] args) {
		System.out.println(findUnique(new int[] { 1, 1, 1, 1, 2,2 }));;
	}

	public static int findUnique(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				continue;
			}else {
				return arr[i];
			}
		}
		return 0;
		
	}
}
