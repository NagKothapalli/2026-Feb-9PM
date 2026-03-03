package interfaceConcept;

public class CommercialCalculator implements ArithematicOperations {

	public void welcomeToCommercialCalc() {
		System.out.println("Welcome to Commercial Calculator");
	}
	
	public void addition(int x,int y) {
		int sum = x+y;
		System.out.println("Implementation from Commercial Calc");
		System.out.println("Sum of two numbers :" + sum);
	}
	
	public void division(int x,int y) {
		int div = x/y;
		System.out.println("Division of two numbers :" + div);
	}
	
	public void subtraction(int x,int y) {
		int diff = x-y;
		System.out.println("Difference of two numbers :" + diff);
	}
	public void multiplication(int x,int y) {
		int prod = x*y;
		System.out.println("Product of two numbers :" + prod);
	}
}
