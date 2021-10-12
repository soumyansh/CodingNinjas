package datastructure.lecture4;

public class RemoveConsecutiveDuplicates {
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("aabccba"));;
	}

	public static String removeConsecutiveDuplicates(String s) {
		// aabccba
		String x="";
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				continue;
			}else {
				x=x+s.charAt(i);
			}
		}
		x=x+s.charAt(s.length()-1);
		s=x;
		return s;
		

	}
}
