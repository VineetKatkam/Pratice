package Testing_Materials;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		String word ="I am good in core JAVA but weak in advance java";
		String Newword[] =word.split(" ");
		System.out.println(Newword[0]);
		
		ArrayList<String> list=new ArrayList<String>();
		{
			for(int i=0 ;i<Newword.length;i++)
					{
						int k=0;
						if(!list.contains(Newword[i]))
								{
									list.add(Newword[i]);
								//++;
								}
						for(int j=i+1;j<Newword.length;j++)
								{
									if(Newword[i].equalsIgnoreCase(Newword[j]))
											{
										k++;
											}
								}
						if(k>1)
						{
							System.out.println("Duplicate words :"+ Newword[i]);
						}
							
					}
			
		}

	}

}
