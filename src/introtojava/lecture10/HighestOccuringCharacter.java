package introtojava.lecture10;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestOccuringCharacter {
	public static void main(String[] args) {
		System.out.println(highestOccuringChar("aaabbcc"));;
	}

	public static char highestOccuringChar(String str) {
		Map<Character, Integer> m = Collections.synchronizedMap(new LinkedHashMap());

		for (int i = 0; i < str.length(); i++) {
			if (m.containsKey(str.charAt(i))) {
				m.put(str.charAt(i), m.get(str.charAt(i)) + 1);
			} else {
				m.put(str.charAt(i), 1);
			}
		}
		//System.out.println(m);
		char temp=' ';
		int max = 0;
		Iterator hmIterator = m.entrySet().iterator();
		while(hmIterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int freq = ((int)mapElement.getValue());
            if(freq>max) {
            	max=freq;
            	temp=(char) mapElement.getKey();
            }
         
		}
		return temp;
		
	}
}
