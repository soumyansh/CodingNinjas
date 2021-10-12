package introtojava.lecture10;

public class reverseEachWord {
	public static void main(String[] args) {
System.out.println(reverseEachWord("Hello, I am Aadil!"));
	}

	public static String reverseEachWord(String str) {
		String[] strArray=str.split(" ");
		String ans="";
		for (int i = 0; i < strArray.length; i++) {
			StringBuffer sb=new StringBuffer(strArray[i]);
			ans=ans+sb.reverse();
			
			ans=ans+" ";
			
		}
		return ans;
	}

}
