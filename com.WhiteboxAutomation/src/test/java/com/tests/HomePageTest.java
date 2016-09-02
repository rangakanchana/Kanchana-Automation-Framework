package com.tests;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.HomePage;

public class HomePageTest extends BaseTest {
	
HomePage hp;
	
	@BeforeClass
	public void initialize(){
		
		hp = new HomePage(driver);
	}
	
	@Test
	public void testSocialIcons(){
		
		int actual = hp.countSocialIcons();
		
		assertEquals(4,actual);
	}
	
	@Test
	public void testClickLogin(){
		
		String actual = hp.clickLogin();
		
		assertEquals("http://whiteboxqa.com/login.php",actual);
	}

}



