package com.tests;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	LoginPage lp;
	HomePage hp;
	
	@BeforeClass
	public void initialise(){
		
		hp = new HomePage(driver);
		
		hp.clickLogin();
		
		lp = new LoginPage(driver);
		
		}
	
	@Test
	public void testPerformLogin(){
		
		String actual = lp.performLogin("abcdef", "123asd");
		
		assertEquals("You have not registered.",actual);
	}

}


