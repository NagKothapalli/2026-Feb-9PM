package interfaceConcept;

import org.junit.Test;

public class Customer_MiniCalc 
{
	//ArithematicOperations am = new ArithematicOperations();
	MiniCalculator mini = new MiniCalculator();
	CommercialCalculator comm = new CommercialCalculator();
	ArithematicOperations aMini = new MiniCalculator(); //10
	ArithematicOperations aComm = new CommercialCalculator(); //100
	
	@Test
	public void aCommBill() {
		comm.welcomeToCommercialCalc();
		aComm.addition(23, 56);		
	}
	
	@Test
	public void aMiniBill() {
		aMini.addition(44, 66);
		aMini.multiplication(55,40);		
	}
	
	@Test
	public void giveBill() {
		mini.welcomeToMiniCalc();
		mini.addition(24, 46);
	}
}
