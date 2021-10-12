package introtojava.lecture10;

public class ReverseStringWordWise {
public static void main(String[] args) {
	System.out.println(reverseWordWise("Always indent your code"));
	
}
	public static String reverseWordWise(String input) {
	String[] arr= input.split(" ");
	String temp="";
	if(arr.length==0) {
		return "";
	}else {
		for (int i = arr.length-1; i>=0; i--) {
			temp=temp+arr[i]+" ";
		}
		return temp.trim();
	}

	}
}

