package introtojava.lecture10;

import java.util.Hashtable;

public class Permutation {
	public static void main(String[] args) {
		
		System.out.println(isPermutation("abcde", "abedc"));;
	}
	public static boolean isPermutation(String str1, String str2) {
		if(str1.length()==0 && str2.length()==0){
            return false;
        }
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Hashtable<Character, Integer>hs1=new Hashtable<Character, Integer>();
		Hashtable<Character, Integer>hs2=new Hashtable<Character, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if(hs1.containsKey(arr1[i])) {
				hs1.put(arr1[i], hs1.get(arr1[i])+1);
			}else {
				hs1.put(arr1[i],1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if(hs2.containsKey(arr2[i])) {
				hs2.put(arr2[i], hs2.get(arr2[i])+1);
			}else {
				hs2.put(arr2[i],1);
			}
		}
		if(hs1.equals(hs2)) {
			return true;
		}else {
			return false;
		}
		
		
       }
}
