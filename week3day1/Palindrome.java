package week3day1;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
	
		String string = "MadaM";
		
		String rev = "";
		
		char[] charArray = string.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--) {
			//rev= rev+string.charAt(i);
			rev= rev+charArray[i];
		}
			if (string.endsWith(rev)) {
				
				System.out.println(string +"it is a palindrome");
				
			}
			else {
				System.out.println(string="it is not a palindrome");
			}
		}
		
		
		

	}


