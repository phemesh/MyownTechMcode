package BestPractices.InspiringDumps;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pageobjects.WalletLoginPage;
import junit.framework.Assert;
import resources.DriverLoading;

public class LoginTest {
	public void loginPage() throws IOException {
	WebDriver driver=null;
	driver= DriverLoading.loadDriver();
	WalletLoginPage wl=new WalletLoginPage(driver);
	driver.get(DriverLoading.prop.getProperty("globalurl")+"wallet/traxnHistory.do");
	wl.userID().sendKeys("Hemesh");
	wl.password().sendKeys("Hemesh");
	wl.Signin().click();
	WebElement textmessage=wl.Errorvalidate();
 if(textmessage.isDisplayed()) {
	 System.out.println("YOu are failed to signin ,Please check");
	 System.out.println(textmessage.getText());
 }
 else {
	 System.out.println("logged in successfully");
 }
 wl.newuser().click();
 SignUpPageTest sp=new SignUpPageTest();
sp.signup();
}
 
	
	}
