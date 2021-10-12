package introtojava.lecture8;

public class Intersections {
	public static void main(String[] args) {
		intersections(new int[] { 10,10}, new int[] { 10 });
	}

	public static void intersections(int arr1[], int arr2[]) {

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
					arr2[j]=(int) Double.NEGATIVE_INFINITY;
					break;
				}
			}
		}
	}
}
