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
	
	
	
	
	
	
	
	
	
	
	
	
	

}
