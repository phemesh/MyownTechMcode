package PracticeTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dorpdowns {
	public static void main(String[] args) throws InterruptedException {
		
		/*We have dependcy called Webdriver manager which you can add and use the below 
		 * method called webdrivermanager.respective driver.setup you No need to download 
		 * explicitly any driver 
		 * 
		 * <groupId>io.github.bonigarcia</groupId>
	    <artifactId>webdrivermanager</artifactId>
	    <version>3.8.0</version>*/
		
		
        WebDriverManager.chromedriver().setup();
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com");
        driver.findElement(By.id("divpaxinfo")).click();
      WebElement adult=  driver.findElement(By.cssSelector("select[name*='mainContent$ddl_Adult']"));
      //Select is class for static dropdown which accepts the webElment reference
      
      Select sy=new Select(adult); 
      //there are different ways you can chooose the locator by index ,by value,by visible text
      sy.selectByIndex(2);
      //get first selected option will give you the sleected value
      System.out.println(sy.getFirstSelectedOption().getText());
         sy.selectByIndex(4);      
		sy.selectByValue("6");		
		sy.selectByVisibleText("9");
	System.out.println(sy.getFirstSelectedOption().getText());
	//is multiple will tell boolean value if it slected multipel or not
	System.out.println(sy.isMultiple());	
	List<WebElement> li=sy.getOptions();
	//get options wil give you all the values
int count=	li.size();
	for(int i=0;i<count;i++) {		
	String value=li.get(i).getText();
	System.out.println(value);
	if(value.equalsIgnoreCase("6")) {
	li.get(i).click();	
	}
	}		
	}
	}
