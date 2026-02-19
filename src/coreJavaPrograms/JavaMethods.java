package coreJavaPrograms;

public class JavaMethods {
	
	//write some programs to perform addition , subtraction , multiplication , division
	// a = 12 ; b = 14; ->  c = a+b 
	public static void MainWithoutFunctions(String[] arg) {
		System.out.println("Welcome to java methods practice");
		int a = 18 ; 
		int b = 14;
		int c = a+b ;
		//Compose Email - 40
		//
		//
		//
		//
		//
		//
		//
		String d = "Demo + operator Functionality";
		// int+int = int  / String + int = String , String + String = String / int+String = String		
		System.out.println("Sum of Two Numbers :" + c);  // String + int = String
		//Reply Email - 40
				//
				//
				//
				//
				//
				//
				//
		int s = a-b;
		System.out.println("Difference of Two Numbers :" + s);
		
		int m = a*b;
		System.out.println("Product of two Numbers :" + m);
		//Compose Email - 40
				//
				//
				//
				//
				//
				//
				//
		int div = a/b;
		System.out.println("Division of two numbers :" + div);
		//Compose Email - 40
				//
				//
				//
				//
				//
				//
				//
		//System.out.println(a+b);
		//System.out.println(d+a);
		//System.out.println(d+d);
		//System.out.println(b+d);
		
	}
	
	public static void main2(String[] args) {
		System.out.println("Calculator functions");
		addition(); //this a call to the addition function
		subtraction();
		multiplication();
		division();
	}
	public static void main3(String[] args) {
		System.out.println("Calculator functions with arguments");
		addition();
		addition();
		addition();
		addition(10,20);
		addition(50,20);
		addition(90,20);
	}
	public static void main(String[] args) {
		System.out.println("Employee Salaries");
		//Ram - daily - 5000
		int monthlySal = employeeSalary(5000);
		creditEmpSalary(monthlySal);
	}
	//Modifier ReturnType name(){ } 
	public static void addition() {
		int x = 22; //hard coded values
		int y = 14;
		int z = x+y;
		System.out.println("Sum of Two Numbers :" + z);
	}
	
	public static void creditEmpSalary(int salary) {
		System.out.println("Credited in to emp salary account : " + salary);
	}
	
	public static int employeeSalary(int perDay) {
		int salary = 30 * perDay ;
		return salary;
	}
	
	public static void addition(int num1, int num2) {
		//int x = 22; //hard coded values
		//int y = 14;
		int z = num1+num2;
		System.out.println("Sum of Two Numbers with arguments:" + z);
	}
	
	public static void subtraction() {
		int x = 22;
		int y = 44;
		int z = x-y;
		System.out.println("Difference of Two Numbers :" + z);
	}
	public static void multiplication() {
		int x = 22;
		int y = 44;
		int z = x*y;
		System.out.println("Produt of Two Numbers :" + z);
	}
	public static void division() {
		int x = 222;
		int y = 44;
		int z = x/y;
		System.out.println("Division of Two Numbers :" + z);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
