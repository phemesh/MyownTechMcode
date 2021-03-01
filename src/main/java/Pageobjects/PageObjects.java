package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PageObjects {
	WebDriver driver=null;
	public PageObjects( WebDriver driver) {
		this.driver=driver;
	}
	
 By loginDisplay=By.cssSelector("a[title='Wallet']");
 By from =By.xpath("//div[@class='search']/input[3]");
 By to =By.xpath("//input[@name='destination']");
 
 By tripsearch=By.id("txtJourneyDate");
 By date=By.xpath("//a[contains(@class,'ui-state-highlight')]");
 public WebElement loginDisplay() {
	 return driver.findElement(loginDisplay);
 }
 public WebElement from() {
	 return driver.findElement(from);
 }
 public WebElement to() {
	 return driver.findElement(to);
 }	
 public WebElement tripsearch() {
	 return driver.findElement(tripsearch);
 }	
 public WebElement date() {
	 return driver.findElement(date);
 }	
}
