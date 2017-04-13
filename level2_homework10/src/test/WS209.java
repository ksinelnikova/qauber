package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WS209 {
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
	
	Thread.sleep(3000);
	WebElement reports = driver.findElement(By.linkText("Add Report")); reports.click();
	
	Thread.sleep(3000);
	WebElement vehicleToolTip = driver.findElement(By.xpath("html/body/div[2]/section/div[1]/div/form/div[1]/div[2]/ol/li[6]")); 
	vehicleToolTip.click();

	//Enter and clear vehicle information
	WebElement vehicleLicense = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleLicense']"));
	vehicleLicense.sendKeys("Y333YYY");
	vehicleLicense.clear();
	
	WebElement vehicleMake = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleMake']"));
	vehicleMake.sendKeys("Toyota");
	vehicleMake.clear();

	WebElement vehicleModel = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleModel']"));
	vehicleModel.sendKeys("Rav4");
	vehicleModel.clear();
	
	WebElement vehicleBodystyle = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleBodystyle']"));
	vehicleBodystyle.sendKeys("SUV");
	vehicleBodystyle.clear();
	
	WebElement vehicleYear = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleYear']"));
	vehicleYear.sendKeys("2014");
	vehicleYear.clear();
	
	WebElement vehicleColor = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleColors']"));
	vehicleColor.sendKeys("Red");
	vehicleColor.clear();
	
	WebElement vehicleOddities = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleOddities']"));
	vehicleOddities.sendKeys("Pink license plate");
	vehicleOddities.clear();
	
	
	}
}
	