package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WS211 {
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
	
	WebElement vehicleLicense = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleLicense']"));
	vehicleLicense.sendKeys("Y333YYY");
	
	WebElement vehicleMake = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleMake']"));
	vehicleMake.sendKeys("Toyota");

	WebElement vehicleModel = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleModel']"));
	vehicleModel.sendKeys("Rav4");
	
	WebElement vehicleBodystyle = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleBodystyle']"));
	vehicleBodystyle.sendKeys("SUV");
	
	WebElement vehicleYear = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleYear']"));
	vehicleYear.sendKeys("2014");
	
	WebElement vehicleColor = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleColors']"));
	vehicleColor.sendKeys("Red");
	
	Select dropdown = new Select(driver.findElement(By.cssSelector("select[ng-model='wizard.report.vehicleState']")));
	dropdown.selectByValue("CA");
	
	WebElement vehicleOddities = driver.findElement(By.cssSelector("input[ng-model='wizard.report.vehicleOddities']"));
	vehicleOddities.sendKeys("Pink license plate");
	
	Thread.sleep(3000);
	WebElement previewToolTip = driver.findElement(By.xpath("html/body/div[2]/section/div/div/form/div[1]/div[2]/ol/li[8]/h4/div")); 
	previewToolTip.click();
	
	}
}
	