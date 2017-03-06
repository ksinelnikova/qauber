package project;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class8Assignment1Chrome {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/kristinasinelnikova/Downloads/chromedriver");
		ChromeDriver wb = new ChromeDriver();
		wb.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		
		wb.get("http://testwave.qabidder.net/#/page/register-sa");
		String title = wb.getTitle();
		System.out.println(title);
		String url = wb.getCurrentUrl();
		System.out.println(url);
		WebElement inputName = wb.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[1]/input"));
		inputName.sendKeys("tester");
		WebElement inputEmail = wb.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[2]/input"));
		inputEmail.sendKeys("ubertesterqa@gmail.com");
		WebElement inputPassword = wb.findElement(By.xpath(".//*[@id='id-password']"));
		inputPassword.sendKeys("12345password");
		WebElement inputPasswordAgain = wb.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[4]/input"));
		inputPasswordAgain.sendKeys("12345password");
		Thread.sleep(5000);
		WebElement register = wb.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/button"));
		register.click();
	}
}
