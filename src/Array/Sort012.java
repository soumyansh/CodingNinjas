package Array;

import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements of Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == 0) {
count0=count0+1;
			}else if(arr[j]==1) {
				count1=count1+1;				
			}else if(arr[j]==2) {
				count2=count2+1;
			}else
					continue;
		
		}
		System.out.println("count 0 is "+count0+" Count 1 is "+count1+" count 2 is "+count2);
		for(int i=0;i<=count0-1;i++) {
			arr[i]=0;
		}
		for(int j=count0;j<=count0+count1-1;j++) {
			arr[j]=1;
		}
		for(int k=count0+count1;k<=arr.length-1;k++) {
			arr[k]=2;
		}
		System.out.println("Sorted array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
