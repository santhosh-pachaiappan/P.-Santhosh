package javaPrograms;

public class CountNumbers {

	public static void main(String[] args) {
		
		int n = 937638736;
		
		int count =0;
		
		while (n>count) {
			n=n/10;
					count++;
		}
		System.out.println(count);
	}

}
