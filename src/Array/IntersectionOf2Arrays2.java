package Array;

import java.util.Scanner;

public class IntersectionOf2Arrays2 {

	public static void intersections(int[] input1,int[] input2) {
		System.out.println("Now finding intersection");
		//Finding common elements
		for(int j=0;j<input1.length;j++) {
			
			for(int k=0;k<input2.length;k++) {
				if (input1[j]==input2[k]) {
					System.out.println(input1[j]);
					input2[k]=Integer.MIN_VALUE;
					
				}else
				continue;
			}
		
		}
	}

}
