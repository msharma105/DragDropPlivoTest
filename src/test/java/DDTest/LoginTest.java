package DDTest;
import java.io.FileNotFoundException;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;


import BaseClass.TestBase;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest  extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public LoginTest() throws FileNotFoundException//to load properties
	{
		BaseTest();
	}
	
	//@BeforeMethod
	@Test
	public void setup() 
	{
		
		TestBase.initialization();  //to initialize browser
		loginpage = new LoginPage();
		LoginPage.CreateAPPClick();
		
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
