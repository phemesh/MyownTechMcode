package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	WebDriver driver=null;
	public SignupPage(WebDriver driver) {
		this.driver=driver;
	}
	
 By loginname=By.xpath("//input[@name='loginName']");
 By fullname=By.xpath("//*[contains(@name,'fullNam')]");
 By email=By.cssSelector("input[name*='emai']");
 By mobileno=By.cssSelector("[name='mobileNo']");
 By submit=By.cssSelector("input[value='Submit']");
 By errormessagevalidation=
		 By.xpath("//span[contains(text(),'e-Mailis already exists')]");
 
 public WebElement loginname() {
	 return driver.findElement(loginname);
 }
 public WebElement fullname() {
	 return driver.findElement(fullname);
 } 
 public WebElement email() {
	 return driver.findElement(email);
 }
 public WebElement mobileno() {
	 return driver.findElement(mobileno);
 }
 public WebElement submit() {
	 return driver.findElement(submit);
 }
 public WebElement errormessagevalidation() {
	 return driver.findElement(errormessagevalidation);
 }
 
}
