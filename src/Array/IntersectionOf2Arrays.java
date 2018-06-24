package Array;

import java.util.Scanner;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array1
		System.out.println("Enter size of array1");
		int n1 = sc.nextInt();
		
		int[] arr1 = new int[n1];
System.out.println("Enter elements of Array1");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		// Array2
		System.out.println("Enter size of array2");
		int n2 = sc.nextInt();

		int[] arr2 = new int[n2];
		System.out.println("Enter elements of Array2");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
System.out.println("Now finding intersection");
		//Finding common elements
		for(int j=0;j<arr1.length;j++) {
		
			for(int k=0;k<arr2.length;k++) {
				if (arr1[j]==arr2[k]) {
					System.out.println(arr1[j]);
					arr2[k]=Integer.MIN_VALUE;
				}else
				continue;
			}
		
				
			}
		}
	}


