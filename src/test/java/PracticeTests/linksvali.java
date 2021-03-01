package PracticeTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linksvali {
	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
	        
	        WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    int size = driver.findElements(By.tagName("iframe")).size();
System.out.println(size);
	    for(int i=0; i<size-1; i++){
		driver.switchTo().frame(i);
	
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    }
}
}
