package LogicalPrograms;

public class ChangeOrderOfaString {

	public static void main(String[] args) 
	{
		String name = "I Love My SchoolLife";
		String ar [] = name.split(" ");
		
		//ar={"I","LOVE","MY","INDIA"}
		
		for(int i = 0;i<=ar.length-1;i++) //0,1,2
		{
			if(i%2!=0)
			  {
			  
				String s=ar[i];
			    ar[i]=revString(s);
			  
			  }
		}
		
			for(int i=0;i<=ar.length-1;i++)
				
			{
			   System.out.println(ar[i]+" ");
			}
		}
			
	      public static String revString(String input)
	      
			{
			  String rev="";
			  
			 for(int i=input.length()-1;i>=0;i--)
			  {
				 
			     rev=rev+input.charAt(i);
			  }
			
			 return rev;
		}

	}
	


