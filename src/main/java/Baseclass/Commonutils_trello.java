package Baseclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Commonutils_trello {

	public static WebDriver driver;

	public static void browserLaunch(String browser) {

		switch (browser) {
		case ("chrome"):
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ADMIN\\eclipse-workspace\\Interview\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}

	}

	public static void Url(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static WebElement findElementUsingId(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement findElementUsingName(String Name) {

		return driver.findElement(By.name(Name));

	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static WebElement findElementUsingXpath(String Xpath) {
		return driver.findElement(By.xpath(Xpath));

	}

	public static List<WebElement> findElementsUsingTagname(String tag) {
		return driver.findElements(By.tagName(tag));
	}

	@SuppressWarnings("deprecation")
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void threadSleep() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void drag(WebElement source, WebElement element) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, element);
	}

}
