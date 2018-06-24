package TwoD_Arrays;

import java.util.Scanner;

public class SumOf_IthRow2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rows=sc.nextInt();
		
		int cols=sc.nextInt();
		
		int input[][]=new int[rows][cols];
		//Array Input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
		
				input[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			int	count=0;
			for(int j=0;j<cols;j++) {
				
				count=count+input[i][j];
				
			}
			System.out.print(count+" ");
		}
		
	}

}
