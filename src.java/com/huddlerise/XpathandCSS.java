package com.huddlerise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathandCSS {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		//Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//System.out.println(driver.findElement(By.cssSelector("a#createacc")).getAttribute("role"));
		if (true)
		{
			Thread.sleep(3000);
			
//			if(driver.findElement(By.xpath("//*[@alt='POCO-x2-eb-gif'][2]")).isDisplayed())
//			{
//				driver.findElement(By.xpath("//*[@alt='POCO-x2-eb-gif'][2]")).click();
//				if(driver.findElement(By.xpath("//h1[@class='_30P0WS']")).isDisplayed())
//					System.out.println("Yes the right text is displayed");
//				
//				
//			
//			}
//			else
//			{
//				System.out.println("not able to find Poco Image");
//			}
//			
			Actions onElement = new Actions(driver);
			// WebElement electronicsLink = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
			 
			 WebElement realmeElement = driver.findElement(By.xpath("//img[@id='drag1']"));
			 WebElement MiElement = driver.findElement(By.xpath("//div[@id='div2']"));
			 
			//onElement.moveToElement(electronicsLink).perform();
			
			onElement.dragAndDrop(realmeElement, MiElement).build().perform();
			System.out.println("it is done");
				
		}
			
		else
			System.out.println("we are in some different category");
	}

}
