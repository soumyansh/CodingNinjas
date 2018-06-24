package Strings;

public class WordReversal {

	public static void main(String[] args) {
		String s="abc def ghij";
		reversal(s);

	}

	public static void reversal(String input) {
		String arr[]=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			//logic to reverse each arr[i]
			char[] ch=arr[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}
