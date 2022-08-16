package MethodsStudy;

public class UniversityStudents {

	public static void main(String[] args)
	{

		UniversityStudents us= new UniversityStudents();//created object of a class
		
		us.studentInfo();// calling non-static method from same class
		
		us.studentInfo("Katraj", "PU765432", "Arts", "test", 'M', 2020, 99.99f);
		us.studentInfo("Pune", "PU98088", "Science", "MSC COMP", 'M', 2021, 
		88.09f);
		
	}
		//name, PRN, branch, dept, gender, passoutyear, weight 
	
		public void studentInfo()// method without parameter
		
	{
		String name;
		name="Velocity";
		
		String PRN;
		PRN="PU12344";
		
		String branch;
		branch="Engg";
		
		String dept;
		dept="MECH";
		
		char gender;
		gender='F';
		
		int passoutyear;
		passoutyear=2019;
		
		float weight;
		weight=78.88f;
		
		
		System.out.println("=========================");
		
		System.out.println("My name is "+name);
		System.out.println("My PRN number is "+PRN);
		System.out.println("My brnch is "+branch);
		System.out.println("My dept is "+dept);
		System.out.println("My gender is "+gender);
		System.out.println("My passout year is "+passoutyear);
		System.out.println("My weight is "+weight);
		
		System.out.println("=========================");
	}
		//name, PRN, branch, dept, gender, passoutyear, weight 
		
		public void studentInfo(String name,String PRN, String branch,String dept, char gender, int passoutyear, float weight)
		
	{
		System.out.println("=========================");
		
		System.out.println("My name is "+name);
		System.out.println("My PRN number is "+PRN);
		System.out.println("My branch is "+branch);
		System.out.println("My dept is "+dept);
		System.out.println("My gender is "+gender);
		System.out.println("My passout year is "+passoutyear);
		System.out.println("My weight is "+weight);

	
	}

}
