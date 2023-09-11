package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyupAndKeyDown {
	
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("https://www.facebook.com/");
		
	    
	    driver.manage().window().maximize();
	    
	    //Key up and down
	    Actions a=new Actions(driver);
		
		
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    
	    a.keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).build().perform();
		
		
	}
	
	

}
