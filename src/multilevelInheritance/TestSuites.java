package multilevelInheritance;

import org.junit.Test;
//   A  extends    B          extends   C
// TestSuites  TestCases          Reusable Components
public class TestSuites extends TestCases {
	/*
	 * void loginToApplication() {
	 * System.out.println("RC : Login to Gmail Application from TestSuites class");
	 * // 10 lines }
	 */
	// ----------------Test Suites-------------
	//Smoke testing : high level / basic functionality test 
	//Regression testing : more number functional test cases / more end to end scenarios
	//this , super
	@Test
	public void smoke() {
		//this.loginToApplication();
		//super.loginToApplication();
		//loginToApplication();
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
