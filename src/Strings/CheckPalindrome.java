package Strings;

public class CheckPalindrome {

	public static void main(String[] args) {
		String s="nn";
		System.out.println(checkPalindrome(s));

	}

	public static boolean checkPalindrome(String str) {
		
		char[] c=str.toCharArray();
		String str1 = "";
		for(int i=c.length-1;i>=0;i--) {
			str1=str1+c[i];
		}
		System.out.println(str1);
		if(str.equals(str1)) {
			return true;
		}else
			return false;
	}
}
