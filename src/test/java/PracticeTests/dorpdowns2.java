package PracticeTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dorpdowns2 {
	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.id("fromCity")).click();
  WebElement from=     driver.findElement(By.xpath("//div[@role='combobox']/input"));
  from.sendKeys("Mumba");

 List<WebElement> getcontries= driver.findElements(By.cssSelector("div.makeFlex.hrtlCenter >div >p:nth-child(1)"));
 
 /*for(WebElement i:getcontries) {
	if( i.getText().contains("Pune,")){
		Thread.sleep(2000);
		i.click();
		 break;
	 }
	*/
	//other way of doing it 
	
	for(int i=0; i<getcontries.size();i++) {
		if( getcontries.get(i).getText().contains("Pune,")){
	
			 getcontries.get(i).click();
			 break;
		 }
	 
 }
	}
	}
