package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("https://www.facebook.com/");
		
	    
	    driver.manage().window().maximize();
		
		//down casting
	    
	   JavascriptExecutor js=(JavascriptExecutor)driver; //JavascriptExecutor is Interface
	    
		
		WebElement email = driver.findElement(By.id("email"));
		
		js.executeScript("arguments[0].setAttribute('value','siva07nov91@gmail.com')",email);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		
		js.executeScript("arguments[0].setAttribute('value','123456456')",pass);
		
		//Another option we have, we can pass in same line 
		
		//js.executeScript("arguments[1].setAttribute('value','siva07nov91@gmail.com')",email,pass);
		
		WebElement logbtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		
		js.executeScript("arguments[0].click()", logbtn);
		
		
		
		
	}
	
	
	
	

}
