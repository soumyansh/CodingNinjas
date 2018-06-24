package Array;

public class ArrangeNumbers {

public static int[] arrange(int n){
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=i+1;
	}
	return arr;
}
		
	/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/			

	
	
	
	public static void main(String[] args) {
		
int arr[]=arrange(5);
int arr2[]=arr;
for(int i=0,j=0;i<arr.length;i++,j=j+2) {
	if(arr[i]%2==0) {
		arr2[j]=arr[i];
	}else
		arr2[j+1]=arr[i];
	
	
}

for(int k=0;k<arr2.length;k++) {
	System.out.print(arr2[k]+" ");
}
	}

}
