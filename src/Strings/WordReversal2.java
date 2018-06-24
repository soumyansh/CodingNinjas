package Strings;

public class WordReversal2 {

	public static void main(String[] args) {
		String s="abc def ghij";
		System.out.println(reverseEachWord(s));

	}

	public static String reverseEachWord(String input) {
		String arr[]=input.split(" ");
		String ans="";
		for(int i=0;i<arr.length;i++) {
			//logic to reverse each arr[i]
			char[] ch=arr[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				ans=ans+ch[j];
			}
			ans=ans+" ";
		}
		return ans;
	}
}
