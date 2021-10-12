package introtojava.lecture10;

public class SubStrings {
	public static void main(String[] args) {
		printSubstrings("abc");
	}

	public static void printSubstrings(String str) {
		int startIndex=0;
		int endIndex=0;
		for (int i = 0; i < str.length(); i++) {
			endIndex=startIndex;
			
			for (int j = startIndex; j <=endIndex; j++) {
				if (endIndex<str.length()) {
					for (int k = startIndex; k <= j; k++) {
						System.out.print(str.charAt(k));
					}
					System.out.println();
					endIndex++;
				}
			}
			//System.out.println();
			startIndex++;
		}
		

	}
}
