package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Youtube {

	//private WebDriver driver;
	private SeleniumAction sAction;

	public Youtube(WebDriver driver) {
		sAction = new SeleniumAction(driver);
		//this.driver = driver;
	}

	By searchBox = By.xpath("//div[@id='search-input']/input[@id='search']");

	public void enterText(String text) {
		//sAction.getElemnt(searchBox).click();
		sAction.sendKeysWithDelay(searchBox, text);

	}

}
