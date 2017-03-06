package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://testwave.qabidder.net/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  public void testCase1() throws Exception {
    driver.get(baseUrl + "/#/page/login");
    driver.findElement(By.id("exampleInputEmail1")).clear();
    driver.findElement(By.id("exampleInputEmail1")).sendKeys("ubertesterqa@gmail.com");
    driver.findElement(By.id("exampleInputPassword1")).clear();
    driver.findElement(By.id("exampleInputPassword1")).sendKeys("testing");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.linkText("Entities")).click();
    driver.findElement(By.xpath("//h3/button")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("address1")).click();
    driver.findElement(By.name("address1")).clear();
    driver.findElement(By.name("address1")).sendKeys("Cool Address");
    driver.findElement(By.name("city")).click();
    driver.findElement(By.name("city")).clear();
    driver.findElement(By.name("city")).sendKeys("Cool City");
    driver.findElement(By.xpath("//option[@value='OK']")).click();
    new Select(driver.findElement(By.name("state"))).selectByVisibleText("California");
    driver.findElement(By.xpath("(//option[@value='CA'])[2]")).click();
    driver.findElement(By.name("zip")).click();
    driver.findElement(By.name("zip")).clear();
    driver.findElement(By.name("zip")).sendKeys("94040");
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.cssSelector("div.bootstrap-tagsinput.focus > input[type=\"text\"]")).clear();
    driver.findElement(By.cssSelector("div.bootstrap-tagsinput.focus > input[type=\"text\"]")).sendKeys("kristina.siusa@gmail.com");
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.cssSelector("div.text-right > button.btn.btn-primary")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.xpath("//div[4]/div/div/div/div[4]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

