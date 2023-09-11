package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {
	
	public static void main(String[] args) throws AWTException {
		

	
	System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    
    driver.get("http://demo.automationtesting.in/Alerts.html");
	
    
    driver.manage().window().maximize();
    
    
    
    
    WebElement textbox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
    textbox.click();
    
    
    WebElement prompt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
    
    prompt.click();
    
    
    Robot r=new Robot();//Present in java.awt
    
    r.keyPress(KeyEvent.VK_CAPS_LOCK);
    r.keyRelease(KeyEvent.VK_CAPS_LOCK);
    r.keyPress(KeyEvent.VK_S);
    r.keyRelease(KeyEvent.VK_S);
    r.keyPress(KeyEvent.VK_I);
    r.keyRelease(KeyEvent.VK_I);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_V);
    r.keyPress(KeyEvent.VK_A);
    r.keyRelease(KeyEvent.VK_A);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    
    
    
    /* Alert alert = driver.switchTo().alert();
    
    
    alert.sendKeys("Sivakumar");
    
 
    String text = alert.getText();
   
    System.out.println(text);
    alert.accept();*/
   
   
   
   
	
	
	
	}
	
	
	
	

}
