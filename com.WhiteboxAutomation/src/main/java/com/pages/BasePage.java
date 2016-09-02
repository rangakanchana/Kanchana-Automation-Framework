package com.pages;

import com.util.PageDriver;

public abstract class BasePage {
public PageDriver driver;
	
	public BasePage(PageDriver driver){
		
		this.driver = driver;
		
		driver.get("http://whiteboxqa.com/");

	}
	}


