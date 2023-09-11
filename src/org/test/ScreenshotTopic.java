package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTopic {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		                           //key                               //value
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
	 WebDriver driver=new ChromeDriver();
	    
	    //Launch Browser
	    driver.get("http://www.snapdeal.com/");
		
	    //Maximize Window
	    driver.manage().window().maximize();
	    
		//Down casting
	    
	  TakesScreenshot t=(TakesScreenshot)driver;
		
		File screenshotAs = t.getScreenshotAs(OutputType.FILE); //File present in java.io. here screenshotAs is source file
		
		File f=new File("D:\\Desktop\\TaskDayFive\\Sreenshot\\va.png");
		
		FileUtils.copyFile(screenshotAs, f);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
