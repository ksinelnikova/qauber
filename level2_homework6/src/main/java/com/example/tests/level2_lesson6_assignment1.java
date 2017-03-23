package noob;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
	// Create WebDriver Object 
	System.setProperty("webdriver.chrome.driver", "/Users/kristina_sinelnikova/Downloads/chromedriver");
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
	
	WebElement enablePublishedOn = driver.findElement(By.cssSelector("input[ng-model='enablePublishedOn']"));
	enablePublishedOn.click();
	
	WebElement viewReport = driver.findElement(By.cssSelector("a[ng-if='report.status==1']"));
	viewReport.click();
	
	//Labels
	WebElement caseIdValue = driver.findElement(By.xpath(".//*[@id='reportBody']/div[1]/div/div[1]/div[1]/div"));
	caseIdValue.getText();
	
	WebElement suspectType = driver.findElement(By.xpath(".//*[@id='reportBody']/div[1]/div/div[1]/div[2]/div"));
	suspectType.getText();
	
	WebElement reportId = driver.findElement(By.xpath(".//*[@id='reportBody']/div[1]/div/div[1]/div[3]/div"));
	reportId.getText();
	
	//If else statement to see if the labels match
	if(!caseIdValue.getText().equals("1111")){
		System.out.println(caseIdValue.getText() + " does not match the label.");}
		else if(!suspectType.getText().equals("Victim")){
			System.out.println(suspectType.getText() + " does not match the label.");}
			else if(!reportId.getText().equals("3914")){
				System.out.println(reportId.getText() + " does not match the label.");
			}else{
				System.out.println("Test case passed");
		}
	}
}
	
