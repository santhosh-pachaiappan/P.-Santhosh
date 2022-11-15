package week3_days2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,7,6,8};
		
		List<Integer>num1=new ArrayList<Integer>();
		
		Collections.sort(num1);
		
		for (int i = 0; i < arr.length; i++) {
			//num1.add(arr[i]);
		    int temp = i+1;
			
			if (arr[i]!=temp) {
				
				System.out.println(temp);
				break;
			} 

			}
			
		}}
