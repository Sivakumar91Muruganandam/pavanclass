package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass{

	
	public static void main(String[] args) throws AWTException {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("https://www.facebook.com/");
		
	    
	    driver.manage().window().maximize();
	    
	    
	    
	    //Robot Class
	    Actions a=new Actions(driver);
		
		
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    
	    email.sendKeys("selenium");
	    a.doubleClick(email).perform();
	    
	    Robot r=new Robot();
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
	    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_C);
	    
	    r.keyPress(KeyEvent.VK_TAB);
	    r.keyRelease(KeyEvent.VK_TAB);
		
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_C);
		
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_C);
	    
	    
	    
	    
	    
		}
	
	
	
	
}
