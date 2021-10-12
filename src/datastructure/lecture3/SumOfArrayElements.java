package datastructure.lecture3;

public class SumOfArrayElements {
public static void main(String[] args) {
	System.out.println(sum(new int[] {1,2,3}));
}
public static int sum(int input[]) {
	if(input.length==0) {
		return 0;
	}
	if(input.length==1) {
		return input[0];
	}
	int[] smallInput=new int[input.length-1];
	for (int i = 1; i < input.length; i++) {
		smallInput[i-1]=input[i];
	}
	for (int i = 0; i < smallInput.length; i++) {
		System.out.print(smallInput[i]+" ");
	}
	return sum(smallInput);
}
}
