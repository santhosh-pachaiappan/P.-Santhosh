package week3_days2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text ="We learn java basics as part of java sessions in java week1";
		
		String[] split=text.split(" ");
		int length = split.length;
		
		Set<String>set=new LinkedHashSet<String>();
		for (int i = 0; i < length; i++) {
			set.add(split[i]);		
		}
		System.out.println(set);
}	
	}

		
			
		
	


