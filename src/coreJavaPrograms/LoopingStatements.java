package coreJavaPrograms;

import org.junit.Test;

public class LoopingStatements {
	
	//for(iterator , how long , step size){  Task   } 
	@Test
	public void printFirstTenNumbers() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
	}
	@Test
	public void printFirstTenNumbersInline() {
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.print(6);
		System.out.print(7);
		System.out.print(8);
		System.out.print(9);
		System.out.print(10);
	}
	
	@Test
	public void printNumbers() {
		for(int i=1;i<=40;i=i+1) {  // i=1 1<=40  i=2 2<40  i=3 3<40 i=4 4<40
			System.out.println(i); // 1 2 3 4 ....
		}
	}
	
	// Do some rounds around the temple - 101
	@Test
	public void doRounds() {
		for(int round=1;round<=101;round++) {  // 1<101 , 98<101 100 <101 101<101
			System.out.println("Round Number :" + round);
		}
	}
	
	//different step sizes ,  nested loop , having condition inside a loop
	
	//break inside for loop
	@Test
	public void findStudent() {
		// 50 students 1-50 , need 22  [50]
		for(int i=1;i<=50;i=i+1) {
			System.out.println("Searching roll numbers :" + i);  // i =1 2 3 4 5 
			if(i==22)// 1=22->F 2=22 F , 3=22 4=22  ....... 21=22 22=22
			{
				System.out.println("Found the student , Roll Num : 22");
				break;
			}
		}
	}
	
	// print only even numbers from 1-50
	@Test
	public void printEvenNumbers() {
		for(int i=2;i<50;i=i+2)  // i++ : i=i+1
		{
			System.out.println(i);
		}
	}
	// print only odd numbers from 1-50
	@Test
	public void printOddNumbers() {
		for(int i=1;i<50;i=i+2)  // i++ : i=i+1
		{
			System.out.println(i);
		}
	}
	
	// Apply color to the steps of the building with 5 floors each floor having 20 steps , use different color for every floor 
	@Test
	public void applyColorToBuilding() {
		for(int i=1;i<=5;i++)  // outer loop
		{
			System.out.println("I am in Floor :" + i);  // 20 steps
			for(int j=1;j<=20;j++) //inner loop
			{
				System.out.println("Apply color in Floor Number :"+ i + " to Step Number :" + j);
			}
			
		}
	}
	
	//for each
	//while
	@Test
	public void printMyNumbers() {
		int i=50;
		while(i>0) {
			System.out.println("Wait for him");
			i--;
		}
	}
	
	
	
	

}
