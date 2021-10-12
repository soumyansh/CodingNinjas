package introtojava.lecture6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckNumberSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		List<Integer> li = new ArrayList<Integer>();
		while (i <= n) {
			int number = sc.nextInt();
			li.add(number);
			i++;
		}
		//System.out.println(li);
		List<String> stringList = new ArrayList<String>();

		for (int j = 0; j < li.size(); j++) {
			if (j + 1 < li.size()) {
				if (li.get(j + 1) > li.get(j)) {

					stringList.add("Increasing");
				} else if (li.get(j + 1) < li.get(j)) {

					stringList.add("decreasing");
				} else {
					stringList.add("equal");
				}
			}
		}
		
		int countInc = 0;
		int countDec = 0;
		boolean val = true;
		// corner case
		for (int j = 0; j < stringList.size(); j++) {
			if (val == false) {
				break;
			}
			if (j + 1 < stringList.size()) {
				// case 1
				if (stringList.get(j).equals("Increasing")) {
					if (stringList.get(j + 1).equals(stringList.get(j))) {
						continue;
					} else {
						countInc = 1;
						for (int j2 = j + 1; j2 < stringList.size(); j2++) {
							if (stringList.get(j2).equals("decreasing")) {
								val = true;
							} else {
								val = false;
								break;
							}
						}
					}
				} else if (stringList.get(j).equals("decreasing")) {

					if (stringList.get(j + 1).equals(stringList.get(j))) {
						continue;
					} else {
						countDec = 1;
						for (int j2 = j + 1; j2 < stringList.size(); j2++) {
							if (stringList.get(j2).equals("Increasing")) {
								val = true;
							} else {
								val = false;
								break;
							}
						}
					}

				}
			}
		}
		System.out.println(val);
	}
}
