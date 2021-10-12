package introtojava.lecture10;

public class CompressString {

	public static void main(String[] args) {
		System.out.println(getCompressedString("aaabbcddeeeee"));
		;
	}

	public static String getCompressedString(String str) {

		char[] temp = new char[str.length()];
		int tempIndex = 1;
		int count=0;
		char[] arr = str.toCharArray();
		temp[tempIndex - 1] = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1) {
				temp[tempIndex]=Integer.toString(count+1).charAt(0);
			}
			if ((temp[tempIndex - 1]!= arr[i])) {
				
				if (count>1) {
					temp[tempIndex] = Integer.toString(count).charAt(0);
					temp[tempIndex + 1] = arr[i];
					tempIndex = tempIndex + 2;
				}else {
					temp[tempIndex] = arr[i];
					tempIndex++;
				}
				count=1;
			} else {
				count++;
				continue;

			}
		}
	String str2 = "";
		for (int i = 0; i < temp.length; i++) {
			//System.out.println(temp[i]);
			str2 = str2 + temp[i];
			str2 = str2.trim();
		}
		return str2;

	}
}
