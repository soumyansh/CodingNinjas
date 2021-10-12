package introtojava.lecture9;

import java.util.Arrays;

public class MergeTwoSorted {
	public static void main(String[] args) {
		int[] arr=merge(new int[] {1, 2,3,4,5},new int[] {6,7,8,9});
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] merge(int arr1[], int arr2[]) {
		int[] merged=new int[arr1.length+arr2.length];
		int j=0;
		int k=arr1.length;
		int l=k;
		for (int i = 0; i < merged.length; i++) {
			if(j<k) {
			merged[i]=arr1[j];
			j++;
			}else {
				merged[i]=arr2[l-arr1.length];
				l++;
			}
		}
		
		Arrays.sort(merged);
		return merged;
	}
}
