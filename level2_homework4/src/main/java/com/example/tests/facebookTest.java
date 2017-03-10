package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebookTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("ubertesterqa@gmail.com");
		
		Thread.sleep(3000);
		WebElement passwordTextBox = driver.findElement(By.id("pass"));
		passwordTextBox.sendKeys("12345password");
		
		Thread.sleep(3000);
		WebElement logInButton = driver.findElement(By.id("u_0_q"));
		logInButton.click();
		
		Thread.sleep(3000);
		WebElement myAccount = driver.findElement(By.xpath(".//*[@id='u_0_4']/div[1]/div[1]/div/a"));
		myAccount.click();
		
		Thread.sleep(4000);
		driver.findElement(By.name("xhpc_message_text")).sendKeys("My first automated post!");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button/span[.=\"Post\"]")).click();
		
		

	}

}
