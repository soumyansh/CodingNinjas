package Array;

import java.util.Scanner;

public class TripletSum2 {

	public static void tripletSum(int[] input,int x) {
		
        for(int j=0;j<input.length;j++) {
        	for(int k=j+1;k<input.length;k++) {
        		for(int l=k+1;l<input.length;l++) {
        		if(input[j]+input[k]+input[l]==x) {
        			if(input[j]<=input[k] && input[j]<=input[l]) {
        				if(input[k]<=input[l]) {
        			System.out.print(input[j]+" "+input[k]+" "+input[l]);
        			System.out.println();
        				}else {
        					System.out.print(input[j]+" "+input[l]+" "+input[k]);
                			System.out.println();
        					
        				}
        			}
        			
        			else if(input[k]<=input[j] && input[k]<=input[l]) {
        				if(input[j]<=input[l]) {
        			System.out.print(input[k]+" "+input[j]+" "+input[l]);
        			System.out.println();
        				}else
        					System.out.print(input[k]+" "+input[l]+" "+input[j]);
            			System.out.println();
        			}
        		
        			else if(input[l]<=input[j] && input[l]<=input[k]) {
        				if(input[j]<=input[k]) {
        			System.out.print(input[l]+" "+input[j]+" "+input[k]);
        			System.out.println();}
        				else {
        					System.out.print(input[l]+" "+input[k]+" "+input[j]);
                			System.out.println();}
                			
        				}
        			else if(input[j]==input[k] && input[j]==input[l]) {
        				System.out.print(input[l]+" "+input[j]+" "+input[k]);
            			System.out.println();}
        			}

        		else
        			continue;
        	}}
        }
	}}

