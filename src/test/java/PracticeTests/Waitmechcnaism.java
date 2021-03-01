package PracticeTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Waitmechcnaism {
public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("http://demo.guru99.com/");
     driver.findElement(By.cssSelector(".nav.navbar-nav >li:nth-child(5)")).click();
     driver.findElement(By.name("uid")).sendKeys("mngr311181");
     
     driver.findElement(By.name("password")).sendKeys("tEzYrEb");
     
     driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
     
    By image=By.xpath("//tr/td/center/img[1]");
    //Explicit wait mechnaism 
	WebDriverWait wait=new WebDriverWait(driver,20);
	//ensure here we only can use By .xpath But not driver.findelement(By.)
	wait.until(ExpectedConditions.visibilityOfElementLocated(image));
	Assert.assertTrue(driver.findElement(image).isDisplayed(), "success");
	//boolean 
	wait.until(ExpectedConditions.elementSelectionStateToBe(image, true)); 

	// waits for the element to be selected
	wait.until(ExpectedConditions.elementToBeSelected(image));

}
}

