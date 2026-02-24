package coreJavaPrograms;

import org.junit.Test;

public class StringOperations {
	
	String a = "      Welcome To Java         ";
	//String a = "      Welcome To Java         ";
	String name = "Ram";
	String dept = "ECE34324%$^%$^4";
	
	@Test
	public void dataTypeMissmatch() {
		int number = 22;
		String name = "Ram";
		// int id = "Krishna"; // Typemissmatch error
		// String dept = 44;
		byte sal = 23;  // 1 kg
		short mysal = 23667; // 5 kg 
		mysal = sal; // byte converted to short -> up casting
		int basicsal = 234554665; //double  10 kg bag
		double grossSalary = 4567567.98; // 40 kg bag
	}
	@Test
	public void demoLength() {
		int count = a.length();
		System.out.println("Character count :" + count);
		String aT = a.trim();
		System.out.println("Original string :" + a);
		System.out.println("String after trim :" + aT);
		System.out.println("Char count after trim :" + aT.length());
	}
	//case conversion , compare , sub string , split 
	@Test
	public void caseConversion() {
		//String aL = a.toLowerCase();
		String aL =  a.trim().toLowerCase();
		System.out.println("String after lowercase conversion :" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String after uppercase conversion :" + aU);
	}
	@Test
	public void stringComparision() {
		String first = "   Welcome To Java           ";
		String second = "  Welcome To JAVA    ";
		boolean result = first.equals(second);
		
		String ft = first.trim();
		String ftl = ft.toLowerCase();
		
		String st = second.trim();
		String stl = st.toLowerCase();
		
		//System.out.println(result);
		//if(first.equals(second))
		//if(first.trim().equals(second.trim()))
		//if(first.trim().toLowerCase().equals(second.trim().toLowerCase())) //true
		//if(ftl.equals(stl))
		if(first.trim().equalsIgnoreCase(second.trim()))
		{
			System.out.println("Both Strings are equal");
		}
		else {
			System.out.println("Both Strings are not equal");
		}
	}
	@Test
	public void splitOperation() {
		String a = "      Welcome To Java         ";
		String[] arr = a.trim().split(" ");
		for(String temp:arr)  // for each
		{
			System.out.println(temp);  // i=1 2 3
		}
	}
	
	@Test
	public void subStringOperation() {
		String a5 = a.trim().substring(5);
		System.out.println(a5);
		CharSequence a09 = a.trim().subSequence(0, 9);
		System.out.println(a09);
	}
	@Test
	public void stringContains() {
		String a = "      Welcome To Java         ";
		String b = "JAVA";
		boolean result = a.trim().toUpperCase().contains(b.trim().toUpperCase());
		System.out.println(result);
	}
	
	//charAt , tocharArray , Arrays
	
	//OOPs -> inheritance
	
	

}
