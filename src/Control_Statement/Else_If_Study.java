package Control_Statement;

public class Else_If_Study {

	public static void main(String[] args) {


		// if i got >=90 i am in dist
		//else if i got >=66 and <90 i am in 1st class
		//else if i got >=50 and <66 i am in 2nd class
		//else if i got >=40 and <50 i am in pass class
		//else i am fail
		int marks=6;
		if(marks>=90)
			
		{
		System.out.println("I am in dist");
		}
		else if (marks>=66 & marks<90)
		{
		System.out.println("i am in 1st class");
		}
		else if (marks>=50 & marks<66)
		{
		System.out.println("I am in 2nd class");
		}
		else if (marks>=40 & marks<50) 
		{
		System.out.println("I am in pass class");
		}
		else
		{
		System.out.println("I am fail");
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
