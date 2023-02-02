package javaPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] n= {1,2,2,3,4,4,5,6,6,7,8,9,9};
		
		Set<Integer>Obj = new HashSet<Integer>();
		
		for(Integer n1 : n) {
			Obj.add(n1);
			
		}
		System.out.println(Obj);
	}

}
