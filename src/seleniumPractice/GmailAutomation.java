package seleniumPractice;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class GmailAutomation {
	
	ChromeDriver  driver = new ChromeDriver();
	@Before  //this will be executed before every test method
	public void launchApplication() throws InterruptedException {
		System.out.println("Launch Gmail Application");
		//open google chrome browser
		 // it will open an empty google chrome browser
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
		//driver.findElement(By.id("identifierId")).click();
		//driver.findElement(By.id("identifierId")).sendKeys("afhskjfhdsjlfkdsj");
		//Thread.sleep(2000);
		//driver.findElement(By.id("identifierId")).clear();
		//Thread.sleep(2000);
		//driver.findElement(By.id("identifierId")).sendKeys("nag022@gmail.com");
		
	}
	//selenium selectors / locators : id , name , class , cssSelector , linkText , partialLinkText , xpath
	//Different webelements : textbox , button , radio btn , chk box , list ,frame 
	@Test
	public void loginToApplication() throws InterruptedException {
		//launchApplication();
		System.out.println("Login to Application");
		//enter username
		WebElement email = driver.findElement(By.name("identifier"));
		email.click();
		email.clear();
		email.sendKeys("dsfsdfsfsfsdffsf");
		Thread.sleep(2000);
		email.clear();
		email.sendKeys("nag022@gmail.com");
		Thread.sleep(2000);
		driver.findElements(By.className("VfPpkd-vQzf8d")).get(1).click();
	}
	@Test
	public void learnMore() {
		//  Learn more about using Guest mode
		//driver.findElement(By.linkText("Learn more about using Guest mode")).click();
		driver.findElement(By.partialLinkText("Learn more about using")).click();
		
	}
	//xpath -> Absolute xpath :   //*[@id="yDmH0d"]/c-wiz/main/div[2]/div/div/div[1]/span/section/div/div/div[3]/button
	
	//Relative xpath :  //button[text()='Forgot email?']
	//tagName[text()='']
	//tagName[@id=""]
	//tagName[@name=""]
	//tageName[@id='' && text()='fdfsdfhj']
	//tagName[contains(text(),'dfsfsfs')]
	//tagName[contains(id,'dfsfsfs')]
	//tagName[contains(name,'dfsfsfs')]
	@Test
	public void forgotEmail() {
		//driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/main/div[2]/div/div/div[1]/span/section/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
	}
	
	//  /html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[2]/div/div/div[1]/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/input
	@Test
	public void absoluteXpath() {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[2]/div/div/div[1]/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("nag022");
	}
	@Test
	public void enterEmail() {
		String myxpath = "/html/body/div[2]/div[1]/div[1]/div[2]/c-wiz/main/div[2]/div/div/div[1]/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/input";
		driver.findElement(By.xpath(myxpath)).sendKeys("nag022@gmail.com");
	}
	@Test
	public void enterEmailWithRelativeXpath() {
		//xpath1 -   //input[@name='identifier']		
		//driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("nag022@gmail.com");
		String xpath2 = "//input[@id='identifierId']";
		//driver.findElement(By.xpath(xpath2)).sendKeys("nag022@gmail.com");
		String xpath3 = "//input[@type='email']";
		//driver.findElement(By.xpath(xpath3)).sendKeys("nag022@gmail.com");
		String xpath4 = "//input[@aria-label='Email or phone']";
		//driver.findElement(By.xpath(xpath4)).sendKeys("nag022@gmail.com");
		//String xpath5 = "//div[text()='Email or phone']";
		//driver.findElement(By.xpath(xpath5)).sendKeys("nag022@gmail.com");
	}
	//org.openqa.selenium.ElementNotInteractableException: element not interactable
	
	@Test
	public void DemoNoSuchElementException() {
		String xpath4 = "//input[@aria-label='Email or phoneNumber']";
		driver.findElement(By.xpath(xpath4)).sendKeys("nag022@gmail.com");
		//org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//input[@aria-label='Email or phoneNumber']"}
	}
	
	//WebElement is an interface in webdriver , it contains methods like click , clear , sendkeys ,
	    // isDisplayed , isEnabled , isSelected , findElement , findElements 
	
	// findElement , findElements  are the methods available in two interfaces - WebDriver , WebElement
	@Test
	public void containsOptionInRelativeXpath() {
		String myxpath = "//input[contains(@aria-label,'Email')]";
		//driver.findElement(By.xpath(myxpath)).sendKeys("nag022@gmail.com");
		WebElement email = driver.findElement(By.xpath("//input[contains(@aria-label,'Email')]"));
		String mytext = email.getText();
		System.out.println("My text on the object :" + mytext);
		//email.isDisplayed();
		if(email.isDisplayed()  && email.isEnabled()) {
			email.click();
			email.sendKeys("nag022@gmail.com");
		}
		
	}
	
	@Test
	public void readAttributes() {		
	WebElement element = driver.findElement(By.xpath("//button[text()='Forgot email?']"));
	System.out.println(element.getText());
	System.out.println(element.getTagName());
	System.out.println(element.getAttribute("jsname"));
	System.out.println(element.getAttribute("type"));
	}
	
	//how many links / hyperlinks are there in the given web page 
	// all links will start with anchor tag - //a
	@Test
	public void getAllWebLinksInThePage() {
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Number of hyperlinks :" + links.size());
		//normal for loop
		for(int i=0;i<links.size();i++) {
			System.out.println(i);
			System.out.println(links.get(i).getText());
			if(links.get(i).getText().equals("Privacy")) {
				links.get(i).click();
				break;
			}
		}
		//System.out.println("----------------------------");
		// foreach loop
		/*
		 * for(WebElement ele:links) { System.out.println(ele.getText()); }
		 */	}
	
	
	
	
	
	

}
