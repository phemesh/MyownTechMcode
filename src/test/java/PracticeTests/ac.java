package PracticeTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ac {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.findElement(By.id("firstName")).sendKeys("Hemeswar");
	  Actions ac=new Actions(driver);
	  ac.sendKeys(Keys.TAB);
	  ac.moveToElement(driver.findElement(By.id("lastName"))).sendKeys("Chowdary").
	  keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
	 
	  ac.moveToElement(driver.findElement(By.id("userEmail"))).click().sendKeys("V").keyUp(Keys.CONTROL).sendKeys("@gmail.com").build().perform();
     Thread.sleep(2000);
     ac.sendKeys(Keys.TAB).click(driver.findElement(By.xpath("(//input[@name='gender'])[1]")));
     ac.build().perform();
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,1000)");
    driver.findElement(By.cssSelector("div[class*=' css-tlfecz-indicatorContainer']")).click();
   
      
}
}
