package assignmet1;



public class PrimeNumber {
	 
	
	public static void main(String[] args) {
		
		int pNr=13;
		int count=0;
		for (int i = 2; i<pNr;  i++) {
			
			if(pNr%i==0) 
				count++;
		}
	
	if (count>0){
	System.out.println("Give Number is Not prime");
	}
	
	else 
		System.out.println("Given Number is a prime");
	
		

}}
