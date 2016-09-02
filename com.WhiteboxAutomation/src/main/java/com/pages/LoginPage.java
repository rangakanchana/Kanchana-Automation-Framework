package com.pages;

import org.openqa.selenium.By;

import com.util.PageDriver;

public class LoginPage extends BasePage {
	
public PageDriver driver;
	
	public LoginPage(PageDriver driver){
		
		super(driver);
	}
	
	public String performLogin(String uName,String pwd){
		
		String error = null;
		
		driver.maximizeBrowser();
		
		driver.findElement(By.id("username")).sendKeys(uName);
		
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		driver.findElement(By.linkText("Login")).click();
		
		error = driver.findElement(By.cssSelector(".text-danger")).getText();
		
        return error;
		
	}
	

}


