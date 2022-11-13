package week3day1;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		String text= "we learn java basics as part of java sessions in java weeks1";
		
		System.out.println(text);
		
		String[] split = text.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equals(split[j]))
				
				{
					split[j]="";
				}
			}
			
		}
		
		for (int l = 0; l < split.length; l++) {
			System.out.println(split[l]+" ");
			
		}
	}

}
