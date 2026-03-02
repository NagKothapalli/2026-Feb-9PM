package heairarchialInheritance;

import org.junit.Test;
//				child					parent
public class TestCases_M2 extends ReusableComponents
{
	/*
	 * void loginToApplication() {
	 * System.out.println("RC : Login to Gmail Application from TestCases class");
	 * // 10 lines }
	 */
	//-----------------------------Test Cases ---------------------------------------
	

		@Test  // Suresh - jira ticket 123
		public void forwardAnEmail() {
			System.out.println("Test Case : Forward An Email");
			//launch , login , go to inbox , logout , close 
			launchApplication();
			loginToApplication();
			navigateToInbox();
			forward();
			logoutFromApplication();
			closeApplication();
		}

		@Test  // Arun
		public void DeleteMail() {
			System.out.println("Test Case : Delete Email");
			//launch , login , go to inbox , logout , close 
			launchApplication();
			loginToApplication();
			navigateToInbox();
			delete();
			logoutFromApplication();
			closeApplication();
		}

}
