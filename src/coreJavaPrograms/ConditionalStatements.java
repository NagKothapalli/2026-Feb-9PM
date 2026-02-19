package coreJavaPrograms;

import org.junit.Test;

public class ConditionalStatements {
	int num1 = 44 ;
	int num2 = 22;  // instance variables , scope will be at class level
	
	// a=b , a>b , a<b , a>=b , a<=b
	
	//if(expression -> boolean : true / false) {  task }
	public void numbers() {
		int num3 = 66; // local variable , scope will be at method level
		System.out.println("My third number :" + num3);
	}
	//operators : = assignment , == relational == , > ,< ,>= ,<= , !=
	//operators : 4 groups - arithematic : + ,- , * , / , assignment , relational ,logical
	//in case two numbers are same print the msg as they are equal
	@Test
	public void simpleIfCondition() {
		int a=66; int b=66;
		if(a==b) {
			//true : execution control will come to if block 
			System.out.println("Both the Numbers are same");
		}
	}
	@Test
	public void simpleIfElseCondition() {
		int a=66; int b=66; //Hard coded values are not correct
		System.out.println("First Number : " + a);
		System.out.println("Second Number : " + b);
		if(a==b) {
			//true : execution control will come to if block 
			System.out.println("Both the Numbers are same");
		}
		else {
			System.out.println("Both the Numbers are not equal");
		}
	}
	@Test
	public void ifElseCondition_test() {
		ifElseCondition(40,40); // 50 % of code will be covered
		ifElseCondition(60,40);//50 % of code will be covered
	}
	
	public void ifElseCondition(int first,int second) {
		//int a=66; int b=66; //Hard coded values are not correct
		System.out.println("First Number : " + first);
		System.out.println("Second Number : " + second);
		if(first==second) {
			//true : execution control will come to if block 
			System.out.println("Both the Numbers are equal");
		}
		else {
			System.out.println("Both the Numbers are not equal");
		}
	}
	

}
