package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println("Before:"+list);
		
		Collections.swap(list, 0, 1);
		System.out.println("After:"+list);
		

	}

}
