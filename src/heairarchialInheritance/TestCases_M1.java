package heairarchialInheritance;

import org.junit.Test;
//				child					parent
public class TestCases_M1 extends ReusableComponents
{
	/*
	 * void loginToApplication() {
	 * System.out.println("RC : Login to Gmail Application from TestCases class");
	 * // 10 lines }
	 */
	//-----------------------------Test Cases ---------------------------------------
		@Test  // Ramesh - jira ticket
		public void composeAndSendAnEmail() {
			System.out.println("Test Case : Compose And Send An Email");
			//launch - open an empty browser , call gmail application , make sure app loaded properly -10 lines		
			//login to gmail - enter user , enter pw , click login btn , verify user login and correct user logged in - 20
			//go to Inbox , compose , send , logout , close
			launchApplication();
			loginToApplication();
			navigateToInbox();
			compose();
			logoutFromApplication();
			closeApplication();
		}
		
		@Test  // Ram - jira ticket 
		public void replyToAnEMail() {
			System.out.println("Test Case : Reply To An Email");
			//launch , login , go to inbox , logout , close 
			launchApplication();
			loginToApplication();
			navigateToInbox();
			reply();
			logoutFromApplication();
			closeApplication();
		}

	
}
