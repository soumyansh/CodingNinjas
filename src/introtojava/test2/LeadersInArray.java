package introtojava.test2;

public class LeadersInArray {
public static void main(String[] args) {
	leaders(new int[] {13, 17, 5, 4, 6});
}
public static void leaders(int[] input) {
	
	for (int i = 0; i < input.length; i++) {
		int count=0;
		for (int j = i+1; j < input.length; j++) {
			if(input[i]>=input[j]) {
				count++;
			}
			
		}
		if(count==(input.length-i-1)) {
			System.out.print(input[i]+" ");
		}else {
			continue;
		}
		
	}
	
}
}
