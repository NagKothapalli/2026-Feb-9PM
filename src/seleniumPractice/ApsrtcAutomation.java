package seleniumPractice;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcAutomation {
	
	WebDriver driver;
	
	public ApsrtcAutomation() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/");
	}
	
	@Test
	public void bookBusTicket() throws InterruptedException {
		System.out.println("Test Case  : Book Bus Ticket ");
		//enter from city , to city , date , click on check availability
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	@Test
	public void handleWebAlert() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		Thread.sleep(1000);
		Alert myalert = driver.switchTo().alert();
		System.out.println("Alert Text Msg :" + myalert.getText());
		//driver.switchTo().alert().accept();
		myalert.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}

	String timetableXpath = "//a[@title='TimeTable / Track']";
	String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	@Test
	public void handleMultipleWindows() {
		//driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		//clickElement("//a[@title='TimeTable / Track']");
		clickElement(timetableXpath);
		clickElement(allServicesXpath);
		Set<String> sessions = driver.getWindowHandles();  // 10 sessions i=1 id1 , i=2 id2 .......
		for(String id:sessions) {
			System.out.println(id);
			driver.switchTo().window(id);  // i=1  , i=2
			System.out.println("Title of the window :" + driver.getTitle());
		}
		
	}
	
	//Utility function
	public void clickElement(String myxpath) {
		driver.findElement(By.xpath(myxpath)).click();
	}
	
	
	
	
	
	
	
	
	
}
