package LogicalPrograms;

public class ReverseTheNumber {

	public static void main(String[] args) 
	{
      //Number= 1234-->4321
		
		int number = 86577;
		String s = Integer.toString(number);
		String r = " ";
		
		for(int i=s.length()-1;i>=0;i--)
			
		{
		r=r+s.charAt(i);
		}
		
		int reverseNumber = Integer.parseInt(r);
		
		System.out.println("Original number is "+number);
		System.out.println("Reverse number is "+reverseNumber);


	}

}
