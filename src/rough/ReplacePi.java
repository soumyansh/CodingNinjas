package rough;

public class ReplacePi {
public static void main(String[] args) {
	replace("pip");
}
public static String replace(String input){
	input = input.replace("x", "");
	return input;
}
}
