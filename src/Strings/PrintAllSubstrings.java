package Strings;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		String s="xyz";
		printSubstrings(s);
	}
public static void printSubstrings(String str) {
	String sub="";
	for(int c=0;c<str.length();c++) {
		for(int i=1;i<=str.length()-c;i++) {
			 sub = str.substring(c, c+i);
			System.out.println(sub);
		}
	}
}
}
