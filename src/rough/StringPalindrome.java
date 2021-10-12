package rough;

public class StringPalindrome {
	public static void main(String[] args) {
		System.out.println(isStringPalindrome(""));
	}

	public static boolean isStringPalindrome(String input) {
		char[] ch=input.toCharArray();
		String s="";
		for (int i = ch.length-1; i>=0; i--) {
			s=s+ch[i];
		}
		if(s.equals(input)) {
			return true;
		}
		return false;
	}
}
