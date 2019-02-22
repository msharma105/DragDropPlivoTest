package DDTest;

import java.io.FileNotFoundException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest extends TestBase{
   
	LoginPage loginpage;
	HomePage homepage;
	public HomePageTest() throws FileNotFoundException//to load properties
	{
		BaseTest();
	}
	@BeforeMethod
	
	public void setup() 
	{
		
		TestBase.initialization();  //to initialize browser
		loginpage = new LoginPage();
		homepage= LoginPage.CreateAPPClick();
		
	}
	@Test()
	
	public void ActionCall() throws InterruptedException
	{
		HomePage.PerformInitialAction();
		HomePage.dragSMS();
		HomePage.DragDropPointAndSendKey();
	}
	
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
	}
}
