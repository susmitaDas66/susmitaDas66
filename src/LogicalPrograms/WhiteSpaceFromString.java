package LogicalPrograms;

public class WhiteSpaceFromString {

	public static void main(String[] args) 
	{
        // V elo ci ty
		
		String s = "My name is";
		int counter = 0;
		
		for(int i = 0;i<=s.length()-1;i++)
		{
			char blank = s.charAt(i);
			if(blank==' ') 
			{
				counter++;
			}
			
      System.out.println("Number of Blank Space in "+s+" is "+counter);
		
		}

	}

}
