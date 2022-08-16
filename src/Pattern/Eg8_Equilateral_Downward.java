package Pattern;

public class Eg8_Equilateral_Downward {

	public static void main(String[] args)
	{
		//***********
		// *********
		//  *******
		//   *****
		//    ***
		//     *
       
		int Space=0;
		int Stars=11;
		//Rows=4
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=Space;j++)// Inner for Loop
			{
				System.out.print(" ");
			}
		    
			for(int j=1;j<=Stars;j++)// Inner for Loop
			{
				System.out.print("*"); 
			}
		System.out.println();
		Space++; // Increment of Space by 1
		 Stars = Stars-2; // Decrement of Star by 2
		}
	
	
	
	
	}

}
