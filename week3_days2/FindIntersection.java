package week3_days2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		Integer[] set1={3,2,11,4,6,7};
		Integer[] set2={1,2,8,4,9,7};
		//List<String>lst = new ArrayList<String>(Arrays.asList(color));
		
		List<Integer>num1=new ArrayList<Integer>();
		List<Integer>num2=new ArrayList<Integer>();
		
		for(int i=0; i<set1.length;i++) {
			num1.add(set1[i]);
		}
			for(int j=0; j<set2.length;j++)
			{
				num2.add(set2[j]);
		}
		
		for(int i=0;i<num1.size();i++)
		{
			for(int j=0; j<num2.size();j++)
			{
				if(num1.get(i)==num2.get(j))
				{
					System.out.println(num1.get(i));
				}
			}
			}}
	}
	

			
	
