package multilevelInheritance;

import org.junit.Test;
//   A  extends    B          extends   C
// TestSuites  TestCases          Reusable Components
public class TestSuites extends TestCases {
	// ----------------Test Suites-------------
	//Smoke testing : high level / basic functionality test 
	//Regression testing : more number functional test cases / more end to end scenarios
	@Test
	public void smoke() {
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		replyToAnEMail();
	}
	@Test
	public void regression() {
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEMail();
		forwardAnEmail();
		DeleteMail();
	}
}
