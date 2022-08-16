package Polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) 
	{

       MethodOverLoading mo = new MethodOverLoading();
       mo.add();
       mo.add(20);
       mo.add(50, 100);
      

	}
      public void add() 
   {
	  int a = 20;
	  int b = 30;
	  int  sum = a+b;
	  System.out.println("sum is sum"+sum);
   }

      public void add(int a) 
      {
		a = 50;
		int sum = a+20;
		System.out.println("sum is sum"+sum);
	  }

      public void add(int a, int b) 
      {
		int sum = a+b;
		System.out.println("sum is sum"+sum);
	  }



}
