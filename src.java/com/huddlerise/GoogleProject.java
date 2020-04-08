package com.huddlerise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.devtools.network.model.InterceptionStage;
import org.openqa.selenium.devtools.network.model.RequestPattern;
import org.openqa.selenium.devtools.network.model.ResourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableList;

public class GoogleProject {

	public static void main(String[] args) throws Exception {
		
			
		ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://ds4.cricut.com");
		Thread.sleep(5000);
        DevTools chromeDevTools = chromeDriver.getDevTools();
		chromeDevTools.createSession();
		chromeDevTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		
		 chromeDevTools.addListener(Network.requestIntercepted(),
	                requestIntercepted -> chromeDevTools.send(
	                        Network.continueInterceptedRequest(requestIntercepted.getInterceptionId(),
	                                Optional.empty(),
	                                Optional.empty(),
	                                Optional.empty(), Optional.empty(),
	                                Optional.empty(),
	                                Optional.empty(), Optional.empty())));
		 
	        RequestPattern requestPattern = new RequestPattern("*", ResourceType.XHR, InterceptionStage.REQUEST);
	        chromeDevTools.send(Network.setRequestInterception(ImmutableList.of(requestPattern)));

	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

//		
//		checkbox.getAttribute(name)
//		Select language = new Select(dropdown);
//		
//		language.selectByVisibleText("Deutsch");	
		
		//dd.findElement(by)
		
		

}
}
