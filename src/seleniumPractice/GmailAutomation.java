package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
	
	@Test
	public void launchApplication() {
		System.out.println("Launch Gmail Application");
		//open google chrome browser
		ChromeDriver  driver = new ChromeDriver(); // it will open an empty google chrome browser
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		String sessionID = driver.getWindowHandle();
		System.out.println("MySessionID :" + sessionID);
		String title = driver.getTitle();
		System.out.println("My Title :" + title);
		String url = driver.getCurrentUrl();
		System.out.println("My Current URL :" + url);
		
	}

}
