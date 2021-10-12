package introtojava.lecture10;

public class RemoveConsecutiveDuplicates {
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("aaabbccdsa"));;
	}

			public static String removeConsecutiveDuplicates(String str) {
				char[] temp = new char[str.length()];
				int tempIndex = 1;
				
				char[] arr = str.toCharArray();
				temp[tempIndex-1]=arr[0];
				for (int i = 0; i < arr.length; i++) {
					if (!(temp[tempIndex - 1] == arr[i])) {
						temp[tempIndex] = arr[i];
						tempIndex++;
					} else {
						continue;
					}
				}
				String str2 = "";
				for (int i = 0; i < temp.length; i++) {
		
					str2 = str2 + temp[i];
					str2=str2.trim();
				}
				return str2;
			}
}
