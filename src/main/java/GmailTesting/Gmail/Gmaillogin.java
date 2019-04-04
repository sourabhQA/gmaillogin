package GmailTesting.Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmaillogin {
	static WebDriver driver;

	@Test(retryAnalyzer = retry.class)
	public static void runGmailTest() throws Exception {

		// Opening firefox
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Adding the implicit wait
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		// Opening the website
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		// Adding the email
		WebElement email = driver.findElement(By.xpath("//input[@name='identifier']"));
		utility.wait(email, driver);
		email.sendKeys("saurabh@grappus.com");

		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(Keys.ENTER);

		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		utility.wait(password, driver);
		password.sendKeys("grappus123");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		// Tap on compose button
		WebElement compose = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		utility.wait(compose, driver);
		compose.click();

		WebElement addemail = driver.findElement(
				By.xpath("//div[@class='wO nr l1']//div[@class='aA6']//preceding-sibling::textarea[@rows=1]"));
		utility.wait(addemail, driver);
		addemail.sendKeys("saurabh2323@grappus.com");

		WebElement subject = driver.findElement(By.xpath("//input[@name=\"subjectbox\"]"));
		utility.wait(subject, driver);
		subject.sendKeys("test");

		// Tap on three dot icon
		driver.findElement(By.xpath(
				"/html/body/div[22]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[5]/div/div[1]/div/div[2]"))
				.click();
		Thread.sleep(3000);
		// Click on Label
		driver.findElement(By.xpath("//*[@id=\":ou\"]")).click();
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
