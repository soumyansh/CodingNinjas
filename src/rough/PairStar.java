package rough;

public class PairStar {
	public static void main(String[] args) {
		addStars("aaaa");
	}

	public static String addStars(String s) {
		char[] arr = s.toCharArray();
		String s1="";
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (j<arr.length) {
				if (arr[i]==arr[j]) {
					s1 = s1 +arr[i]+ "*";
				} else {
					s1 = s1+ arr[i];
				} 
			}
		}
		
		return s1+arr[arr.length-1];
	}
}
