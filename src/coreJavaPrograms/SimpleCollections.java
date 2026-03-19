package coreJavaPrograms;

import java.util.ArrayList;

import org.junit.Test;

public class SimpleCollections {
	
	//Array - group of elements with similar data types
	
	//group of students - names / number / grades 
	
	int rollNum = 22;   // single value
	
	int[]  rollNUmbers = {12,14,13,7,6,9,80,23}; // static array or fixed array  // group of values 
	
	//Declare , assign , length , read values , write values in to the array 
	@Test
	public void fixedArray() {
		int[]  rollNumbers = {12,14,13,7,6,9,80,23}; // india - how many states 
		int count = rollNumbers.length;
		System.out.println("Array Length :" + count);
		// i=0 1 2 3 4 5 6 7 ... 8th index
		for(int i=0;i<=count;i++) {
			System.out.println(rollNumbers[i]);
		}
		System.out.println("--------------------------------");
		for(int num:rollNumbers) {
			System.out.println(num);
		}
	}
	
	//Dynamic Array - 40 students but their total marks is not known 
	@Test
	public void dynamicArray() {
		int[] students = new int[40];
		for(int i=0;i<students.length;i++) {
			students[i] = i+22; // 0+22 , 1+22 , 2+22 ..i..i...i..i..i.
		}
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
	
	
	//Need the student numbers who got distinction  - here we use arraylist which is a dynamic collection
	//Generic types are wrapper classes on top of primitive data types in java 
	 // int -> Integer   , boolean -> Boolean , String 
	//List  - interface , implemented by different classes like ArrayList , LinkedList  , list will allow duplicate values 
	//Set  - will not allow duplicate values 
	@Test
	public void myArrayList() {
		ArrayList<Integer>  mylist = new ArrayList<Integer>();
		for(int i=0;i<20;i++) {
			mylist.add(22+i);  // at index 0 -> 22 1  2 3 4 ....10
		}
		
		for(int i=0;i<20;i++) {
			System.out.println(mylist.get(i));
		}
		
		mylist.remove(2);
	}
	
	
	
	
	
	
	
	
	
	
	

}
