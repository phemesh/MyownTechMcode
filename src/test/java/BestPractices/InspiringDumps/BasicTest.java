package BestPractices.InspiringDumps;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Pageobjects.PageObjects;
import resources.DriverLoading;

public class BasicTest extends DriverLoading {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;
		driver = DriverLoading.loadDriver();
		driver.get(DriverLoading.prop.getProperty("globalurl"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		PageObjects pob = new PageObjects(driver);
		pob.from().sendKeys("BANGA");
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ARROW_DOWN, Keys.ENTER).build().perform();
		WebElement too=pob.to();
		too.sendKeys("rajampet");

		List<WebElement> lmi = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		int mys = lmi.size();
		System.out.println(mys);

		for (int i = 0; i < mys; i++) {
			if (lmi.get(i).getText().equalsIgnoreCase("Rajampet")) {
				lmi.get(i).click();
				
				break;
			}
		}
	
		pob.tripsearch().click();
		pob.date().click();
		pob.loginDisplay().click();
		LoginTest loo = new LoginTest();
		loo.loginPage();
}}
