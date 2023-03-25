package Testing_Materials;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		
		//Approach 1
		/*int array [] = {10,99,33,44,89,79};
		int HighestNumber =array[0];
		int SecondHighestNumbery =array[0];
		
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>HighestNumber)
			{
				SecondHighestNumbery = HighestNumber;
				HighestNumber=array[i];
			}else if(array[i]>SecondHighestNumbery && array[i]!=HighestNumber)
			{
				SecondHighestNumbery= array[i];
			}
		}
		
		System.out.println("Second Highest Number is :"+SecondHighestNumbery);*/
		
		//Approach 2
		Integer array [] = {10,99,33,44,89,79};
		List<Integer> list =Arrays.asList(array);
		Collections.sort(list);
		System.out.println(list);
		
		int SecondHighestNumbery =list.get(list.size()-2);
		System.out.println("Second Highest Number is :"+SecondHighestNumbery);
		
		
	}

}
