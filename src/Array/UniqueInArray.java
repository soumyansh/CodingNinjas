package Array;

import java.util.Scanner;

public class UniqueInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input array
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			int counter=0;
			for(int k=0;k<n;k++) {
				
				if(arr[j]==arr[k]) {
					counter=counter+1;
					
				}else
					continue;
				
				
			}
			System.out.println(counter);
			if(counter==1) {
				System.out.println("Unique is "+arr[j]);
			}
		}

	}

}
