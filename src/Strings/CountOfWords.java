package Strings;

public class CountOfWords {

	public static void main(String[] args) {
		String s="Hello World bye";
		System.out.println("No of words are "+countWords(s));
	}

	public static int countWords(String str) {
		int count = 0;
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (Character.isWhitespace(c[i])) {
				count = count + 1;
			} else
				continue;

		}
		return count+1;
	}
}
