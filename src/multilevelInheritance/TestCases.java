package multilevelInheritance;

import org.junit.Test;
//				child					parent
public class TestCases extends ReusableComponents
{
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
