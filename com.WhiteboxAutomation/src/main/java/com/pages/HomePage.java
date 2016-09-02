package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.util.PageDriver;

public class HomePage extends BasePage {
	
public HomePage(PageDriver driver){
		
		super(driver);
		
	}
	
		public int countSocialIcons(){
		
		int count = 0;
		
		driver.maximizeBrowser();
		
	List<WebElement> elements= 	driver.findElements(By.cssSelector(".pull-right.social-icons"));
	 
	if(!elements.isEmpty()){
		
		count = elements.size();
	}
		return count;
	}
	
	public String clickLogin(){
		
		String url = null;
		
		driver.maximizeBrowser();
		
	  driver.findElement(By.id("loginButton")).click();
	  
	  url = driver.getCurrentUrl();
	  
	  return url;
	}
	
	

}


