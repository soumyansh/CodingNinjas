package introtojava.lecture3;


import java.util.Scanner;

public class FindCharacterCase {
	
	public static void main(String[] args) {
		 //97 to 122 
		//65 to 90
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char input=str.charAt(0);
		int asciInput = (int)input;
		if(asciInput>=97 && asciInput<=122) {
			System.out.println(0);
		}else if(asciInput>=65 && asciInput<=90) {
			System.out.println(1);
		}else {
			System.out.println(-1);
		}
		
		
	}

}
