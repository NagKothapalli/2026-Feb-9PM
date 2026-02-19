package coreJavaPrograms;

public class Calculator  // like a class room in a school 
{
	//PSVM  - public static void main
	//Modifier ReturnType name(){}
	//xxxxxx.main()
	public static void main(String[] args)  // is a student in the class room   , like class leader / rep
	{
		System.out.println("Welcome to Selenium Java Automation");
		System.out.println(MiniCalculator.branch);	
		System.out.println(MiniCalculator.collegeName);	
		//return 22;
	}
	
	//why main method should be public , static , void , main , String[] 
	
	public static void addition() // like a student
	{
		System.out.println("This is a program to add two numbers");
	}

}

class MiniCalculator
{
	static String collegeName = "JNTU";
	static String branch = "ECE";
}

class CommercialCalculator
{
	
}
