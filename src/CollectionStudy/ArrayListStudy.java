package CollectionStudy;

import java.util.ArrayList;

public class ArrayListStudy {

public static void main(String[] args) 
{
	
	ArrayList al= new ArrayList();// created object of ArrayList
	
	al.add("Velocity");
	al.add(199);
	al.add(99.99);
	al.add(null);
	al.add(null);
	al.add("Velocity");
	al.add(true);
	al.add('A');
	
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.get(0));
	System.out.println(al.indexOf('A'));
	System.out.println(al.indexOf("Velocity"));
	System.out.println(al.lastIndexOf("Velocity"));
	System.out.println(al.contains("Velocity"));
	System.out.println(al.remove(0));//index basis
	
	System.out.println(al);
	al.add(1, "Pune");
	System.out.println(al);
	System.out.println(al.remove(null));//element basis 
	
	System.out.println(al);
	
	System.out.println("=============================");
	
	System.out.println(al.get(0));
	System.out.println(al.get(1));
	System.out.println(al.get(2));
	System.out.println(al.get(3));
	
	System.out.println("=============================");
	
	//printing element using for loop(static or hard coding)
	
	for(int i=0;i<=6;i++)
		
{
	System.out.println(al.get(i));
	
}
	System.out.println("=============================");
	
	//printing element using for loop(dynamic coding)
	
	for(int i=0;i<=al.size()-1;i++)
		
	{
		
	System.out.println(al.get(i));
	
	}



    }

}
