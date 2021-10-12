package datastructure.lecture4;

public class ReplaceCharacter {

	public static void main(String[] args) {
		System.out.println(replaceCharacter("abacd", 'a', 'x'));
	}

	public static String replaceCharacter(String input, char c1, char c2) {
		if (input.length() == 0) {
			return input;
		}
		String ans = "";
		if (input.charAt(0) != c1) {
			ans = ans + input.charAt(0);
		} else {
			ans = ans + c2;
		}
		String smallAns = replaceCharacter(input.substring(1), c1, c2);
		return ans + smallAns;
	}
}
