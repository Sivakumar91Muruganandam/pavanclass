package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptReturnarguments {
	
	
	public static void main(String[] args) {
		
		                             //key                                //Value
		System.setProperty("webdriver.chrome.driver,", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();

	    driver.get("https://www.facebook.com/");
		
	    //max window
	    driver.manage().window().maximize();
		
		
	    //Down casting
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    
	    
	    WebElement mail = driver.findElement(By.name("email"));
	    mail.sendKeys("siva07nov91@gmail.com");
	    //To get value in console
	    Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", mail);
	    
	    System.out.println(executeScript);
	    
	    
	    
		
	    
	    
	    
	    
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
