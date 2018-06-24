package TwoD_Arrays;

import java.util.Scanner;

public class SumOf_IthRow {

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
		
		for(int i=0;i<rows;i++) {
			int	count=0;
			for(int j=0;j<cols;j++) {
				
				count=count+input[i][j];
				
			}
			System.out.print(count+" ");
		}
		
	}

}
