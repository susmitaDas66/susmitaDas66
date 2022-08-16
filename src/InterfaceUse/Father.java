package InterfaceUse;

public interface Father 
{
	void attitue();
	void money();
	
	default void love()
	
	{
	   System.out.println("Fathers love");
	}
	
	static void test()
	
	{
	   System.out.println("Fathers test");
	
	}
}
