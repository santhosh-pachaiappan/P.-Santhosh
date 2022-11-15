package week3_days2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		Integer[]data= {3,2,11,4,6,7};
		
		List<Integer>values=new ArrayList<Integer>(Arrays.asList(data));
		
		for (int i = 0; i < values.size(); i++) {
			int data1=values.get(i);
				
				Arrays.sort(data);
				System.out.println("second largest number"+values.get(5));	
				break;
			}
		}
	}


