package coreJavaPrograms;

import org.junit.Test;

public class GmailAutomation {
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
//------------------------------Reusable Component ----------------------------------
	public void launchApplication() {
		System.out.println("RC : Launch Gmail Application"); // 10 lines
	}
	
	public void loginToApplication() {
		System.out.println("RC : Login to Gmail Application"); // 10 lines
	}
	public void logoutFromApplication() {
		System.out.println("RC : Logout From Application"); // 10 lines
	}
	public void closeApplication() {
		System.out.println("RC : Close Application"); // 10 lines
	}
	public void compose() {
		System.out.println("RC : Compose Email and Send"); // 10 lines
	}
	public void reply() {
		System.out.println("RC : Reply to Email"); // 10 lines
	}
	public void forward() {
		System.out.println("RC : Forward email"); // 10 lines
	}
	public void delete() {
		System.out.println("RC : Delete email"); // 10 lines
	}
	public void navigateToInbox() {
		System.out.println("RC : Navigate to Inbox"); // 10 lines
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
