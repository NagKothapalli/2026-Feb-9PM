package coreJavaPrograms;

import org.junit.Test;

public class StringOperations {
	
	String a = "      Welcome To Java         ";
	String name = "Ram";
	String dept = "ECE34324%$^%$^4";
	@Test
	public void demoLength() {
		int count = a.length();
		System.out.println("Character count :" + count);
		String aT = a.trim();
		System.out.println("Original string :" + a);
		System.out.println("String after trim :" + aT);
		System.out.println("Char count after trim :" + aT.length());
	}

}
