package PracticeTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AssertionsinJav {
public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     
     //Dropdowns
     
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     driver.findElement(By.id("name")).sendKeys("Hemesh Chowdary");
     
     driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
     
   String text=  driver.switchTo().alert().getText();
   System.out.println(text);
     Thread.sleep(3000);
   driver.switchTo().alert().accept();
   
     
     
     
     
     
     
     
     //Assertions
     
	 /*driver.get("https://timesofindia.indiatimes.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement notnow=driver.findElement(By.xpath("//a[text()='Not Now']"));
	//some times we will see notification popups while opening the page
	//in such ase close that prompts to load the page 
	//below code will suits it appears then close and proceed 
	if(notnow.isDisplayed()) {
		System.out.println(notnow.getText());
		notnow.click();
	}
	
	String text= driver.findElement(By.cssSelector(".editor-box.india >span")).getText();
	driver.findElement(By.cssSelector(".editor-box.india >span")).isEnabled();
	//it will be displayed ob page butis enabled ornot 
	driver.findElement(By.cssSelector(".editor-box.india >span")).isDisplayed();//displayed on the page or hidden waits until page is displayed
	driver.findElement(By.cssSelector(".editor-box.india >span")).isSelected();//checks if it selected
	
Assert.assertEquals("EDITION:", text);
Assert.assertTrue(text.equals("EDITION:"));
*/
}
}
