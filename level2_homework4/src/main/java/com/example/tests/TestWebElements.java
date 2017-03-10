package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebElements {
	public static void main(String[] args) throws InterruptedException {
	// Create WebDriver Object 
	System.setProperty("webdriver.chrome.driver", "/Users/kristinasinelnikova/Downloads/chromedriver");
	ChromeDriver driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	//Go to Login Page of TestWave
	driver.get("http://testwave.qabidder.net/#/page/login");
	//Login into TestWave
	WebElement usernameTextBox = driver.findElement(By.id("exampleInputEmail1"));
	 usernameTextBox.sendKeys("ubertesterqa@gmail.com");
	WebElement passwordTextBox = driver.findElement(By.id("exampleInputPassword1"));
	passwordTextBox.sendKeys("12345password");
	Thread.sleep(3000);
	WebElement loginButton = driver.findElement(By.tagName("button")); loginButton.click();
	//Wait for next page to appear and Click on "Add Report"
	Thread.sleep(3000);
	WebElement reports = driver.findElement(By.linkText("Add Report")); reports.click();
	Thread.sleep(3000);
	//Select Cool Name using Radio Button
	List<WebElement> radioButtonLabels = driver.findElements(By.xpath("//fieldset/*[@class='ng-scope']//label"));
	for(int i=0;i<radioButtonLabels.size();i++){
	WebElement radioButtom = radioButtonLabels.get(i); System.out.println(radioButtom.getText()); 
	if(radioButtom.getText().equals("Cool Name")){
	WebElement radioButton1 = radioButtom.findElement(By.xpath("span"));
	radioButton1.click();
	break; }
	}
	//Go to Next page
	List<WebElement> nextButtons = driver.findElements(By.xpath("//a[text()='Next']"));
	for(int i=0;i<nextButtons.size();i++){
	WebElement nextButton = nextButtons.get(i); if(nextButton.isDisplayed()){
	nextButton.click();
	break; }
	} Thread.sleep(6000);
	// Enter Case ID
	WebElement caseId = driver.findElement(By.cssSelector("input[name='caseNumber']"));
	caseId.sendKeys("1111");
	// Select Suspect Type using Dropdown
	WebElement suspectType = driver.findElement(By.xpath("//select[@ng-model='wizard.report.suspectType']")); 
	suspectType.findElement(By.xpath("option[text()='Victim']")).click();
	// Enter Last Name
	WebElement lastName = driver.findElement(By.cssSelector("input[name='lastName']"));
	lastName.sendKeys("Smith");
	// Enter First Name
	Thread.sleep(3000);
	WebElement firstName = driver.findElement(By.cssSelector("input[name='firstName']"));
	firstName.sendKeys("John");
	// Select Build using Dropdown
	WebElement buildDropDown = driver.findElement(By.xpath("//select[@ng-model='wizard.report.build']")); 
	buildDropDown.findElement(By.xpath("option[text()='Obese']")).click();
	//Go to Next page
	for(int i=0;i<nextButtons.size();i++){
	WebElement nextButton = nextButtons.get(i); if(nextButton.isDisplayed()){
	nextButton.click();
	break; }
	} Thread.sleep(3000);
	//Select Checkbox scars
	driver.findElement(By.cssSelector("input[ng-model='wizard.report.scars']")).click();
	Thread.sleep(3000);
	// Switch to Gang Membership tab
	driver.findElement(By.cssSelector("div[title='Gang Membership']")).click();
	// Choose Distripution
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[ng-model='wizard.report.gangUnit']")).click();
	// Input stop location
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[ng-model='wizard.report.locationOfStop']")).sendKeys("LA");
	// Switch to Preview tab
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("div[title='Preview']")).click();
	// Publish report
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[ng-click='wizard.commitReport()']")).click();

	}
}