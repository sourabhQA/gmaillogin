package GmailTesting.Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmaillogin {
	static WebDriver driver;

	@Test()
	public static void runGmailTest()  throws Exception {

		// Opening firefox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Adding the implicit wait
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		// Opening the website
		driver.get("https://mail.google.com");
		// Adding the email
		WebElement email = driver.findElement(By.xpath("//input[@name='identifier']"));
		utility.sendkeys(email, driver, 10, "saurabh@grappus.com");

		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(Keys.ENTER);

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		utility.sendkeys(password, driver, 10, "grappus123");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		// Tap on compose button
		WebElement compose = driver.findElement(By.xpath(
				"//div[contains(text(),'Compose')]"));
		utility.click(compose, driver, 10);
	
		

		WebElement addemail = driver.findElement(
				By.xpath("//div[@class='wO nr l1']//div[@class='aA6']//preceding-sibling::textarea[@rows=1]"));
		utility.sendkeys(addemail, driver, 10, "saurabhww@gmail.com");
		

		WebElement subject = driver.findElement(By.xpath("//input[@name=\"subjectbox\"]"));
		utility.sendkeys(subject, driver, 10, "automation script is running");
		Thread.sleep(3000);

		// Tap on three dot icon
//		driver.findElement(By.xpath(
//				"//div[@class='J-J5-Ji J-JN-M-I-JG' and @xpath='1']"))
//				.click();
		
		
	
		
		  WebElement threedot = driver.findElement(By.xpath("//div[@data-tooltip=\"More options\"]"));
		
		// Click on Label
		
		
		Actions action = new Actions(driver);
		action.moveToElement(threedot).build().perform();
		
		
		
		utility.click(threedot, driver, 20);
		
		// Click on Label
		
		
		driver.findElement(By.id(":or")).click();
		Thread.sleep(3000);
		// click on create new label
		driver.findElement(By.xpath("//div[contains(text(),'Create new')]")).click();
		Thread.sleep(3000);
		// Adding label name
		driver.findElement(By.xpath("//*[@id=':rf.na']")).sendKeys("SeleniumTest");
		Thread.sleep(3000);
		// clicked ok
		driver.findElement(By.xpath("/html/body/div[35]/div[3]/button[1]")).click();
		Thread.sleep(3000);
		// click on save
		driver.findElement(By.xpath("//*[@id=\":mi\"]")).click();

	}

}
