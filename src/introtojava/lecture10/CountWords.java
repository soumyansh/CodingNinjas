package introtojava.lecture10;

public class CountWords {
public static void main(String[] args) {
	System.out.println(countWords(""));
}
public static int countWords(String str) {	
	String[] arr=str.trim().split(" ");
	return arr.length;
}

}
