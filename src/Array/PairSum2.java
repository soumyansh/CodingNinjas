package Array;

import java.util.Scanner;

public class PairSum2 {

	public static void pairSum(int[] input,int x) {
		
        for(int j=0;j<input.length;j++) {
        	for(int k=j+1;k<input.length;k++) {
        		if(input[j]+input[k]==x) {
        			if(input[j]>input[k]) {
        			System.out.print(input[k]+" "+input[j]);
        			System.out.println();
        			}
        			else if(input[j]<input[k]) {
        			System.out.print(input[j]+" "+input[k]);
        			System.out.println();
        			}
        		}else
        			continue;
        	}
        }
	}

}
