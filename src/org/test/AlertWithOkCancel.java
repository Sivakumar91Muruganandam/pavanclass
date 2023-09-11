package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancel {

	
	
	public static void main(String[] args) throws AWTException {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("http://demo.automationtesting.in/Alerts.html");
		
	    
	    driver.manage().window().maximize();
	    
	    
	    
	    
	    WebElement alertok = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
	    alertok.click();
	    
	    WebElement box = driver.findElement(By.xpath("//button[contains(text(),'a confirm')]"));
		
		box.click();
		
		
		//Now we have to use Alert Interface
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		/*Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);*/
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
