package introtojava.lecture8;

public class TripletSum {


	public static void main(String[] args) {
	System.out.println(findTriplet(new int[] {1,2,3,4,5,6,7}, 19));;
	}

	public static int findTriplet(int arr[], int x) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j+1; j2 < arr.length; j2++) {
					if((arr[i]+arr[j]+arr[j2])==x) {
						count++;
						
					}
				}
			}
		}
		
		
		return count;
	}

}
