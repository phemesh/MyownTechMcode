package PracticeTests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import resources.DriverLoading;

public class Practiceondropdowns {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;
		driver = DriverLoading.loadDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sey=new Select(currency);
		
		sey.selectByIndex(2);
		System.out.println(sey.getFirstSelectedOption().getText());
		sey.selectByValue("INR");
		System.out.println(sey.getFirstSelectedOption().getText());
		sey.selectByVisibleText("USD");
		System.out.println(sey.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
	}}
														