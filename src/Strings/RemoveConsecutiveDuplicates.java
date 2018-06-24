package Strings;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		String a="aaaabbbc";
	System.out.println(removeConsecutiveDuplicates(a));	
		
	}

	public static String removeConsecutiveDuplicates(String input) {
	
		String ans="";
		for(int i=0;i<input.length();i++) {
			if(i==0) {
				ans=""+input.charAt(i);
			}else {
				if(input.charAt(i)!=input.charAt(i-1)) {
					ans=ans+input.charAt(i);
				}
			}
		}
		return ans;
		
	}
			
		}
		
		
		
		
		
		
		

	