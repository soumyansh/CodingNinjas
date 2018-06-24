package Array;

import java.util.Scanner;

public class ArrayQ2 {

	public static void swapAlternate(int[] input) {
		
		
		

//Swapping
for(int k=0;k<input.length;k=k+2) {
	
	int w=input[k];
	if(w==input.length) {
		continue;
	}
	else
	input[k]=input[k+1];
	input[k+1]=w;
}


		
	}
	}
