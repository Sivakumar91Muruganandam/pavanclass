package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	
	
	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siva0\\eclipse-workspace\\Interview\\DriverNew\\chromedriver.exe");
		
		
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("http://greenstech.in/selenium-course-content.html");
		
	    
	    driver.manage().window().maximize();
	    
	    
	    WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		course.click();
		//we should use actions class for mouse movement
		Actions a=new Actions(driver);
		
		WebElement soft = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
	    
	    a.moveToElement(soft).perform();
	    soft.click();
	    
	    WebElement selenium = driver.findElement(By.xpath("//span[contains(text(),'Selenium Certification Training')]"));
	    
	    a.moveToElement(selenium).perform();
	    selenium.click();
	    
	    
	}
	
	

}
