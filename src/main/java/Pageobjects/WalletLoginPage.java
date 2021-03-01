package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WalletLoginPage {
	WebDriver driver=null;
	public WalletLoginPage( WebDriver driver) {
		this.driver=driver;
	}
	
 By UserIDs=By.id("userName");
 By password=By.cssSelector("input#password");
 By signin=By.cssSelector("input.loginBtn");
 By errorValidation=By.id("errorMsg");
 By fornewUser=By.linkText("SignUp");
 
 public WebElement userID() {
	 return driver.findElement(UserIDs);
 }
	
 public WebElement password() {
	return driver.findElement(password);
	 
 }
 public WebElement Signin() {
		return driver.findElement(signin);
		 
	 }
 public WebElement Errorvalidate() {
	 return driver.findElement(errorValidation);
 }
 public WebElement newuser() {
	 return driver.findElement(fornewUser);
 }
}
