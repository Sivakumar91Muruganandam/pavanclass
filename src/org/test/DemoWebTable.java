package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		
		
		WebElement t = driver.findElement(By.xpath("//table[@id='customers']"));
		
		String t1 = t.getText();
		
		//System.out.println(t1);
		
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		
/*	for (int i = 0; i < row.size(); i++) {
		
		
		WebElement w = row.get(i);
		
		String text = w.getText();
		
		System.out.println(text);
		
		
		
		
		
	}*/
		
		WebElement r = row.get(3);
		String tex1 = r.getText();
		
		System.out.println(tex1);
		
		
		
		

	}

}
