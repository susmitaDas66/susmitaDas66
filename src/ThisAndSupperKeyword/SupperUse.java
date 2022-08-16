package ThisAndSupperKeyword;

public class SupperUse extends A 
   {
	
	int m=10;// global variable form superUse

	public static void main(String[] args) 
	{

		SupperUse su = new SupperUse();
		su.test();
		
		}
		   public void test()
		{
			
		int m=1;
		
		int sum=m+10;// using local value of m
		
		int sum1=this.m+10;// using global value of m form same class
		
		int sum2=super.m+10;// using global value of m from super class
		
		System.out.println("Using local value of m "+sum);
		
		System.out.println("Using global value of m from same class "+sum1);
		
		System.out.println("Using global value of m from super class "+sum2);

	
	}

}
