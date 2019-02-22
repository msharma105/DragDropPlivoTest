package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import BaseClass.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//button[contains(text(),'get started')]")
	static WebElement startClick;

	@FindBy(id = "add-page")
	static WebElement addClick;
	@FindBy(xpath = "//input[contains(@class,'submitonenter')]")
	static WebElement sendText;

	@FindBy(xpath = "/html/body/div[20]/div[3]/button[1]")
	static WebElement button1Click;
	@FindBy(xpath = "//a[contains(text(), 'Messaging')]")
	static WebElement messageClick;
	@FindBy(xpath = "//div[contains(@class,'ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom  ui-accordion-content-active')]//ul[contains(@class,'module-group')]//li[3]")

	static WebElement dragSMS;
	@FindBy(css = "#module-1 > div.mod-rail.mod-south")

	static WebElement dragp1;

	@FindBy(xpath = "//div[contains(@class,'syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable')]")

	static WebElement dropp1;

	@FindBy(name = "phone_constant")

	static WebElement sendPhone;

	@FindBy(xpath = "//div[contains(@class,'syn-selectappvar-wrap')]//textarea[contains(@name,'message_phrase[]')][1]")
	static WebElement sendHello;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public static void PerformInitialAction() {
		startClick.click();
		addClick.click();
		sendText.sendKeys("Test");
		button1Click.click();
		messageClick.click();

	}

	public static void dragSMS() throws InterruptedException {
		ac.clickAndHold(dragSMS).release().build().perform();
		ac.dragAndDropBy(dragSMS, 660, 16);
		ac.build().perform();
	}

	public static void DragDropPointAndSendKey() throws InterruptedException {

		ac.clickAndHold(dragp1).moveToElement(dropp1).release().build().perform();
		sendPhone.sendKeys("9712786798");
		sendHello.sendKeys("Hello");
	}

}
