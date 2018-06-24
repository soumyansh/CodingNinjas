package Strings;

public class StringReversal {

	public static void main(String[] args) {
		String A="Welcome to Coding Ninjas";
System.out.println(reverseWordWise(A));
	}

	public static String reverseWordWise(String input) {
		String[] sArray=input.split(" ");
		String finalString="";
	for(int i=sArray.length-1;i>=0;i--) {
		finalString=finalString+sArray[i]+" ";
	}
	return finalString;
	}
	
}
