package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Set;
import java.util.*;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcAutomation {
	
	WebDriver driver;
	DriverUtilities utils;
	public ApsrtcAutomation() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.apsrtconline.in/");   // dev / qa / stage / prod
		driver.get(ReadTestData.getData("URL"));
		utils = new DriverUtilities(driver);
	}
	//***********************Relative xpaths****************************************************
	String timetableXpath = "//a[@title='TimeTable / Track']";
	String homeXpath = "//a[@title='Home']";
	String allServicesXpath = "//a[text()='All services Time Table & Tracking']";
	String fromCityXpath = "//input[@name='source']";
	String toCityXpath = "//input[@name='destination']";
	String openCalendarXpath = "//input[@name='txtJourneyDate']";
	String jDateXpath = "//a[text()='25']";
	String searchBtnXpath = "//input[@name='searchBtn']";
	//***************************************************************************
	//Read Test Data 
	@Test
	public void readTestDataFromPropertiesFile() throws IOException {
		FileInputStream myfile = new FileInputStream("TestData/ApsrtcData.properties");  // News paper
		Properties prop = new Properties();  // is like news reader
		prop.load(myfile); // handover the newspaper to news reader
		String myurl = prop.getProperty("URL");
		System.out.println("URL form the file :" + myurl);
		System.out.println(prop.getProperty("FromCity"));
		System.out.println(prop.getProperty("ToCity"));
		System.out.println(prop.getProperty("JDate"));
		System.out.println(prop.getProperty("UserName"));
		System.out.println(prop.getProperty("PassWord"));
	}
	
	/*
	 * public String getData(String mykey) throws IOException { FileInputStream
	 * myfile = new FileInputStream("TestData/ApsrtcData.properties"); // News paper
	 * Properties prop = new Properties(); // is like news reader prop.load(myfile);
	 * // handover the newspaper to news reader String value =
	 * prop.getProperty(mykey); return value; }
	 */
	@Test
	public void bookBusTicket() throws InterruptedException {
		System.out.println("Test Case  : Book Bus Ticket ");
		//enter from city , to city , date , click on check availability
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");  // Hard coded data 
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR"); // Hard coded data 
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		driver.findElement(By.xpath("//a[text()='25']")).click();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test  // flaky test cases 
	public void bookBusTicket_TestData() throws InterruptedException, IOException {
		System.out.println("Test Case  : Book Bus Ticket ");
		//enter from city , to city , date , click on check availability
		//ReadTestData.getData("URL");
		String city = ReadTestData.getData("FromCity");
		
		utils.enterText(fromCityXpath,city);  // Hard coded data 
		utils.fixedWait(1);		
		utils.clickEnter(fromCityXpath);		
		utils.enterText(toCityXpath,ReadTestData.getData("ToCity"));
		utils.fixedWait(1);		
		utils.clickEnter(toCityXpath);
		utils.clickElement(openCalendarXpath);
		String jd = ReadTestData.getData("JDate");
		String jDateXpath = "//a[text()='"+jd+"']";   //a[text()=28]  - dynamic xpath
		utils.clickElement(jDateXpath);
		utils.clickElement(searchBtnXpath);
	}
	@Test
	public void bookBusTicket_Utility() throws InterruptedException {
		System.out.println("Test Case  : Book Bus Ticket ");
		//enter from city , to city , date , click on check availability
		utils.enterText(fromCityXpath,"HYDERABAD");  // Hard coded data 
		utils.fixedWait(1);		
		utils.clickEnter(fromCityXpath);		
		utils.enterText(toCityXpath,"GUNTUR");
		utils.fixedWait(1);		
		utils.clickEnter(toCityXpath);
		utils.clickElement(openCalendarXpath);
		utils.clickElement(jDateXpath);
		utils.clickElement(searchBtnXpath);
		
		//Thread.sleep(1000);
				//driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.TAB);
				//driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR"); // Hard coded data 
		//Thread.sleep(1000);
				//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.TAB);
				//driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//driver.findElement(By.xpath("//a[text()='25']")).click();
		//driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
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

	
	@Test
	public void handleMultipleWindows() {
		//driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		//clickElement("//a[@title='TimeTable / Track']");
		utils.clickElement(timetableXpath);
		utils.clickElement(allServicesXpath);
		Set<String> sessions = driver.getWindowHandles();  // 10 sessions i=1 id1 , i=2 id2 .......
		//for(String id:sessions) {
			//System.out.println(id);
			//driver.switchTo().window(id);  // i=1  , i=2
			//System.out.println("Title of the window :" + driver.getTitle());
		//}
		//converting Set to ArrayList
		ArrayList<String> allWindows = new ArrayList<String>(sessions);
		for(int i=0;i<allWindows.size();i++) {
			String sID = allWindows.get(i); // i=0 , 1 , 2 .....
			driver.switchTo().window(sID);  // i=1  , i=2
			System.out.println("Title of the " + i + " th window :" + driver.getTitle());
		}
		driver.switchTo().defaultContent();
		driver.switchTo().window(allWindows.get(1));
		System.out.println("Title of the 2nd window :" + driver.getTitle());
		driver.close(); // it will close the current active window
		//driver.quit(); //org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		driver.switchTo().window(allWindows.get(0));
		utils.clickElement(homeXpath);
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		System.out.println("Title of the 1st window :" + driver.getTitle());
		driver.quit(); // it will kill the driver instance 
	}
	
	//****************************Utility function
	
	
	
	
	
	
}
