package org.test;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoTable {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\TaskDayFive\\Driver\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://stats.espncricinfo.com/ci/engine/records/batting/most_runs_innings.html?id=14452;type=tournament");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		
		WebElement Table = driver.findElement(By.xpath("(//table[@class='engineTable'])[1]"));
		
		
		List<WebElement> row = Table.findElements(By.cssSelector("tbody tr"));
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		
		{	
			for (int i = 0; i < row.size(); i++) {
				
				
			List<WebElement> rows = row.get(i).findElements(By.tagName("td"));
				
				WebElement team = rows.get(0);
				
				String ftext = team.getText();
				
				System.out.println(ftext);
				
			}
			for (int j = 0; j < row.size(); j++) {
				
				
			List<WebElement> teamli = row.get(j).findElements(By.tagName("td"));
				
				
				WebElement flist = teamli.get(7);
				
				String teamlist = flist.getText();
				
				System.out.println(teamlist);
				
				LinkedHashMap<String,String> teamdetails=new LinkedHashMap<String,String>();
				
				
			//	teamdetails.put(flist, teamlist);
			
				
				
				
				
			//}
				
//				float fl = Float.parseFloat(ftext);
//				
//				
//				if (fl>=180.00f) {
//					
//					
//				String text = rows.get(0).getText();
//					
//					System.out.println(text);
//									
//				}
				
    	   }

			
	
			}
			
			
			
			
		} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
	
	
		
	
		
	
	
	
	
	
	
	


