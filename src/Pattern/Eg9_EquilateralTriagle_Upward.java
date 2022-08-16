package Pattern;

public class Eg9_EquilateralTriagle_Upward {

	public static void main(String[] args) 
	{
        //         *
	    //        ***
		//       *****
		//      *******
		//     *********
		//    ***********
		//   *************
		//  ***************
		// *****************
		//*******************
		
		
		int Space = 10;
		int Stars= 1;
		//Rows = 10
		
		for(int i=1;i<=10;i++)// Outer For loop; Rows=4;

		{
			for(int j=1;j<=Space;j++)
			{
				System.out.print(" ");
			}
		    
			for(int j=1;j<=Stars;j++)// Inner For loop; Column;
			{
				System.out.print("*");
			}
		System.out.println();
		Space--;
		Stars=Stars+2;
		}
	}

}
