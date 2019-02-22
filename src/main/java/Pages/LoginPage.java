package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import BaseClass.TestBase;

public  class LoginPage extends TestBase{
	
	@FindBy(id  = "link-create")
	static
	WebElement createApp;
	
	
	
	public  LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
public static  HomePage CreateAPPClick() 
{
	 createApp.click();
	
	return new HomePage();
	
}





}
