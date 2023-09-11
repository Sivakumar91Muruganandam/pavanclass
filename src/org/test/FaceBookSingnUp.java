package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSingnUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement create = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create.click();
		
		WebElement date = driver.findElement(By.xpath("//option[@value='8']"));
		date.click();
		WebElement month = driver.findElement(By.xpath("(//select//option[@value='3'])[2]"));
		month.click();
		WebElement year = driver.findElement(By.xpath("(//select//option[@value='1991'])"));
		year.click();
		
		
		
	}

	
	
	
	
}
