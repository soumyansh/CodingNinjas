package conditionalLoops;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int Sum=0;
		while(i<=n ) {
			if(i%2==0) {
				Sum=Sum+i;
			}
			i=i+1;
		}
System.out.println(Sum);
	}

}
