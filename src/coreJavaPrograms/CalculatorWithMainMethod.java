package coreJavaPrograms;

public class CalculatorWithMainMethod 
{
	public static void main(String[]  args) {
		System.out.println("Demonstrate function calls from Main Method");
		/*
		 * addition(222,44); subtraction(252,44); multiplication(22,44);
		 * division(212,44); addition(222,44); subtraction(252,44);
		 * multiplication(22,44); division(212,44); addition(222,44);
		 * subtraction(252,44); multiplication(22,44); division(212,44);
		 * addition(222,44); subtraction(252,44); multiplication(22,44);
		 * division(212,44); addition(222,44); subtraction(252,44);
		 * multiplication(22,44);
		 */
		division(212,44);
		addition(222,44);
		subtraction(252,44);
		multiplication(22,44);
		division(212,44);
		addition(222,44);
		subtraction(252,44);
		multiplication(22,44);
		division(212,44);
		addition(222,44);
		subtraction(252,44);
		multiplication(22,44);
		division(212,44);
		addition(222,44);
		subtraction(252,44);
		multiplication(22,44);
		division(212,44);
		addition(222,44);
		subtraction(252,44);
		multiplication(22,44);
		division(212,44);
	}
	//Method overloading
	public static void addition(int num1) {
		int sum = num1+50;
		System.out.println("Sum of Num1+50 Numbers :" + sum);
	}
	public static void addition(int num1,int num2) {
		int sum = num1+num2;
		System.out.println("Sum of Two Numbers :" + sum);
	}
	public static void addition(int num1,int num2,int num3) {
		int sum = num1+num2+num3;
		System.out.println("Sum of Three Numbers :" + sum);
	}
	public static void subtraction(int a,int b) {
		int diff = a-b;
		System.out.println("Difference of Two Numbers :" + diff);
	}
	public static void multiplication(int num1,int num2) {
		int prod = num1*num2;
		System.out.println("Product of Two Numbers :" + prod);
	}
	public static void division(int num1,int num2) {
		int div = num1+num2;
		System.out.println("Division of Two Numbers :" + div);
	}

}
