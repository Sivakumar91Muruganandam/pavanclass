package org.test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldOmeter {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.worldometers.info/world-population/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		List<WebElement> popul = driver.findElements(By.xpath("https://www.worldometers.info/world-population/"));
		
		
		for (WebElement e : popul) {
			
			System.out.println(e.getText());
			
		}
		
	}

}
