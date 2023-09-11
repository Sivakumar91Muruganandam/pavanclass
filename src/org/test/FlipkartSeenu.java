package org.test;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSeenu {

	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siva0\\eclipse-workspace\\Interview\\DriverNew\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.flipkart.com/");
		
		
		driver.manage().window().maximize();
		
		
		WebElement cls = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		cls.click();
		
		WebElement ph = driver.findElement(By.name("q"));
		
		ph.sendKeys("vivo");
		
		
		WebElement search = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		
		search.click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
     	List<WebElement> phlist = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
     	List<WebElement> plist = driver.findElements(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])"));
     	
     	

     	//Hash map
     	
     
     	
     	LinkedHashMap<String,String> productdetails=new LinkedHashMap<String,String>();
     	
     	
     	
         	for (int i = 1; i < phlist.size(); i++) {
     		
     		
			 String productname = phlist.get(i).getText();
			 
     	 	String productprice = plist.get(i).getText().replaceAll("[^0-9]","");
     	 		 
     	 		 
     	 		productdetails.put(productname, productprice);
				
			}
     	 			
								
//			for (Map.Entry<String, String> entry : productdetails.entrySet()) {
//					
//					String finalname = entry.getKey();
//					String finalprice = entry.getValue();
//					
//					System.out.println(finalname+"   "+finalprice);
//					
//					
//				}
				
				System.out.println(productdetails);
	
				
			}
				
			
}
     	
		
     
	
     	
     	    	
	
	
	
	
	
	

	
	

