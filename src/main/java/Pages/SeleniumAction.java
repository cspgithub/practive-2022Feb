package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAction {

	private WebDriver driver;
	WebElement element;
	WebDriverWait wait;

	public SeleniumAction(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElemnt(By by) {

		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(by));
		return element;
	}

	public void jsClick(By by) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", getElemnt(by));
	}

	public void sleep(long duartion) throws Exception {
		Thread.sleep(duartion);
	}

	public void sendKeysWithDelay(By locator, String keysToSend) {
		for (char c : keysToSend.toCharArray()) {
			getElemnt(locator).sendKeys(Character.toString(c));
			try {
				sleep(300);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public List<WebElement> getListOfWebElementByString(String str) {
		return driver.findElements(By.xpath(str));
	}

	public List<WebElement> getListOfWebElementByElement(By by) {
		return driver.findElements(by);
	}

}
