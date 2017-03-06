package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class XpathsTests{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kristinasinelnikova/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///Users/kristinasinelnikova/Desktop/Test.html");
		WebElement link = driver.findElement(By.linkText("Second Link"));
	    link.click();
	    String url = driver.getCurrentUrl();
	    
	    if (url.contains("google")) {
	    	System.out.println("PASSED");
	    } else {
	    	System.out.println("FAILED");
	    }
	}

}