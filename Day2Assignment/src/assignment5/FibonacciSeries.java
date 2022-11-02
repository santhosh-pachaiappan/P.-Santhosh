package assignment5;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range =8, fno=0, sno=1, sum;
		for (int i = 0; i < range; i++) {
			System.out.println(fno);
			sum = fno+sno;
			fno =sno;
			sno=sum;
			
		}
		

	}

}
