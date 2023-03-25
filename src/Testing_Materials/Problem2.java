package Testing_Materials;

public class Problem2 {

	public static void main(String[] args) {
		String Names[] = {"Ashish" ,"Aditty", "Manjir","Ankita", "credits"};
		int largestWord =0 ;
		String largestWords ="";
		
		for(int i=0;i<Names.length;i++)
		{
			if(Names[i].length()>largestWord)
			{
				largestWord=Names[i].length();
				largestWords=Names[i];
			}
		}
		
		
		int Middlelargest =largestWord/2;
		char Midddleword =largestWords.charAt(Middlelargest);
		System.out.println(Midddleword);
		
	}

}
