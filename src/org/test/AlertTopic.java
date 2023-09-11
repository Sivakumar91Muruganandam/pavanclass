package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTopic {
	

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
	    WebDriver driver=new ChromeDriver();
	    
	    
	    driver.get("http://demo.automationtesting.in/Alerts.html");
		
	    
	    driver.manage().window().maximize();
		
		
		WebElement simple = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		
		simple.click();
		
		WebElement balert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		
		balert.click();
		
Alert alert = driver.switchTo().alert();

alert.accept();
		
	
		
		
		
	}
	
	
	
	
	
}
