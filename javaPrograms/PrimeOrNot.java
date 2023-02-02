package javaPrograms;

public class PrimeOrNot {

	public static void main(String[] args) {
		int num=13;
		
		boolean prime = true;
		for (int i = 2; i < num; i++) {
		if (num%2==0) {
			prime= false;
			break;
		}
	}
		if (prime==true) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}
