package TwoD_Arrays;

import java.util.Scanner;

public class WavePrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=sc.nextInt();
		System.out.println("Enter number of cols");
		int cols=sc.nextInt();
		
		int input[][]=new int[rows][cols];
		//Array Input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("Enter value for row "+i+" and column "+j+"");
				input[i][j]=sc.nextInt();
			}
		}
		
		//Printing in a Wave Manner
		
		for(int j=0;j<cols;j++) {
			if(j%2==0) {
			for(int i=0;i<rows;i++) {

				System.out.print(input[i][j]+" ");
	
				}
			}
			else
			{
				for(int i=rows-1;i>=0;i--) {

					System.out.print(input[i][j]+" ");
		
					}				
			}
			}
		
		
		
		
		
		
		
		
		
		
		}
	}


