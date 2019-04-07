package GmailTesting.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility {
	
	
	
	
	
	
	
	public static void sendkeys(WebElement element ,WebDriver driver,int timeout,String data) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(data);
	
		
	}

	public static void click(WebElement element ,WebDriver driver,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

	
	
	
	
	
}
