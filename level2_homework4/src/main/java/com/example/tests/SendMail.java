package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendMail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/kristinasinelnikova/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/gmail/about/");
		
		
		WebElement signIn = driver.findElement(By.xpath("html/body/nav/div/a[2]"));
		Thread.sleep(2000);
		signIn.click();
		
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("ubertesterqa@gmail.com");
		WebElement clickNext = driver.findElement(By.id("next"));
		clickNext.click();
		
		Thread.sleep(3000);
		WebElement passwordTextBox = driver.findElement(By.id("Passwd"));
		passwordTextBox.sendKeys("12345password");
		Thread.sleep(4000);
		WebElement signInButton = driver.findElement(By.id("signIn"));
		signInButton.click();
		
		Thread.sleep(4000);
		WebElement composeEmail = driver.findElement(By.xpath(".//*[@id=':66']/div/div"));
		composeEmail.click();
		
		Thread.sleep(4000);
		WebElement sendTo = driver.findElement(By.xpath(".//*[@id=':bg']"));
		sendTo.sendKeys("yagna.bitspilani@gmail.com");
		

		Thread.sleep(4000);
		WebElement subjectField = driver.findElement(By.xpath(".//*[@id=':b0']"));
		subjectField.sendKeys("This is Automated mail");
		
		Thread.sleep(4000);
		WebElement textField = driver.findElement(By.xpath(".//*[@id=':c2']"));
		textField.sendKeys("Hello, you received this email, because Kristina completed her Homework. Homework is uploaded to Github. Thank you!");
		
		Thread.sleep(2000);
		WebElement sendEmail = driver.findElement(By.xpath(".//*[@id=':aq']"));
		sendEmail.click();
		
		
		
		
				
		

	}

}
