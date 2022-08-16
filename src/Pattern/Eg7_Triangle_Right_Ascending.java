package Pattern;

public class Eg7_Triangle_Right_Ascending {

	public static void main(String[] args) 
	{
        //     *
        //    **
		//   ***
		//  **** 
		// *****
		
		//Space=4, Stars= 1, Rows=5
		int Space=4;// Space in first row, space = 4
		
		int Stars=1;// star on first row, star = 1
		
		for(int i=1;i<=5;i++)// Outer loop for No of Rows = 5
		{
			for(int j=1;j<=Space;j++)// 1st inner loop : Space 
			{
				System.out.print(" "); //Don't use pintln()
			}
		
		    for(int j=1;j<=Stars;j++)
		    {
		    	System.out.print("*");
		    }
		System.out.println();
		Space--;
		Stars++;
		
		}
		
	}

}
