package PracticeTests;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalaalanderUI {
public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

  driver.get("https://www.spicejet.com/");
  //selecting the current date calander
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
  //driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
  
  //How to select the calnder base on our desried year and month
  
 while(!driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText().contains("2021") || !driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]")).getText().contains("2021") ) {

	 driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
 
 
 }
 while(!driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().contains("September")){
	 
	 if(driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().contains("September")){
		 break;
	 }
	
  while(!driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText().contains("September") ) {
		
		 driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click(); 
		 if(driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText().contains("September")){
			 break;
		 }
		 
 }
 }
WebElement text1=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
 WebElement text2=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]"));
 if(text1.getText().equalsIgnoreCase("September")) {
	List<WebElement>li= driver.findElements(By.xpath("(//a[@class='ui-state-default'])[1]"));
	for(int i=0;i<li.size();i++) {
	 if(li.get(i).getText().equalsIgnoreCase("5")){
		 li.get(i).click();
		 break;
	 }
	 
 }}
 else  if(text2.getText().equalsIgnoreCase("September")) {
		List<WebElement>li= driver.findElements(By.xpath("(//a[@class='ui-state-default'])[2]"));
		for(int i=0;i<li.size();i++) {
		 if(li.get(i).getText().equalsIgnoreCase("5")){
			 li.get(i).click();
			 break;
		 }}}}
}