package multilevelInheritance;

public class ReusableComponents {
	//------------------------------Reusable Component ----------------------------------
		protected void launchApplication() {
			System.out.println("RC : Launch Gmail Application"); // 10 lines
		}
		
		protected void loginToApplication() {
			System.out.println("RC : Login to Gmail Application"); // 10 lines
		}
		protected void logoutFromApplication() {
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
