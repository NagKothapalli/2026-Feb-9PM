package seleniumPractice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class GmailAutomation {
	
	@Test
	public void launchApplication() throws InterruptedException {
		System.out.println("Launch Gmail Application");
		//open google chrome browser
		ChromeDriver  driver = new ChromeDriver(); // it will open an empty google chrome browser
		//FirefoxDriver  driver = new FirefoxDriver(); 
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		String sessionID = driver.getWindowHandle();
		System.out.println("MySessionID :" + sessionID);
		String title = driver.getTitle();
		System.out.println("My Title :" + title);
		String url = driver.getCurrentUrl();
		System.out.println("My Current URL :" + url);
		//assertion / validation
		Assert.assertEquals("Gmail", title);  // Hard assertion
		/*
		 * if(title.equals("Gmaill")) { System.out.println("Title validation Passed"); }
		 * else { System.out.println("Title Validation Failed"); }
		 */
		driver.findElement(By.id("identifierId")).click();
		driver.findElement(By.id("identifierId")).sendKeys("afhskjfhdsjlfkdsj");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("nag022@gmail.com");
		
	}
	
	public void loginToApplication() {
		System.out.println("Login to Application");
		//enter username
	}
	
	
	
	
	
	
	

}
