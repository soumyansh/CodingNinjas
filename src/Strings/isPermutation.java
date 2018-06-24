package Strings;

public class isPermutation {
public static void main(String[] args) {
	String a="abcde";
	String b="cbaed";
	System.out.println(isPermutation(a, b));
}
	public static boolean isPermutation(String input1,String input2) {
		
		char[] array1=input1.toCharArray();
		char[] array2=input2.toCharArray();
		int count=0;
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				if(array1[i]==array2[j]) {
					count=count+1;
				}
				else
					continue;
			}
		}
		System.out.println(count);
			if(count==array1.length) {
				return true;
			}else
				return false;
	}

}
