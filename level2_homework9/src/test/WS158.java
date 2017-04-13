package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WS158 {
	public static void main(String[] args) throws InterruptedException {
	// Create WebDriver Object 
	System.setProperty("webdriver.chrome.driver", "/Users/kristina_sinelnikova/Downloads/chromedriver");
	ChromeDriver driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	
	//Go to Login Page of TestWave
	driver.get("http://testwave.qabidder.net/#/page/login");
	
	//Login into TestWave
	WebElement usernameTextBox = driver.findElement(By.id("exampleInputEmail1"));
	 usernameTextBox.sendKeys("ubertesterqa@gmail.com");
	WebElement passwordTextBox = driver.findElement(By.id("exampleInputPassword1"));
	passwordTextBox.sendKeys("12345password");
	
	Thread.sleep(3000);
	WebElement loginButton = driver.findElement(By.tagName("button")); loginButton.click();
	
	//Uncheck Published On filter
	WebElement enablePublishedOn = driver.findElement(By.cssSelector("input[ng-model='enablePublishedOn']"));
	enablePublishedOn.click();
	
	//Activate last name input field
	WebElement LastNameInput = driver.findElement(By.cssSelector("input[ng-model='slnSearchKey']"));
	LastNameInput.click();
	
	}
}
	