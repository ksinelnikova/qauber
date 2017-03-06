package project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kristinasinelnikova/Downloads/chromedriver");
		ChromeDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		
		wb.get("http://testwave.qabidder.net/#/page/login");
		WebElement email = wb.findElement(By.xpath(".//*[@id='exampleInputEmail1']"));
		email.sendKeys("ubertesterqa@gmail.com");
		WebElement password = wb.findElement(By.xpath(".//*[@id='exampleInputPassword1']"));
		password.sendKeys("12345password");
		Thread.sleep(5000);
		WebElement login = wb.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div[2]/form/button"));
		login.click();
		
		Navigation navigate = wb.navigate();
		Thread.sleep(2000);
		navigate.back();
		Thread.sleep(2000);
		navigate.forward();
		Thread.sleep(2000);
		navigate.refresh();
		
		WebElement username = wb.findElement(By.xpath("html/body/div[2]/header/nav/div[2]/ul[2]/li/a"));
		System.out.println(username.getText());
	}
}
