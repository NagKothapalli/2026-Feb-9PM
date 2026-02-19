package coreJavaPrograms;

//Naming conventions PACKAGE : It should follow Camel Case - First letter must be lower case , No space , No special chars , numbers , no underscore 
//Naming conventions CLASS : It should follow Pascal Case - First letter must be upper case , No space , No special chars , numbers , no underscore , noun

//Syntax : Modifier class Name {  members of the class - functions / variables  }
      //    public  class SeleniumProject {  members     }
//Modifier : Access Modifiers /  Non Access Modifiers

public class BasicJavaPrograms 
{
	
	//Naming conventions of variable [Member of a class ] : it can start with _ , $ , a-z , A-Z    /   it should follow camelCasing
	// Constructor : name of the constructor must be same as name of the class -  Selenium / Selenium
	
	//Syntax VARIABLE :  Modifier[opt] DataType Name; -Declaration           Modifier DataType Name = value ;  - Declare and Assign the value
	
	public int rollNumber = 22;
	
	int student_Number;    int _number;   int $number;  int std$number;    int StudentNumber;
	
	int StudentNumber2;  int Student2Number;  
	
	//  int 1StudentNumber;
	
	// int &StudentNumber;   
	
	//int student Number;
	
	int a=23; int b = 45;  int c=58;
	
	int rollNum = 23;
	int batchCode = 45;
	int collegeCode = 58;
	
	protected String studentName;
	
	public static String collegeName = "JNTUH";
	
	public double intrestRate = 8.5;
	
	char studentGrade = 'a';  // default access modifier - package level 
	
	public boolean studentResult = true;  // Array - Collections
	
	//Synatx / Signature of a method / function 
	
	//  brackets [ ]   - square  ( )  - paranthesis   {  }   - curly braket
	
	// Modifier  ReturnType Name();  - Abstract method - A method without body / implementation  [ Will be present in an interface / abstract class ]     
	
	//Modifier[opt]  ReturnType Name() { body - implementation  }   -  Concrete method
	
	//Modifier[opt]  ReturnType Name(arguments[opt]) { body - implementation  }
									//DataType arg1,Datatype arg2,......
	
	//Modifiers - Access Modifiers : public , private , default , protected
	
	         // Non Access Modifiers  : static , final 
	// 0  0 
	public static void addition()  // method overloading - polymorphism
	{
		//body
	}
	// 0 1
	public void addition(int number)
	{
		//body
	}
	// 0  1
	public void addition(int english,int maths)
	{
		//body
	}
	// 1 0 
	
	//  1  1
	
	
}
