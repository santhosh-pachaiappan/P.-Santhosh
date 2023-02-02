package javaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Automation";
		int le=s.length();
		String rev="";
		for (int i =le-1; i>=0; i--) {
			rev=rev+s.charAt(i);		
		}
		System.out.println(rev);
	}
}
