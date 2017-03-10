package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		
		Thread.sleep(6000);
		WebElement enterPost = driver.findElement(By.cssSelector("textarea[class='_3en1 _480e']"));
		enterPost.click();
		
		Thread.sleep(8000);
		WebElement enterPost2 = driver.findElement(By.cssSelector("div[class='_1mf _1mj']"));
		Thread.sleep(3000);
		enterPost2.sendKeys("My First automated post!");
		
		Thread.sleep(5000);
		WebElement postButton = driver.findElement(By.xpath(".//*[@id='js_5s']/div[2]/div[2]/div/div[2]/div/button"));
		postButton.click();
		
		
		
		
				
		

	}

}
