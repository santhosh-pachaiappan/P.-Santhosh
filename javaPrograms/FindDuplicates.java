package javaPrograms;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] n = {1,2,3,4,5,5,6,7,8,9,10,10};
		
		for (int i = 0; i <n.length-1; i++) {
			for (int j =i+1; j < n.length; j++) {
				if (n[i]==n[j]) {
					System.out.println("Duplicate number is ="+n[i]);
				}
			}
		}

	}

}
