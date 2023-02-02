package javaPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		
		if (s1.length()!=s2.length()) {
			System.out.println("Its Not A Anagram");
		} else {
			
			char[]String1= s1.toCharArray();
			char[]String2= s2.toCharArray();
			
			Arrays.sort(String1);
			Arrays.sort(String2);
			
			if (Arrays.equals(String1, String2)==true) {
				System.out.println("Strings are Anagram");
			} else {
				System.out.println("Strings are Not Anagram");
			}

		}

	}

}
