package Pattern;

public class Eg10_EquilateralTriangle_Upward_And_Downward_WithSpacing {

	public static void main(String[] args) 
	{
		//    *
		//   * *
        //  * * *
		// * * * *
		//* * * * *
		// * * * * 
		//  * * *
		//   * *
		//    *

		int Space = 5;
		int Stars = 1;
		//Rows = 9
	for(int i=1;i<=9;i++)
	{
		for(int k=1;k<=Space;k++)
		{
			System.out.print(" ");
		}
	    
		for(int k=1;k<=Stars;k++)
		{
			System.out.print(" * ");
		}
	System.out.println();
	Space--;
	Stars=Stars+2;
	}
	  for(int i=9;i>=1;i--)
	  {
		  for(int k=1;k<=Space;k++)
			{
				System.out.print(" ");
			}
		    
			for(int k=1;k<=Stars;k++)
			{
				System.out.print(" * ");
			}
		
		Space++;
		Stars=Stars-2;
		System.out.println();
	  }
	
	
	}

}
