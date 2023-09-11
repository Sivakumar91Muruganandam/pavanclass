package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("https://www.facebook.com/");
		
	    
	    driver.manage().window().maximize();
	    
	    Actions a=new Actions(driver); // Actions is predefined class
	    
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    
		email.sendKeys("selenium");
		a.doubleClick(email).perform();
		a.contextClick(email).perform();
		
	    
		
		
		
		
		
	}
	
	
	
	
}
