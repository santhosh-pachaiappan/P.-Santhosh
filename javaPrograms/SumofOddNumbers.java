package javaPrograms;

public class SumofOddNumbers {

	public static void main(String[] args) {
		int n=100;
		int evencount=0;
		int oddcount=0;
		
		
		for (int i = 0; i <n; i++) {
		if (i%2==0) {
			evencount++;
			//System.out.println("Even");
		}else {
			oddcount++;
			//System.out.println("ODD");
			}
		}
		System.out.println("Even number:"+ evencount + ", Odd number:" + oddcount);
	}
}
