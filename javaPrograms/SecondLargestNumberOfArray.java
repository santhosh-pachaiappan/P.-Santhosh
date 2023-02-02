package javaPrograms;

import java.util.Arrays;

public class SecondLargestNumberOfArray {

	public static void main(String[] args) {
		
		int[] num = {1,3,5,7,9,13};
		Arrays.sort(num);
		System.out.println(num[num.length-2]);

	}

}
