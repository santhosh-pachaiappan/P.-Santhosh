package week3day1;

public class OddIndexToTopperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] charArray= test.toCharArray();
		
		for (int i = 0; i < charArray.length; i=i+2) {
			charArray[i]=Character.toUpperCase(charArray[i]);
		}
				
System.out.println(charArray);
	}

}
