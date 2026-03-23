package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DriverUtilities {
	
	WebDriver driver;
	public DriverUtilities(WebDriver mydriver) // local variable - 1234
	{
		driver = mydriver; // 1234 = 1234
	}
	
	public void clickElement(String myxpath) {
		driver.findElement(By.xpath(myxpath)).click();
	}
	public void enterText(String myxpath,String text) {
		driver.findElement(By.xpath(myxpath)).sendKeys(text);
	}	
	public void clickEnter(String myxpath) {
		driver.findElement(By.xpath(myxpath)).sendKeys(Keys.ENTER);
	}
	public void fixedWait(int waitTime) throws InterruptedException {
		Thread.sleep(waitTime * 1000);
	}

}
