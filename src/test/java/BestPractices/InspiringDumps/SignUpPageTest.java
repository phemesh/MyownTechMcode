package BestPractices.InspiringDumps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pageobjects.SignupPage;

import resources.DriverLoading;

public class SignUpPageTest {
	public void signup() throws IOException {
	WebDriver driver=null;
	driver= DriverLoading.loadDriver();
	SignupPage spl=new SignupPage(driver);
	driver.get(DriverLoading.prop.getProperty("globalurl")+"user/add.do");
	spl.loginname().sendKeys("ChinnaEswaraiah");
	spl.fullname().sendKeys("Chinna Eswaraiah Bobbili");
	spl.email().sendKeys("p.hemesh7@gmail.com");
	spl.mobileno().sendKeys("7382472392");
	if(spl.errormessagevalidation().isDisplayed()==true) {
		System.out.println(spl.errormessagevalidation().getText());
		System.out.println("gone to tose again register with new mobile number");
	}
	else {
		System.out.println("succesfully registered");
	}
}
}
