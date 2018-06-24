package Sorting;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
   int arr1[]= {1,3,4,7,11};
   int arr2[]= {2,4,6,13};
Merge(arr1, arr2);
	}

public static int[] Merge(int[] arr1,int[] arr2) {
	
	
	int ans[]=new int[arr1.length+arr2.length];
	
for(int i=0;i<arr1.length;i++) {
	ans[i]=arr1[i];
}
for(int j=arr1.length;j<(arr1.length+arr2.length);j++) {
	ans[j]=arr2[j-arr1.length];
}

//Sorting
int n = ans.length;  
int temp = 0;  
 for(int i=0; i < n; i++){  
         for(int j=1; j < (n-i); j++){  
                  if(ans[j-1] > ans[j]){  
                         //swap elements  
                         temp = ans[j-1];  
                         ans[j-1] = ans[j];  
                         ans[j] = temp;  
                  }}}  

//
	for(int k=0;k<ans.length;k++) {
		System.out.print(ans[k]+" ");
	}
	return ans;
}
}