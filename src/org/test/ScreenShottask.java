package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShottask {
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Desktop\\\\TaskDayFive\\\\Driver\\\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		//Down casting
		
		
		TakesScreenshot t=(TakesScreenshot)driver;
		
		
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		
	    File f=new File("D:\\Desktop\\TaskDayFive\\Sreenshot\\sht.png");
		
	    
	    FileUtils.copyFile(screenshotAs, f);
		
		
		
		
		
		
	}
	
	
	

}
