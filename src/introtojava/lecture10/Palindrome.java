package introtojava.lecture10;

public class Palindrome {
public static void main(String[] args) {
	
}
public static boolean isPalindrome(String str) {
	
	String rev="";
	for (int i = str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
	if(rev.equals(str)) {
		return true;
	}else {
		return false;
	}
}
}
