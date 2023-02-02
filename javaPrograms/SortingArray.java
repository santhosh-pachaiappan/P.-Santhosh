package javaPrograms;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
	String[]str={"A","C","B","E","D","G","F","I","H"};	
	int[] num = {1,3,2,5,4,7,6,9,8,0};
	
	Arrays.sort(str);
	System.out.println(Arrays.toString(str));
	
	Arrays.sort(num);
	System.out.println(Arrays.toString(num));
	}

}
