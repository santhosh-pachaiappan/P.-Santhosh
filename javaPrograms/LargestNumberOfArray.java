package javaPrograms;

public class LargestNumberOfArray {

	public static void main(String[] args) {
		
		int a = 23;
		int b = 34;
		int c = 45;
		
		if (a>b && a>c) {
			System.out.println("A is largest Number");
			
		} else if (b>c && b>a) {
			System.out.println("B is largest Number");
		}else {
			System.out.println("C is largest Number");
		}
	}
}
