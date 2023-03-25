package Testing_Materials;

public class MultiplicationArray {

	public static void main(String[] args) {
		int array1 [] = {10,99,33,44,89,79};
		int array2 [] = {10,99,33,44,89,79};
		int result[] =new int[array1.length];
		
		for(int i=0 ;i<array1.length ;i++)
		{
			for(int j=1;j<array1.length ;j++) 
			{
				result[i]=array1[i]* array2[j];
			}
			
		}
		
		for(int i=0 ;i<result.length ;i++)
		{
			System.out.println(result[i]);
		}
	}

}
