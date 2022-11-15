package week3_days2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[]arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		List<Integer>num1=new ArrayList<Integer>();
		
		Collections.sort(num1);
		
		for (int k = 0; k < arr.length; k++) {
			num1.add(arr[k]);
			for (int l = k+1; l < arr.length; l++) {
				
			
		
				if (arr[k]==arr[l]) {
					
					System.out.println(arr[k]);
				}
			}
		}
		

	}}


