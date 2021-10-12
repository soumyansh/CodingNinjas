package introtojava.lecture10;

public class RemoveCharacter {
	public static void main(String[] args) {
		System.out.println(removeAllOccurrencesOfChar("xxyyzxx", 'y'));
	}
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String ans="";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==ch) {
				continue;
			}else {
				ans=ans+str.charAt(i);
			}
		}
		return ans;
	}


}
