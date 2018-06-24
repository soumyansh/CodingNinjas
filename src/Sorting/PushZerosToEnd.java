package Sorting;

import java.util.Scanner;

public class PushZerosToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//Pushing zero's to end
		int k = 0,l=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[k]==0 && k<arr.length) {
				
				k++;
			}else
				{
			arr[l]=arr[k];
			l++;
			k++;
			}
		}
for(int i=l;i<arr.length;i++) {
	arr[i]=0;
}		
		
		//printing new array
		for(int m=0;m<arr.length;m++) {
			System.out.print(arr[m]+" ");
		}
	}

}
